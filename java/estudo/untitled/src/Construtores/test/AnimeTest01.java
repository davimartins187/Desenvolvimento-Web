package Construtores.test;

import Construtores.dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime("Naruto Classico", "TV", 200, "SHONNEN", "ShonneiJump");

        anime.imprime();
    }
}
