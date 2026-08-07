# Desenvolva um programa que tenha o comprimento de três ratas a dizer ao usuário, pois pode ou não formar um triângulo.

r1 = int(input('Digite o valor da reta um: '))
r2 = int(input('Digite o valor da reta dois: '))
r3 = int(input('Digite o valor da reta tres: '))

somaRetas = r1 + r2 + r3

if somaRetas == 180:
    print('Os angulos que você digitou consegue formar um triangulo')
else:
    print('A soma dos angulos não formam um triangulo')