package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Quíron");
        Professor professor2 = new Professor("Dionísio");
        Professor[] professores = new Professor[]{professor1, professor2};
        Escola escola = new Escola("Camp Half-Blood", professores);

        escola.imprime();
    }
}
