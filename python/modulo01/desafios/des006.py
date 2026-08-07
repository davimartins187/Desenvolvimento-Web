# Crie um algoritimo que leia um numero e mostre o seu dobro, triplo e raiz quadrada

n1 = int(input('Digite um número inteiro: '))

print('O dobro do número {} é {}'.format(n1, n1*2))
print('O triplo do número {} é {}'.format(n1, n1*3))
print('A raiz quadrada do número {} é {:.2f}'.format(n1, (n1**(1/2))))
