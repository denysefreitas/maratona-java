package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco2 = new Endereco();
        endereco2.setRua("Rua 3");
        endereco2.setCep("4837548");

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setName("Arroyo");
        pessoa1.setCpf("11111");
        pessoa1.setEndereco(endereco2);

        pessoa1.imprime();

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setName("Kaio Jorge");
        funcionario1.setCpf("191919");
        funcionario1.setEndereco(endereco2);
        funcionario1.setSalary(20000);
        funcionario1.imprime();
    }
}

