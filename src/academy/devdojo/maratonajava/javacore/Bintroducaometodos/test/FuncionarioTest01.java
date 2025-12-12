package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.CalcularMediaFuncionario;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraDadosDoFuncionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        CalcularMediaFuncionario mediaFuncionario = new CalcularMediaFuncionario();
        ImpressoraDadosDoFuncionario impressoraFuncionario = new ImpressoraDadosDoFuncionario();

        funcionario.name = "Denyse Freitas Santos";
        funcionario.age = 20;
        funcionario.salarys = new double[]{1000.0, 2000.0, 3000.0};

        impressoraFuncionario.impressoraDadosDoFuncionario(funcionario);
        System.out.println("\n------------------------------------");
        mediaFuncionario.mediaSalarial(funcionario);
    }
}
