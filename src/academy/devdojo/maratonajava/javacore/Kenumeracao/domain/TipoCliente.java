package academy.devdojo.maratonajava.javacore.Kenumeracao.domain;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private final int valor;
    private final String nomeRelatorio;

    /*
    * Preferencialmente, declare os atributos como PRIVATE e FINAL; não crie métodos SET, somente GET
    * O modificador FINAL garante que o valor atribuído não poderá ser alterado após a inserção
    * O modificador PRIVATE impede o acesso direto ao atributo, tornando obrigatório o acesso controlado via méotodo GET (encapsulamento)
    */

    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public int getValor() {
        return valor;
    }
}

