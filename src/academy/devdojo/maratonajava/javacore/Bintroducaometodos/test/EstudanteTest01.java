package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.name = "Annabeth Chase";
        estudante01.age = 18;
        estudante01.sex = 'F';

        estudante02.name = "Percy Jackson";
        estudante02.age = 18;
        estudante02.sex = 'M';

//        System.out.println(estudante01.name);
//        System.out.println(estudante01.age);
//        System.out.println(estudante01.sex);
//
//        System.out.println("------------------------");
//
//        System.out.println(estudante02.name);
//        System.out.println(estudante02.age);
//        System.out.println(estudante02.sex);

        impressora.imprime(estudante01);
        System.out.println("-----------------------------");
        impressora.imprime(estudante02);

        System.out.println(estudante01.name);
        System.out.println(estudante02.name);
    }
}
