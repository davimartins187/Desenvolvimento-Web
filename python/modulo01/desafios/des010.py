# Crie um programa que leia quanto dinheiro uma pessoa tem na carteira e mostre quantos dólares ela pode comprar.

dinheiro = int(input('Digite o valor que você tem: '))

print('Com o valor {} você pode comprar {} Dólares'.format(dinheiro, dinheiro / 3.27))