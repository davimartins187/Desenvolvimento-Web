package metodos.test;
import metodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Funcionario funcionario01 = new Funcionario();
        Funcionario funcionario02 = new Funcionario();
        Funcionario funcionario03 = new Funcionario();

        Funcionario[] funcionarios = {funcionario01, funcionario02, funcionario03};

        funcionario01.nome = "Davi";
        funcionario02.nome = "Gato";
        funcionario03.nome = "Charlie Brown Junior";

        funcionario01.idade = 17;
        funcionario02.idade = 6;
        funcionario03.idade = 42;

        funcionario01.salario= 100.00;
        funcionario02.salario= 200.00;
        funcionario03.salario= 300.00;

        double[] salarios = {funcionario01.salario, funcionario02.salario, funcionario03.salario};

        for (int i =  0; i < funcionarios.length; i++){
            funcionarios[i].imprimirDados();
        }

        funcionario03.imprimirMediaSalarial(salarios);
    }
}
