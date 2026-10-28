package metodos.test;
import metodos.dominio.Estudante;

public class EstudanteTest02 {
    static void main (String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sanji";
        estudante02.idade = 20;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();
    }
}
