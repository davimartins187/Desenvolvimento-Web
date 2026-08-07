# Faça um programa que leia o comprimento do catteto oposto e do cateto adjacente de um triangulo retângulo, calcule e mostre o comprimento da hipotenusa.

from math import hypot

catOposto = int(input('Digite o valor do cateto oposto de um triangulo retângulo: '))
catAdjacente = int(input('Digite o valor do cateto adjacente de um triangulo retângulo: '))

hipotenusa = hypot(catOposto, catAdjacente)

print('A hipotenusa de um triangulo que mede {} no cateto oposto e {} no cateto adjacente mede {}'.format(catOposto, catAdjacente, hipotenusa))