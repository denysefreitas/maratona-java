package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.RepositorioBancoDeDados;

public class ProdutoTest04 {
    public static void main(String[] args) {
        Repositorio repositorio01 = new RepositorioBancoDeDados();
        repositorio01.salvar();
        // Usar Repositorio garante que, se houver troca por qualquer outro 'service', o código permanece funcional
    }
}
