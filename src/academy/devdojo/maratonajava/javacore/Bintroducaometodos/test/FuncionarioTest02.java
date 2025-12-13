package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario02;

public class FuncionarioTest02 {
    public static void main(String[] args) {
        Funcionario02 funcionario = new Funcionario02();

        funcionario.setName("Denyse");
        funcionario.setAge(20);
        funcionario.setSalarys(new double[]{1000.0, 2000.0, 3000.0});

        funcionario.imprime();
        System.out.println("Média salarial do funcionário: " + funcionario.getMedia());
    }
}
