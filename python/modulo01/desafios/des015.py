# Escreva um algoritimo que pergunte a quantidade de KM percorridos por um carro alugado e a qautidade de dias pelos quais ele fiu alugado. Calcule o preço a pagar, sabendo que o carro custa R$60 por dia e R$0,15 por KM rodado.

quantDias = int(input('Quantos dias o carro foi alugado? '))
quantKm = int(input('Qauntos Km rodados? '))

valorDias = quantDias * 60
valorKm = quantKm * 0.15

valorTotal = valorDias + valorKm

print('O total a pagar é de R${:.2f}'.format(valorTotal))