package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Tomate tomate = new Tomate("Italiano", 8.0);
        Computador computador = new Computador("NUC10i7", 11000);
        Televisao tv = new Televisao("Samsung 50\"", 5000);

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------------------");
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-----------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
