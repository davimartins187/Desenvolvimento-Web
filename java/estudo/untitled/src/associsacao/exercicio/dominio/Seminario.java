package associsacao.exercicio.dominio;

public class Seminario {
    private String titulo;
    private String  endereco;
    private Aluno[] alunos;

    //Construtores
    public Seminario(String titulo, String  esdereco){
        this.titulo = titulo;
        this.endereco = esdereco;
    }

    public Seminario(String titulo, String endereco, Aluno[] alunos){
        this.titulo = titulo;
        this.endereco = endereco;
        this.alunos = alunos;
    }

    //Metodos
    public void imprime(){
        System.out.println("----------------------------------------");
        System.out.println("           DADOS DO SEMINÁRIO           ");
        System.out.println("----------------------------------------");
        System.out.println("Título   : " + this.titulo);
        System.out.println("Endereço : " + this.endereco);

        if (alunos == null || alunos.length == 0) {
            System.out.println("Alunos   : Nenhum aluno inscrito.");
            System.out.println("----------------------------------------\n");
            return;
        }

        System.out.println("Alunos participantes:");
        for (Aluno aluno : alunos){
            if (aluno != null) {
                System.out.println("  -> " + aluno.getNome() + " (" + aluno.getIdade() + " anos)");
            }
        }
        System.out.println("----------------------------------------\n");
    }

    //Setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAlunos(Aluno[] alunos){
        this.alunos = alunos;
    }

    public void setEndereco(String  endereco){
        this.endereco = endereco;
    }

    //Getters
    public String getTitulo(){
        return this.titulo;
    }

    public Aluno[] getAlunos(){
        return this.alunos;
    }

    public String getEndereco(){
        return this.endereco;
    }
}
