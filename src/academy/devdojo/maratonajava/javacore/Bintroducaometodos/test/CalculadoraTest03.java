package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Divisão: ");
        double result = calculadora.divideDoisNumeros(21.0, 3.0);
        System.out.println(result);
        System.out.println("------------------");

        System.out.println(calculadora.divideDoisNumeros02(21.0, 3.0));
        System.out.println("------------------");
        System.out.println(calculadora.divideDoisNumeros02(21.0, 0.0));
        System.out.println("------------------");

        System.out.println(calculadora.divideDoisNumeros03(21.0, 3.0));
        System.out.println("------------------");
        System.out.println(calculadora.divideDoisNumeros03(21.0, 0.0));
        System.out.println("------------------");

        calculadora.imprimeDivisaoDeDoisNumeros03(21.0, 3.0);
        System.out.println("------------------");

        System.out.println("Finalizando CalculadoraTest03");
    }
}
