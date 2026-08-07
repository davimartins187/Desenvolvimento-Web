# Crie um programa que leia o nome de uma cidade a diga se ela tem ou não nome "SANTO".

nomeCidade = input('Digite o nome da sua cidade: ')

verificacaoCidade = 'Santo' in nomeCidade.title()

print('A cidade {} tem a palavra "Santo"?  {}'.format(nomeCidade, verificacaoCidade))