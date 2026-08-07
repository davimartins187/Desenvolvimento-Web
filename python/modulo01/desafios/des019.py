# Um professor quer sortear um dos seus alunos para apagar o quadro. Faça um programa que ajude ele, lendo o nome deles e escrecendo o nome escolhido

from random import choice

aluno01 = input('Digite o nome do primeiro aluno: ')
aluno02 = input('Digite o nome do segundo aluno: ')
aluno03 = input('Digite o nome do terceiro aluno: ')
aluno04 = input('Digite o nome do quarto aluno: ')

alunoEscolhido = choice([aluno01, aluno02, aluno03, aluno04])

print('O professor escolheu o aluno {}'.format(alunoEscolhido))