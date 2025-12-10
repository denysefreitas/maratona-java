package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.name = "Annabeth Chase";
        estudante01.age = 18;
        estudante01.sex = 'F';

        estudante02.name = "Percy Jackson";
        estudante02.age = 18;
        estudante02.sex = 'M';

        estudante01.imprime();
        estudante02.imprime();
    }
}
