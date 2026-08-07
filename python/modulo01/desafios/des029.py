# Escreva um programa que leia a velocidade de um carro.
# Sa ale ultrapassa 80km/h. mostra uma mensagem dizendo que ela foi multada.

# A multa vai custar R$7,00 por cada Km acima do limite

velCarro = int(input('Digite a velocidade do carro: '))
kmAcima = velCarro - 80
valorMulta = kmAcima * 7

if velCarro > 80:
    print('Você foi multado!!')
    print(f'O valor da multa é R${valorMulta:.2f}')
else:
    print(f'Você esta á {velCarro} e esta  dentro do limite ccontinue assim.')