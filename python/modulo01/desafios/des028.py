# Escrava um programa que faz o computador "pensar" em um número inteiro entre 0 a 5 a paça para o usuário tentar descobrir qual foi o número escolhido pelo computador.

# O programa deve escrever na tela seo usuário venceu ou perdeu

from random import randint

numeroComputador = randint(0, 5)
numeroUsuario = input('Digite um numero inteiro de 0 a 5:  ')

if numeroUsuario == numeroComputador:
    print('O computador escolheu: {}'.format(numeroComputador)) 
    print('Você ganhou!!')
else:
    print('O computador escolheu: {}'.format(numeroComputador))
    print('Você perdeu :(')