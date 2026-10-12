package BlocosInicialização.test;

import BlocosInicialização.dominio.Anime;
import modificadosEstatico.test.CarroTest01;

public class AnimeTest {
    static void main(String[] args) {
        Anime anime = new Anime("One piece");

        anime.getNome();
        for (int episodeo : anime.getEpisodeos()){
            System.out.println(episodeo + " ");
        }
    }
}
