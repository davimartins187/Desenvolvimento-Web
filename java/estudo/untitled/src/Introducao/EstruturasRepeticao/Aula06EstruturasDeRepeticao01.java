package Introducao.EstruturasRepeticao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args){
        //while, do while, for

        int count = 0;

        while (count < 10){
            System.out.println("Contador: " + count);
            count++;
        }

        do{
            System.out.println("Contador: " + count);
            count++;
        }while (count < 10);

        for (count = 0 ; count < 10 ; count++){
            System.out.println("Contador: " + count);
        }

    }
}
