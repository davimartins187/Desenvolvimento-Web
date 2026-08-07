# Desenvolva um programa que pargunta a distância da uma viagem em Km.

# Calcula o praço da passagem. Cobrando R$0,50 por Km para viagens de até 200Km a R$0,45 para viagens mais longas

distancia = int(input('Digite a distancia da viagem em KM: '))

if distancia <= 200:
    valorPassagemPorKm = 0.5
    valorTotal = valorPassagemPorKm * distancia
    print(f'A sua viagem de {distancia}KM deu um total de: {valorTotal}')
elif distancia > 200:
    valorPassagemPorKm = 0.45
    valorTotal = valorPassagemPorKm * distancia
    print(f'A sua viagem de {distancia}KM deu um total de: {valorTotal}')