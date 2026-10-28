package associsacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public void imprime(){
        System.out.println(this.nome);

        if(time != null){
            System.out.println(time.getNome());
        }
        else{
            System.out.println("O jogador " + this.nome + " não esta associado a nenhum time");
        }
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Time getTime(){
        return time;
    }

    public void setTime(Time time){
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
