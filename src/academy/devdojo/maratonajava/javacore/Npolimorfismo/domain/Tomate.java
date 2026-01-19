package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Tomate extends Produto {
    public static final double PORCENTAGEM_IMPOSTO = 0.06;
    private String dataValidade;

    public Tomate(String name, double value) {
        super(name, value);
    }

    public Tomate(String name, double value, String dataValidade) {
        super(name, value);
        this.dataValidade = dataValidade;
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando o imposto do Tomate");
        return this.value * PORCENTAGEM_IMPOSTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
