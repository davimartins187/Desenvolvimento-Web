package Introducao.EstruturasRepeticao;

public class Aula06EstruturasDeRepeticao03 {
    //Imprima os primeiros 25 numeros de um dado valor. Por exemplo 50

    public static void main(String[] args){

        int numeroEscolhido = 50;

        for (int contador = 0 ; contador <= numeroEscolhido; contador++){

            if (contador <= 25){
                System.out.println(contador);
            }
            else{
                break;
            }
        }
    }
}
