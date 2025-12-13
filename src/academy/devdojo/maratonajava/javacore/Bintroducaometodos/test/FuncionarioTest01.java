package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.CalcularMediaFuncionario01;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario01;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraDadosDoFuncionario01;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario01 funcionario01 = new Funcionario01();
        CalcularMediaFuncionario01 mediaFuncionario = new CalcularMediaFuncionario01();
        ImpressoraDadosDoFuncionario01 impressoraFuncionario = new ImpressoraDadosDoFuncionario01();

        funcionario01.name = "Denyse";
        funcionario01.age = 20;
        funcionario01.salarys = new double[]{1000.0, 2000.0, 3000.0};

        impressoraFuncionario.impressoraDadosDoFuncionario(funcionario01);
        System.out.println("\n------------------------------------");
        mediaFuncionario.mediaSalarial(funcionario01);
    }
}
