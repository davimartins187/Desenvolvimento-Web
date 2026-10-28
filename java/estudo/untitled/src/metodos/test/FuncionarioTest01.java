package metodos.test;
import metodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Funcionario funcionario01 = new Funcionario();
        Funcionario funcionario02 = new Funcionario();
        Funcionario funcionario03 = new Funcionario();

        Funcionario[] funcionarios = {funcionario01, funcionario02, funcionario03};

        funcionario01.setNome("Davi");
        funcionario02.setNome("Gato");
        funcionario03.setNome("Charlie Brown Junior");

        funcionario01.setIdade(17);
        funcionario02.setIdade(6);
        funcionario03.setIdade(42);

        funcionario01.setSalario(100.00);
        funcionario02.setSalario(200.00);
        funcionario03.setSalario(300.00);

        double[] salarios = {funcionario01.getSalario(), funcionario02.getSalario(), funcionario03.getSalario()};

        for (int i =  0; i < funcionarios.length; i++){
            funcionarios[i].imprimirDados();
        }

        funcionario03.imprimirMediaSalarial(salarios);
    }
}
