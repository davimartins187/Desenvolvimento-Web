package JavaPOO.test;

import JavaPOO.dominio.Carro;

public class CarroTest02 {
    public static void main(String[] args) {

        Carro novoCarro = new Carro();

        novoCarro.nome = "Porsche 911";
        novoCarro.modelo = "GT3 RS";
        novoCarro.ano = 2023;

        System.out.println(novoCarro.nome);
        System.out.println(novoCarro.modelo);
        System.out.println(novoCarro.ano);
    }
}
