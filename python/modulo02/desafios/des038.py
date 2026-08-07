# Escreva um programa que leia dois números inteiros e compare-os. mostrando na tala uma mensagem:

# - O primeiro valor é maior
# - O segundo valor é maior
# - Não existe valor maior, os dois são iguais

n1 = int(input('Digite o primeiro numero: '))
n2 = int(input('Digite o segundo numero: '))

if n1 > n2:
    print(f'O numero {n1} é maior que o numero {n2}')
elif n2 > n1:
    print(f'O numero {n2} é maior que o numero {n1}')
else:
    print('Os dois numeros são iguais !!!')