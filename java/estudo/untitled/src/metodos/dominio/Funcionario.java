package metodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double salario;
    private double mediaSalarial;

    public void imprimirDados(){
        System.out.println("-----------");

        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salario);

        System.out.println("-----------");
    }

    public void imprimirMediaSalarial(double[] salarios){

        double soma = 0;

        for(int numero = 0; numero < salarios.length; numero++){
            soma += salarios[numero];
        }

        mediaSalarial = soma / salarios.length;

        System.out.println("-----------");

        System.out.println("A media salarial é: " + mediaSalarial);

        System.out.println("-----------");
    }

    //SETTER

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //GETTER

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    public double getMediaSalarial() {
        return mediaSalarial;
    }
}
