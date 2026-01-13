package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente01 = new Gerente("Annabeth Chase", 5000);
        Desenvolvedor desenvolvedor01 = new Desenvolvedor("Percy Jackson", 2500);

        System.out.println(gerente01);
        System.out.println(desenvolvedor01);
    }
}
