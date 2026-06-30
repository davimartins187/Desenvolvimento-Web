const resultadoJS = document.querySelector(".resultado")
const imgClima = document.querySelector(".imgClima")

async function buscar() {
    const inputCidadeJS = document.querySelector("#inputCidade").value
    if (!inputCidadeJS) return

    const urlGeo = `https://geocoding-api.open-meteo.com/v1/search?name=${inputCidadeJS}&count=1&language=pt`
    const respostaGeo = await fetch(urlGeo)
    const dadosGeo = await respostaGeo.json()

    console.log(dadosGeo)

    const latitude = dadosGeo.results[0].latitude
    const longitude = dadosGeo.results[0].longitude
    const nomeCidade = dadosGeo.results[0].name
    const pais = dadosGeo.results[0].country

    const urlClima = `https://api.open-meteo.com/v1/forecast?latitude=${latitude}&longitude=${longitude}&daily=temperature_2m_max,temperature_2m_min&current=temperature_2m&timezone=auto`
    const respostaClima = await fetch(urlClima)
    const dadosClima = await respostaClima.json()

    console.log(dadosClima)

    const atual = dadosClima.current.temperature_2m
    const maxima = dadosClima.daily.temperature_2m_max[0]
    const minima = dadosClima.daily.temperature_2m_min[0]

    if (atual <= 18) {
        imgClima.src = "./img/FrioClima.svg"
        imgClima.alt = "Está frio"
    } else if (atual <= 27) {
        imgClima.src = "./img/moderadoClima.svg"
        imgClima.alt = "Está agradável"
    } else {
        imgClima.src = "./img/quenteClima.svg"
        imgClima.alt = "Está quente"
    }

    resultadoJS.innerHTML = `
        <h1>${nomeCidade}, ${pais}</h1>
        <p>Agora: ${atual}°C</p>
        <p>Máxima: ${maxima}°C</p>
        <p>Mínima: ${minima}°C</p>
    `
}

document.querySelector("#botaoBuscar").addEventListener("click", buscar)