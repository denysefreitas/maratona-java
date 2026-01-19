package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public abstract class Produto implements Taxavel {
    protected String name;
    protected double value;

    public Produto(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
