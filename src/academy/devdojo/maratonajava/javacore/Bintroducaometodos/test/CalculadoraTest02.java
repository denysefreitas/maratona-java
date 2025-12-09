package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Multiplicação: ");
        calculadora.multiplicaDoisNumeros(5, 10F);
        // Aqui, a e b são argumentos
        System.out.println("------------------");
    }
}
