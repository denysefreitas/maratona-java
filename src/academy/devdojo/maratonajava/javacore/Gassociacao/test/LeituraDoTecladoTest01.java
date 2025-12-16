package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        String sexS;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String name = input.nextLine();

        System.out.println("Informe sua idade: ");
        int age = input.nextInt();

        System.out.println("Informe F (feminino) ou M (masculino) para o seu sexo: ");
        char sex = input.next().charAt(0);

        if(sex == 'F'){
            sexS = "feminino";
        } else {
            sexS = "masculino";
        }

        System.out.println("O seu nome é " + name + ", o seu sexo é " + sexS + " e você possui " + age + " anos");
    }
}
