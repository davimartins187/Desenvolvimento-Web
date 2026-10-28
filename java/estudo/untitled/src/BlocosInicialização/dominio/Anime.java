package BlocosInicialização.dominio;

public class Anime {
    private String nome;
    private int[] episodeos;

    {
        System.out.println("Dentro do bloco de inicialização");
        episodeos = new int[100];
        for(int i = 0; i < episodeos.length; i++){
            episodeos[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodeos() {
        return episodeos;
    }

    public void setEpisodeos(int[] episodeos) {
        this.episodeos = episodeos;
    }
}
