package associsacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu nome abaixo: ");
        String nome = input.nextLine();

        System.out.println("Digite a sua idade abaixo: ");
        int idade = input.nextInt();

        System.out.println("DIgite M ou F para seu sexo abaixo: ");
        char sexo = input.next().charAt(0);

        System.out.println("========================");

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);

        System.out.println("=========================");
    }
}
