package metodos.test;

import metodos.dominio.Estudante;
import metodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante imprimirEstudante = new ImpressoraEstudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo= 'M';

        estudante02.nome = "Sanji";
        estudante02.idade = 20;
        estudante02.sexo= 'M';

        imprimirEstudante.imprime(estudante01);
        imprimirEstudante.imprime(estudante02);
    }
}
