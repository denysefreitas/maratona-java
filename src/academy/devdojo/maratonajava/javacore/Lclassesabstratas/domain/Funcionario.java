package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain;

public abstract class Funcionario extends Pessoa{
    protected String name;
    protected double salary;

    public Funcionario(String name, double salary) {
        this.name = name;
        this.salary = salary;
        calculaBonus();
    }
    
    public abstract void calculaBonus();

    // A classe abstrata que herda o método abstrato de outra classe abstrata NÃO precisa implementar
    // Mas, se isso acontecer, todas as classes concretas que herdam DESTA precisam implementar
    public void imprime(){
        System.out.println("Nome: " + this.name);
        System.out.println("Salário: " + this.salary);
    }
}

