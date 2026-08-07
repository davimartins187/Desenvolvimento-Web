# faça um programa que leia a largura e a altura de uma parede em metros, cálcule a sua área e a qauntidade de tinta necessaria para pintá-la, sabendo que cada litro  de tinta, pinta uma area de 2m².

altura = int(input('Digite a altura de sua parede: '))
largura = int(input('Digite a largura de sua parede: '))

area = (altura * largura)
quantLatas = int(area  / 2)

print('A sua parede tem {}m² e são necessarias {} latas de tinta'.format(area, quantLatas))