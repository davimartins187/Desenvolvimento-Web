package sobreCargaMetodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodeos;
    private String genero;

    public Anime(){

    }

    public void init(String nome, String tipo, int episodeos, String genero){
        this.nome = nome;
        this.tipo = tipo;
        this.episodeos = episodeos;
        this.genero = genero;
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
