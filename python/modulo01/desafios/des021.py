# Faça um programa em python que abra e reproduza um o áudio de um arquivo MP3

import os
import pygame

musica = input("Digite o nome da música: ") + ".mp3"

pygame.init()
pygame.mixer.init()

pasta = os.path.dirname(__file__)

caminho = os.path.join(pasta, musica)

pygame.mixer.music.load(caminho)
pygame.mixer.music.play()

while pygame.mixer.music.get_busy():
    pygame.time.Clock().tick(10)