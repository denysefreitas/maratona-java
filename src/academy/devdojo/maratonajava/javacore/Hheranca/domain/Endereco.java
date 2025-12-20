package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Endereco {
    private String rua;
    private String cep;

    static {
        System.out.println("Dentro do bloco estático de Endereco");
    }

    {
        System.out.println("Dentro do bloco não estático de Endereco");
    }

    public Endereco(){
        System.out.println("Dentro do construtor da classe Endereco");
    }

    public Endereco(String rua, String cep) {
        System.out.println("Dentro do construtor da classe Endereco");
        this.rua = rua;
        this.cep = cep;
    }

    public void imprime(){
        System.out.println("------------");
        System.out.println("### Endereço ###");
        System.out.println("Rua: " + this.rua);
        System.out.println("CEP: " + this.cep);

//        Pessoa pessoa = new Pessoa();
//        pessoa.name = "dede";
        // É possível acessar o atributo pois ele é do tipo protected e Endereco compartilha o mesmo pacote de Pessoa
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
