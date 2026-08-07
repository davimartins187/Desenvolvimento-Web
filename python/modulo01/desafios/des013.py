# Faça um algoritimo que leia o salário de um funcionario e mostre o seu novo salário, com 15% de aumento

salarioBase = float(input('Digite o salário do funcionario: '))
salarioComAcrescimo = salarioBase + (salarioBase * 0.15)

print('O salário final do funcionario é {}'.format(salarioComAcrescimo))