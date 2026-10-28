package associsacao.exercicio.test;

import associsacao.exercicio.dominio.Aluno;
import associsacao.exercicio.dominio.Professor;
import associsacao.exercicio.dominio.Seminario;

import java.util.Scanner;

public class Escola{
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE GESTÃO DE SEMINÁRIOS ===\n");

        Professor professor = Escola.cadastrarProfessor();
        Seminario seminario = Escola.cadastrarSeminario();
        professor.setSeminarios(new Seminario[]{seminario});

        System.out.println("\nGerando relatórios finais...\n");
        seminario.imprime();
        professor.imprime();
    }

    private static Professor cadastrarProfessor(){
        System.out.println("=== Cadastro de professor ===");

        System.out.println("Digite o nome do professor");
        String nomeProfessor = input.nextLine();

        System.out.println("Digite a especialização do professor: ");
        String especialidadeProfessor = input.nextLine();

        return new Professor(nomeProfessor, especialidadeProfessor);
    }

    private static Seminario cadastrarSeminario(){
        System.out.println("=== Cadastro Seminario e Aluno===");

        System.out.println("Digite o titulo do seminario: ");
        String tituloSeminario = input.nextLine();

        System.out.println("Digite o endereço do seminario: ");
        String endereco = input.nextLine();

        System.out.println("=== Aluno ===");

        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = input.nextLine();

        System.out.println("Digite a idade do aluno: ");
        int idadeAluno = input.nextInt();

        Aluno aluno = new Aluno(nomeAluno, idadeAluno);
        Aluno[] alunos = { aluno };

        Seminario seminario = new Seminario(tituloSeminario, endereco, alunos);
        aluno.setSeminario(seminario);

        return seminario;
    }
}
