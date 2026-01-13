package academy.devdojo.maratonajava.javacore.Kenumeracao.test;

import academy.devdojo.maratonajava.javacore.Kenumeracao.domain.Cliente;
import academy.devdojo.maratonajava.javacore.Kenumeracao.domain.TipoPagamento;
import academy.devdojo.maratonajava.javacore.Kenumeracao.domain.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Matheus Pereira", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente02 = new Cliente("Kaio Jorge", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente01);
        System.out.println(cliente02);

        System.out.println("-------------------");

        System.out.println("Desconto no Débito: " + TipoPagamento.DEBITO.CalcularDesconto(100));
        System.out.println("Desconto no Crédito: " + TipoPagamento.CREDITO.CalcularDesconto(100));
        System.out.println("Desconto no Pix: " + TipoPagamento.PIX.CalcularDesconto(100));

        System.out.println("-------------------");

        TipoCliente tipoCliente01 = TipoCliente.valueOf("PESSOA_FISICA");

        // 1 - Transforma PESSOA_FISICA em String (via valueOf)
        // 2 - Armazena o String na variável chamada tipoCliente
        System.out.println(tipoCliente01.getNomeRelatorio());
        // Como tipoCliente é PESSOA_FISICA, a enum é capaz de reconhecer e, por isso, o método consegue ser executado

//        int a = 111;
//        System.out.println(String.valueOf(a));

        System.out.println("-------------------");
        TipoCliente tipoCliente02 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente02);
        TipoCliente tipoCliente03 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física9540");
        System.out.println(tipoCliente03);

        System.out.println("-------------------");
        TipoCliente tipoCliente04 = TipoCliente.tipoClientePorValor(1);
        System.out.println(tipoCliente04);
        TipoCliente tipoCliente05 = TipoCliente.tipoClientePorValor(0);
        System.out.println(tipoCliente05);
    }
}
