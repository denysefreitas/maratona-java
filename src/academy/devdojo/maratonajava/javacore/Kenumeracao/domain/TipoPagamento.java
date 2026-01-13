package academy.devdojo.maratonajava.javacore.Kenumeracao.domain;
public enum TipoPagamento {
    DEBITO {
        @Override
        public double CalcularDesconto(double valor) {
            return valor * 0.1;
        }
    },
    CREDITO {
        @Override
        public double CalcularDesconto(double valor) {
            return valor * 0.05;
        }
    }, PIX;

    // Como PIX não sobrescreveu, é esperado que retorne 0 (método da própria enum)

    public double CalcularDesconto(double valor){
        return 0;
    }

    /* Se as opções fossem apenas DEBITO e CREDITO, o método nunca seria executado, somente aqueles que o sobrescrevem.
    * Nesse caso, o método seria escrito da seguinte forma:
    *
//    public abstract double CalcularDesconto(double valor);
    *
    * Isso porque ele, em si, não é implementado, pois ele foi criado para ser somente sobrescrito.
    * Por essa razão, OBRIGATORIAMENTE, o método não pode ter corpo. */
}
