# escreva um programa que leia um valor em metros e o exiba convertiduo em centimetros e melimetros.

metros = float(input('Digite um valor em metros: '))

centimetros = int(metros * 100)
milimetros = int(metros * 1000)

print('O valor que você digitou é {} \n Em centimetros é {} \n em milimetros é {}'.format(metros, centimetros, milimetros))