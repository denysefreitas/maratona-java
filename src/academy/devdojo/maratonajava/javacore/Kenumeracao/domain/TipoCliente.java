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

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoCliente : values()) {
            // values() retorna um array com todas as enums (PESSOA_FISICA, PESSOA_JURIDICA)
            if (tipoCliente.nomeRelatorio.equals(nomeRelatorio)) {
                // 1 - O tipoCliente recebe a enum de values() e a armazena momentaneamente (tome como e1, isto é, tipoCliente = e1)
                // 2 - O if compara se o ATRIBUTO nomeRelatorio da e1 é igual ao nomeRelatorio que foi passado como argumento
                // 3 - Se a condição for verdadeira, o método retorna e1 (PESSOA_FISICA)
                return tipoCliente;
            }
        }
        return null;
        // Nesse caso, após percorrer os enums, não foi encontrada nenhuma correspondência
    }

    public static TipoCliente tipoClientePorValor(int valor){
        for(TipoCliente tipoCliente : values()){
            if(tipoCliente.valor == valor){
                return tipoCliente;
            }
        }
        return null;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public int getValor() {
        return valor;
    }
}

