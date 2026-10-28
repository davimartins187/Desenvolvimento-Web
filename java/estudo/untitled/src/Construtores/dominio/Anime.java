package Construtores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodeos;
    private String genero;
    private String estudio;

    public Anime(String nome, String tipo, int episodeos, String genero){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodeos = episodeos;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodeos, String genero, String estudio){
        this(nome, tipo, episodeos, genero);
        this.estudio = estudio;
    }

    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodeos);
        System.out.println(this.genero);
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setEpisodeos(int episodeos){
        this.episodeos = episodeos;
    }

    public int getEpisodeos(){
        return this.episodeos;
    }
}
