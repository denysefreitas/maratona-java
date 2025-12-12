package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int []numbers = {5, 10, 15, 20, 25};

        calculadora.somaArray(numbers);
        calculadora.somaVarArgs(5, 10, 15, 20, 25);
    }
}
