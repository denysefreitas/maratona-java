package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Televisao extends Produto{
    public static final double PORCENTAGEM_IMPOSTO = 0.21;

    public Televisao(String name, double value) {
        super(name, value);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando o imposto da Televisão");
        return this.value * PORCENTAGEM_IMPOSTO;
    }
}
