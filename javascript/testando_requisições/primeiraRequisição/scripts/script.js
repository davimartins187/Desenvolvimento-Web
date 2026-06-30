const url = "https://jsonplaceholder.typicode.com/posts";

const loadingElement = document.querySelector("#loading");
const postsContainer = document.querySelector("#post-container");

const postPage = document.querySelector("#post");
const postContainer = document.querySelector("#post-container");
const comentariosContainer = document.querySelector("#comments-container");

const formComentario = document.querySelector('#comment-form');
const emailInput = document.querySelector('#email');
const bodyInput = document.querySelector('#body');

const parametrosURL = new URLSearchParams(window.location.search);
const postId = parametrosURL.get("id");

async function recebendoTodosPosts() {
    const resposta = await fetch(url);
    const dados = await resposta.json();

    loadingElement.classList.add("hide");

    dados.forEach((posts) => {
        postsContainer.innerHTML += `
            <div>
                <h2>${posts.title}</h2>
                <p>${posts.body}</p>
                <a href="/post.html?id=${posts.id}">Ler</a>
            </div>
        `
    })
}

async function recebendoPost(id) {
    const [respostaPost, respostaComentario] = await Promise.all([
        fetch(`${url}/${id}`),
        fetch(`${url}/${id}/comments`)
    ])

    const dadosPost = await respostaPost.json();
    const dadosComentario = await respostaComentario.json();

    loadingElement.classList.add("hide");
    postPage.classList.remove("hide");

    const title = document.createElement("h2");
    const body = document.createElement("p");

    title.innerText = dadosPost.title;
    body.innerText = dadosPost.body;

    postContainer.appendChild(title);
    postContainer.appendChild(body);

    dadosComentario.forEach((comentario) => {
        CriarComentario(comentario)
    });
}

function CriarComentario(comentario) {
    comentariosContainer.innerHTML += `
        <div>
            <h3>${comentario.email}</h3>
            <p>${comentario.body}</p>
        </div>
    `
}

async function postarComentario(comentario) {
    const resposta = await fetch(`${url}/${postId}/comments`, {
        method: "POST",
        body: JSON.stringify(comentario),
        headers: {
            "content-type": "application/json",
        },
    })

    const dados = await resposta.json();

    CriarComentario(dados)
}

if (postId === null) {
    recebendoTodosPosts()
} else {
    recebendoPost(postId)

    if (formComentario) {
        formComentario.addEventListener("submit", (e) => {
            e.preventDefault();

            let comentario = {
                email: emailInput.value,
                body: bodyInput.value
            };

            postarComentario(comentario);
        })
    }
}