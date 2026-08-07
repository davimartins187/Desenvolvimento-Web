# Escrava um programa que lia um número inteiro qualquer a paça para o usuário escolher qual será a base de conversão:

# - 1 para
# - 2 para octal
# - 3 para hexadecimal

numeroOriginal = int(input('Digite um número que será convertido: '))

print('Escolha a sua base de conversão: \n (1) Binário \n (2) Octal \n (3) Hexadecimal')

processoEscolhido = input('Digite a base de conversão: ')

if processoEscolhido == '1':
    numeroBin = bin(numeroOriginal)[2:]
    print('O número {} convertido para binário é {}'.format(numeroOriginal, numeroBin))

elif processoEscolhido == '2':
    numeroOct = oct(numeroOriginal)[2:]
    print('O número {} convertido para octal é {}'.format(numeroOriginal, numeroOct))

elif processoEscolhido == '3':
    numeroHexa = hex(numeroOriginal)[2:]
    print('O número {} convertido para hexadecimal é {}'.format(numeroOriginal, numeroHexa))

else:
    print('Opção inválida! Por favor, escolha 1, 2 ou 3.')