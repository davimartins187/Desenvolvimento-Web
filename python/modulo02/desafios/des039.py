# Faça um programa que leia o ano de nascimento de um jovem a informa. da concordância com sua idade:

# - Se ale ainda vai se alistar ao serviço militar.
# - Sa é a hora de se alistar.
# - Se já passou do tempo do alistamento.

# Seu programa também deverá mostrar o tempo que falta ou que passou do prazo

from datetime import date

dataNascimento = int(input('Digite o ano em que você nasceu: '))
dataAtual = date.today().year

idade = dataAtual - dataNascimento

if idade < 18:
    quantAnosFaltando = 18 - idade
    print('Você ainda não precisa se preocupar.')
    print(f'Ainda faltam {quantAnosFaltando} ano(s) para você se alistar ao serviço militar.')

elif idade == 18:
    print('Está na hora de você se alistar ao serviço militar!')

else:
    quantAnosPassados = idade - 18
    print('Já passou do tempo de você se alistar ao serviço militar.')
    print(f'Você deveria ter se alistado há {quantAnosPassados} ano(s).')