nome = str(input('Digite seu nome completo: ')).strip()

nome_fatiado = nome.split()
primeiro_nome = nome_fatiado[0]
ultimo_nome = nome_fatiado[-1]

print(f'Muito prazer em te conhecer!')
print(f'Seu primeiro nome é {primeiro_nome}')
print(f'Seu último nome é {ultimo_nome}')