package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Pessoa {
    private String name;
    private String cpf;
    private Endereco endereco;

    public void imprime(){
        System.out.println("### Dados do usuário ###");
        System.out.println("Nome: "+ this.name);
        System.out.println("CPF: "+ this.cpf);
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
