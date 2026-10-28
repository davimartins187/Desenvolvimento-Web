package associsacao.test;

import associsacao.dominio.Escola;
import associsacao.dominio.Professor;

public class EscolaTest01 {
    static void main(String[] args) {

        Professor professor = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");
        Professor[] professores = {professor, professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
