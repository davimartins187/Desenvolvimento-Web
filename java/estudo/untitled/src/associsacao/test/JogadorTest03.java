package associsacao.test;

import associsacao.dominio.Jogador;
import associsacao.dominio.Time;

public class JogadorTest03 {
    static void main(String[] args) {

        Jogador jogador = new Jogador("Naruto");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador};

        jogador.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");

        jogador.imprime();

        System.out.println("--- Time ---");

        time.imprime();
    }
}
