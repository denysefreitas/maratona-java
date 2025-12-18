package academy.devdojo.maratonajava.javacore.Gassociacao.testExercicio;

import academy.devdojo.maratonajava.javacore.Gassociacao.domainExercicio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.domainExercicio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.domainExercicio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.domainExercicio.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local local1 = new Local("Estádio Mineirão");
        Local local2 = new Local("Estádio Independência");

        Aluno aluno1 = new Aluno("Denyse", 20);
        Aluno aluno2 = new Aluno("Ana", 18);
        Aluno aluno3 = new Aluno("Andrey", 17);
        Aluno[] alunosParaVerSeminario1 = new Aluno[]{aluno1, aluno2, aluno3};
        Aluno[] alunosParaVerSeminario2 = new Aluno[]{};

        Seminario seminario1 = new Seminario("Seminario Git/GitHub", local1);
        Seminario seminario2 = new Seminario("Seminario Java", local2);
        Seminario seminario3 = new Seminario("Seminario HTML");

        Seminario[] seminariosDisponiveis = new Seminario[]{seminario1, seminario3, seminario2};

        Professor professor = new Professor("William Suane", "Programação");

        seminario1.setAlunos(alunosParaVerSeminario1);
        seminario2.setAlunos(alunosParaVerSeminario2);
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
