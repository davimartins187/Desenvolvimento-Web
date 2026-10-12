package sobreCargaMetodos.test;

import sobreCargaMetodos.dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto Classico", "TV", 200, "SHONNEN");

        anime.imprime();
    }
}
