package metodos.test;

import metodos.dominio.Calculadora;

public class CalculadoraTest04 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int a = 1;
        int b= 2;

        calculadora.alterarNumeros(a, b);
        System.out.println("Dentro CalculadoraTest04");
        System.out.println("Num1 " + a);
        System.out.println("Num2 " + b);
    }
}
