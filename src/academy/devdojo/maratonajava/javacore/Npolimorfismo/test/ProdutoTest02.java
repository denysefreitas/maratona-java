package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("RYZEN 9", 3000);

        System.out.println(produto.getName());
        System.out.println(produto.getValue());
        System.out.println(produto.calcularImposto());
        // Imposto do computador, pois quem executa é sempre o OBJETO

        System.out.println("-------------------");

        Produto produto2 = new Tomate("Cereja", 7.99);

        System.out.println(produto2.getName());
        System.out.println(produto2.getValue());
        System.out.println(produto2.calcularImposto());
        // Imposto do tomate, pois quem executa é o OBJETO
    }
}
