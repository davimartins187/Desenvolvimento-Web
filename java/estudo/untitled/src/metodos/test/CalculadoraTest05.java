package metodos.test;

import metodos.dominio.Calculadora;

public class CalculadoraTest05 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};

        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5);
    }
}
