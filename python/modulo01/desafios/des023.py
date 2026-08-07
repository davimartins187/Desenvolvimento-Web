# Faça um programa que leia um número de 55 99999 a mostre na tala cada um dos dígitos separados.

# Ex:
# Digite um número: 1834

# unidade: 4
# dezena: 3
# centena: 8
# milhar: 1

numeroDigitado = input('Digite um número de 0 a 9999: ')

unidadeNumero = numeroDigitado[0]
dezenaNumero = numeroDigitado[1]
centenaNumero = numeroDigitado[2]
milharNumero = numeroDigitado[3]

print('Unidade: {}'.format(unidadeNumero))
print('Dezena: {}'.format(dezenaNumero))
print('Centena: {}'.format(centenaNumero))
print('Milhar: {}'.format(milharNumero))
