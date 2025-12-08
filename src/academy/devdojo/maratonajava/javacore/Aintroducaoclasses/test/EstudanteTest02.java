package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante2.age = 18;

        System.out.println("Valores de inicialização padrão (exceto 'age') dos atributos: ");
        System.out.println("Nome: " + estudante.name);
        System.out.println("Idade: " + estudante.age);
        // Pela classe inicializar age com 100, se não houver atribuição, o padrão será associar 100 a age.
        System.out.println("Sexo: " + estudante.sex);

        System.out.println("----------------------------------");

        System.out.println("Nome: " + estudante2.name);
        System.out.println("Idade: " + estudante2.age);
        System.out.println("Sexo: " + estudante2.sex);
    }
}
