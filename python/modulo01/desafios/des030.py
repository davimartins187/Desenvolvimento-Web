# Crie um programa que leia um número inteiro a mostra na tala sa ala é PAR ou IMPAR.

numero = int(input('Digite um numero: '))

if numero % 2 == 1:
    print(f'O numero {numero} é impar')
elif numero % 2 == 0:
    print(f'O numero {numero} é par')
