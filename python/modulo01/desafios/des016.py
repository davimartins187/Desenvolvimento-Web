# Crie um programa que leia um numero real pelo teclado e mostre na tela a sua porcão inteira

from math import floor

numeroReal = float(input('Digite um número real: '))
numeroInteiro = floor(numeroReal)

print('o número real é {} e a sua parte inteira é {}'.format(numeroReal, numeroInteiro))
