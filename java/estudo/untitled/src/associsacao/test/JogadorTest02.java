package associsacao.test;

import associsacao.dominio.Jogador;
import associsacao.dominio.Time;

public class JogadorTest02 {
    static void main(String[] args) {

        Jogador jogador = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        jogador.setTime(time);

        jogador.imprime();
    }
}
