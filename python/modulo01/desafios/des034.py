# Escrava um programa que pergunta o salário de um Funcionário a calcule o valor do seu aumento.

# Para salários superiores a R$1.250.00, calcule um aumento de 10%.

# Para os inferiores ou iguais, o aumento é de 15%.

salarioBase = float(input('Digite o salário do funcionário: R$ '))

if salarioBase > 1250.00:
    aumento = salarioBase * 0.10  
else:
    aumento = salarioBase * 0.15 

novoSalario = salarioBase + aumento

print(f'O aumento foi de: R$ {aumento:.2f}')
print(f'O novo salário do funcionário é: R$ {novoSalario:.2f}')