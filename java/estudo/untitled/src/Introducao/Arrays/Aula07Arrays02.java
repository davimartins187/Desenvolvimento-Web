package Introducao.Arrays;

public class Aula07Arrays02 {
    static void main(String[] args) {

        /*
            byte, short, int, long, float e double -> 0
            char -> '\u00000'
            boolean -> false
            String -> null
         */

        String [] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Naruto";
        nomes[2] = "Luffy";

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
