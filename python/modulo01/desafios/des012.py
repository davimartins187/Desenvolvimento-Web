# Faça um algoritimo que leia o preço de um produto e mostre seu novo preço, com 5% de desconto.

produtoSemDesconto = float(input('Digite o preço do produto: '))
produtoComDesconto = produtoSemDesconto - (produtoSemDesconto * 0.05)

print('O valor do produto com desconto é {}'.format(produtoComDesconto))