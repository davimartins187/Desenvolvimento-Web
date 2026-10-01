package JavaPOO.test;
import JavaPOO.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

         Carro novoCarro = new Carro();

         novoCarro.nome = "Missan GT-R";
         novoCarro.modelo = "R35";
         novoCarro.ano = 2024;

        System.out.println(novoCarro.nome);
        System.out.println(novoCarro.modelo);
        System.out.println(novoCarro.ano);
    }
}
