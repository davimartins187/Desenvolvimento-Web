package metodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double salario;

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

        double mediaSalarial = soma / salarios.length;

        System.out.println("-----------");

        System.out.println("A media salarial é: " + mediaSalarial);

        System.out.println("-----------");
    }
}
