package associsacao.test;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("O grande softwaree de previsão do futuro");
        System.out.println("Digite a sua pergunta e eu responderei sim ou não");

        String pergunta = input.nextLine();

        if (pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        }else{
            System.out.println("NÃO");
        }
    }
}
