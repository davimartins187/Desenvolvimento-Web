package classes.test;
import classes.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

         Carro novoCarro1 = new Carro();
         Carro novoCarro2 = new Carro();

         novoCarro1.nome = "Missan GT-R";
         novoCarro1.modelo = "R35";
         novoCarro1.ano = 2024;

        novoCarro2.nome = "Porsche 911";
        novoCarro2.modelo = "GT3 RS";
        novoCarro2.ano = 2023;

        System.out.println(novoCarro1.nome);
        System.out.println(novoCarro1.modelo);
        System.out.println(novoCarro1.ano);

        System.out.println(novoCarro2.nome);
        System.out.println(novoCarro2.modelo);
        System.out.println(novoCarro2.ano);
    }
}
