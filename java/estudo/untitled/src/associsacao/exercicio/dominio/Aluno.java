package associsacao.exercicio.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;


    //Construtores
    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade, Seminario seminario){
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }

    //Metodos
    public void imprime(){
        System.out.println("----------------------------------------");
        System.out.println("             FICHA DO ALUNO             ");
        System.out.println("----------------------------------------");
        System.out.println("Nome      : " + this.nome);
        System.out.println("Idade     : " + this.idade + " anos");

        if (seminario == null) {
            System.out.println("Seminário : Nenhum seminário associado.");
        } else {
            System.out.println("Seminário : " + seminario.getTitulo());
        }
        System.out.println("----------------------------------------\n");
    }

    //Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setSeminario(Seminario seminario){
        this.seminario = seminario;
    }

    //Getters
    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public Seminario getSeminario(){
        return this.seminario;
    }
}
