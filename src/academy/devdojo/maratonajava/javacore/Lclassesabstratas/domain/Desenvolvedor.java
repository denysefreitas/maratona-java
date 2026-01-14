package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void calculaBonus() {
        this.salary = salary + salary * 0.05;
    }


}

