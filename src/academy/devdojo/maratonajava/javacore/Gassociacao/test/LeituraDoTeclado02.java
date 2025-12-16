package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTeclado02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char res;

        System.out.println("Olá, eu sou o software previsor do futuro!");

        do{
            System.out.println("Faça a sua pergunta!");
            char question = input.next().charAt(0);

            if(question == 'A'){
                System.out.println("Com toda certeza!");
            } else {
                System.out.println("Sinto muito, mas não.");
            }

            System.out.println("Deseja fazer outra pergunta?");
            res = input.next().charAt(0);

            if(res == 's'){
                res = 'S';
            }

        } while(res == 'S');

        System.out.println("Volte logo! Estarei esperando por você quando tiver mais perguntas");
    }
}
