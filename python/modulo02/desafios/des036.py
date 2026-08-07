# Escreva um programa para aprovar o ampréstimo bancário para a compra de uma casa. O programa vai perguntar o valor da casa, o equivalente do comprador e em quantos anos ale vai pagar.

# Calcule o valor da prestasão mensal, sabendo que ela não pode exceder 30% do tipo ou então o empréstimo será negado

valorCasa = float(input('Digite o valor da casa: '))
salario = float(input('Digite o seu salário: '))
quantAnos = int(input('Digite em quantos anos vai pagar a casa: '))

quantMeses = quantAnos * 12
valorLimite = salario * 0.3
valorMensalidade = valorCasa / quantMeses

print(f'\nPara pagar uma casa de R$ {valorCasa:.2f} em {quantAnos} anos, a prestação será de R$ {valorMensalidade:.2f}.')
print(f'O limite máximo permitido para sua renda é de R$ {valorLimite:.2f}.')

if valorLimite >= valorMensalidade:
    print('Emprestimo APROVADO!!!')
else:
    print('Empréstimo NEGADO! A prestação excede 30% do  seu salário.')
