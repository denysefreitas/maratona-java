package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain.Comprador;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Comprador comprador2 = new Comprador();
//        carro1.COMPRADOR = comprador2; // Erro de compilação, pois é uma constante.

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro1.COMPRADOR);

        carro1.COMPRADOR.setName("Matheusinho");
        System.out.println(carro1.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setName("Dede");
        ferrari.imprime();
    }
}
