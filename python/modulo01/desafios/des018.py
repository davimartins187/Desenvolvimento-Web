# Faça um programa que leia um ângulo qualquer e mostre na tela o valor do seno, cosseno e tangente desse ângulo.

from math import sin, cos, tan, radians

angulo = int(input('Digite o valor de um ângulo: '))

anguloRadianos = radians(angulo)

seno = sin(anguloRadianos)
cosseno = cos(anguloRadianos)
tangente = tan(anguloRadianos)

print('O ângulo {:.3f} tem \n seno de {:.3f} \n cosseno de {:.3f} \n tangente de {}'.format(angulo, seno, cosseno, tangente))