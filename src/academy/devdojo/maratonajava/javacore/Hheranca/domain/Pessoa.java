package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Pessoa {
    protected String name;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco estático de Pessoa");
    }

    {
        System.out.println("Dentro do bloco não estático de Pessoa");
    }

    public Pessoa(String name) {
        System.out.println("Dentro do construtor da classe Pessoa 1");
        this.name = name;
    }

    public Pessoa(String name, String cpf) {
        this(name);
        System.out.println("Dentro do construtor da classe Pessoa 2");
        this.cpf = cpf;
    }

    public void imprime() {
        System.out.println("### Dados do usuário ###");
        System.out.println("Nome: " + this.name);
        System.out.println("CPF: " + this.cpf);
        this.endereco.imprime();
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
