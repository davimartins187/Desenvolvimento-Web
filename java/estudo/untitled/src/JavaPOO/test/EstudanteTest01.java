package JavaPOO.test;

import JavaPOO.dominio.Estudante;

public class EstudanteTest01 {
    static void main(String[] args) {
        Estudante novoEstudante = new Estudante();

        novoEstudante.idade = 17;
        novoEstudante.nome = "Davidson";
        novoEstudante.sexo = 'M';

        System.out.println(novoEstudante.idade);
        System.out.println(novoEstudante.nome);
        System.out.println(novoEstudante.sexo);
    }
}
