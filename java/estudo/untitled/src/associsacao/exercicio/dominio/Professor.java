package associsacao.exercicio.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    //Construtores
    public Professor(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios){
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    //Metodos
    public void imprime(){
        System.out.println("----------------------------------------");
        System.out.println("          RELATÓRIO DO PROFESSOR        ");
        System.out.println("----------------------------------------");
        System.out.println("Nome          : " + this.nome);
        System.out.println("Especialidade : " + this.especialidade);

        if (seminarios == null || seminarios.length == 0){
            System.out.println("Seminários    : Nenhum cadastrado.");
            System.out.println("----------------------------------------\n");
            return;
        }

        System.out.println("Seminários sob sua responsabilidade:");
        for (Seminario seminario : seminarios){
            if (seminario != null) {
                System.out.println("  -> " + seminario.getTitulo());
            }
        }
        System.out.println("----------------------------------------\n");
    }

    //Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public void setSeminarios(Seminario[] seminarios){
        this.seminarios = seminarios;
    }

    //Getters
    public String getNome(){
        return this.nome;
    }

    public String getEspecialidade(){
        return this.especialidade;
    }

    public Seminario[] getSeminarios(){
        return this.seminarios;
    }
}
