package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain;

public abstract class Funcionario {
    protected String name;
    protected double salary;

    public Funcionario(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

