package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("RYZEN 9", 3000);
        Tomate tomate = new Tomate("Cereja", 7.99);
        tomate.setDataValidade("20/01/2026");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
