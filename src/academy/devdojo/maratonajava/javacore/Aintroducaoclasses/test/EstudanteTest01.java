package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.name = "Denyse";
        estudante.age = 20;
        estudante.sex = 'F';

        Estudante estudante1 = new Estudante();
        estudante1.name = "Ana";
        estudante1.age = 18;
        estudante1.sex = 'F';

        System.out.println("Nomes: " + estudante.name + " e " + estudante1.name);
        System.out.println("Idades: " + estudante.age + " e " + estudante1.age);
        System.out.println("Sexos: " + estudante.sex + " e " + estudante1.sex);
    }
}
