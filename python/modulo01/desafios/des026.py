frase = str(input('Digite uma frase: ')).strip().upper()

quantidadeA = frase.count('A')
primeiraPosicao = frase.find('A') + 1
ultimaPosicao = frase.rfind('A') + 1

print(f'A letra "A" aparece {quantidadeA} vezes na frase.')
print(f'A primeira letra "A" apareceu na posição {primeiraPosicao}.')
print(f'A última letra "A" apareceu na posição {ultimaPosicao}.')