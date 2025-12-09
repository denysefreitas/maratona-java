package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Calculadora calculadora2 = new Calculadora();

        System.out.println("Soma: ");
        calculadora.somaDoisNumeros();
        System.out.println("------------------");

        System.out.println("Subtração: ");
        calculadora2.subtraiDoisNumeros();
        System.out.println("------------------");

        System.out.println("Finalizando CalculadoraTest01");
    }
}
