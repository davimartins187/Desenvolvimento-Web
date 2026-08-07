# Crie um programa que leia o nome completo de uma pessoa e mostre:

# O nome com todas as letras
# O nome com todas as minúsculas.
# Quantas letras ao todo (sem considerar espaços).
# Quantas letras são o primeiro nome.

nome = input('Digite o seu nome completo: ')
nomeMinusculo = nome.lower()
nomeSemEspaço = len(nome.replace(" ", ""))
NomeDividido = nome.split()
primeiroNome = len(NomeDividido[0])

print(nome)
print(nomeMinusculo)
print(nomeSemEspaço)
print(primeiroNome)