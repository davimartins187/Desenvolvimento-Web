# Cria um programa que leia duas notas de um aluno a calcule sua média, mostrando uma mensagem no final, da acordo com a média atingida:

# - Média abaixo de 5.0:
# REPROVADO

# - Média entre 5.0 g 6.9:
# RECUPERAÇÃO

# - Média 7.0 ou superior:
# APROVADO

nota1 = float(input('Digite a primeira nota: '))
nota2 = float(input('Digite a segunda nota: '))

media = (nota1 + nota2) / 2

print(f'Sua média foi {media:.1f}')

if media < 5.0:
    print('REPROVADO !!!!')
elif media < 7.0:  
    print('RECUPERAÇÃO !!!!')
else:              
    print('APROVADO !!!!')