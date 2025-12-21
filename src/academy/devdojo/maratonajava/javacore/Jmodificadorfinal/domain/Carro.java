package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain;

public class Carro {
    // Adicionar final à classe evita que ela seja extendida

    private String name;
    public static final double VELOCIDADE_LIMITE = 250;
    // Usar o 'final' indica que a variável é uma constante, isto é, não pode ser alterada após a compilação.
    // Por convenção, use, para declarar: VARIAVEL_ETC
    // DEVE ser inicializado antes de ser usado; isso pode ocorrer nos blocos de inicialização ou nos construtores.

    public final Comprador COMPRADOR = new Comprador();

    public final void imprime(){
        System.out.println(this.name);
    }

    public Comprador getCOMPRADOR() {
        return COMPRADOR;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
