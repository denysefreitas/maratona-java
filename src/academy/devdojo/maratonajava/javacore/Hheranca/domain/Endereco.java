package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Endereco {
    private String rua;
    private String cep;

    public Endereco(){

    }

    public Endereco(String rua, String cep) {
        this.rua = rua;
        this.cep = cep;
    }

    public void imprime(){
        System.out.println("------------");
        System.out.println("### Endereço ###");
        System.out.println("Rua: " + this.rua);
        System.out.println("CEP: " + this.cep);
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
