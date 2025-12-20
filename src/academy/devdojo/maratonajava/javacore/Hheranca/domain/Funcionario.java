package academy.devdojo.maratonajava.javacore.Hheranca.domain;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario02;

public class Funcionario extends Pessoa {
    // Significa que funcionario terá todos os atributos e métodos que Pessoa possui
    private double salary;

    static {
        System.out.println("Dentro do bloco estático de Funcionario");
    }

    {
        System.out.println("Dentro do bloco não estático de Funcionario");
    }

    public Funcionario(String name) {
        super(name);
        System.out.println("Dentro do construtor da classe Funcionario");
    }

    public Funcionario(String name, String cpf) {
        super(name, cpf);
        System.out.println("Dentro do construtor da classe Funcionario");
    }

    // Ao criar o mesmo método de Pessoa, há uma sobrecarga.
    public void imprime() {
        System.out.println("------------");
        super.imprime();
        System.out.println("------------");
        System.out.println("Salário: " + this.salary);
    }

    public void relatorioPagamento() {
        System.out.println("Eu, " + this.name + ", recebi o salário de " + this.salary + " reais");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
