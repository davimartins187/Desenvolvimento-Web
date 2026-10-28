package modificadosEstatico.test;

import modificadosEstatico.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args){
        Anime anime1 = new Anime("One piece");
        Anime anime2 = new Anime("Naruto");
        Anime anime3 = new Anime("Dragon Ball Z");

        anime1.getEpisodeos();
        anime2.getEpisodeos();
        anime3.getEpisodeos();
    }
}
