package Introducao.EstruturaCondicionais;

public class Aula05EstruturasCondicionais02 {

    /*
        idade < 15 categoria infantil
        idade >= 15 && idade < 18 categoria juvenil
        idade >= 18 categoria adulto
     */

    public static void main(String[] args){

        int idade = 15;
        String categoria;

        if (idade > 15){
            categoria = "Infantil";
        }
        else if (idade >= 15 && idade < 18) {
            categoria = "Juvenil";
        }
        else{
            categoria = "Adulto";
        }

        System.out.println("Você esta na categoria: " + categoria);
    }
}
