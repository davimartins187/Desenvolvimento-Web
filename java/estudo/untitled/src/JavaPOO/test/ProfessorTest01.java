package JavaPOO.test;

import JavaPOO.dominio.Professor;

public class ProfessorTest01 {
    static void main(String[] args) {
        Professor novoProfessor = new Professor();

        novoProfessor.nome = "Mestre kame";
        novoProfessor.idade = 140;
        novoProfessor.sexo = "m";

        System.out.println(novoProfessor.nome + " " + novoProfessor.idade + " " + novoProfessor.sexo);

    }
}
