package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain;

public class Gerente extends Funcionario {
    public Gerente(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void calculaBonus() {
        salary = salary + salary * 0.2;
    }


}
