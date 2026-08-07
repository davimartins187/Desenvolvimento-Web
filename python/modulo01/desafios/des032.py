# programa Faça um qua laia um ano qualquer a mostra se ala é BISSEXTO.

ano = input('Digite algum ano: ')

if (ano % 4 == 0 and ano % 100 != 0) or (ano % 400 == 0):
    print("É um ano bissexto")
else:
    print("Não é bissexto")
