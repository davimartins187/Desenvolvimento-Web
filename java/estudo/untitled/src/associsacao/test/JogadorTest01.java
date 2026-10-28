package associsacao.test;

import associsacao.dominio.Jogador;

public class JogadorTest01 {
    static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Cafu");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (int i = 0; i < jogadores.length; i++) {
            jogadores[i].imprime();
        }
    }
}
