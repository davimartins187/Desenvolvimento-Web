package associsacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public void imprime(){

        System.out.println(this.nome);
        if (jogadores == null){
            return;
        }

        for (int i = 0; i < jogadores.length; i++) {
            System.out.println(jogadores[i].getNome());
        }
    }

    public Jogador[] getJogadores(){
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores){
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
