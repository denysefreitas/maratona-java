package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Computador extends Produto {
    public static final double PORCENTAGEM_IMPOSTO = 0.21;

    public Computador(String name, double value) {
        super(name, value);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando o imposto do Computador");
        return this.value * PORCENTAGEM_IMPOSTO;
    }
}
