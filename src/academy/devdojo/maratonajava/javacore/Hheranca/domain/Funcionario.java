package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa {
    // Significa que funcionario terá todos os atributos e métodos que Pessoa possui
    private double salary;

    // Ao criar o mesmo método de Pessoa, há uma sobrecarga.
    public void imprime(){
        System.out.println("------------");
        super.imprime();
        System.out.println("------------");
        System.out.println("Salário: " + this.salary);
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
