# Crie um programa que leia o nome de uma pessoa e diga sa ala tem "Silva" no nome.

nome = input('Digite o seu nome completo: ')
nomeFormatado = nome.title()
verificacaoNome = 'Silva' in nome.title()

print('O nome {} possui ou não a palavra "Silva"?  {}'.format(nomeFormatado, verificacaoNome))