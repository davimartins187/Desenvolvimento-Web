# O  mesmo professor do desafio anterior quer sortear a ordem da apresentação dos trabalhos dos alunos. Faça um programa que leia o nome dos quatro alunos e mostre a ordem sorteada.

import random

aluno01 = input('Digite o nome do aluno: ')
aluno02 = input('Digite o nome do aluno: ')
aluno03 = input('Digite o nome do aluno: ')
aluno04 = input('Digite o nome do aluno: ')

alunos = [aluno01, aluno02, aluno03, aluno04]
sortearOrdem = random.sample(alunos, 4)

print('O primeiro a apresentar o trabalho: {}'.format(sortearOrdem[0]))
print('O segundo a apresentar o trabalho: {}'.format(sortearOrdem[1]))
print('O terceiro a apresentar o trabalho: {}'.format(sortearOrdem[2]))
print('O quarto a apresentar o trabalho: {}'.format(sortearOrdem[3]))