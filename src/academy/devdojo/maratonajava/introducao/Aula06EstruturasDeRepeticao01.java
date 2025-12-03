package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;

        System.out.println("Saída do while: ");

        while (count < 10){
            System.out.println(count);
            count++;
//          System.out.println(++count);
//          Primeiro incrementa um à variável (sempre é executado em ordem) e depois escreve. Porém, imprime de 1 a 10.
        }

        count = 12;

        System.out.println("\nSaída do do-while: ");
        // \n usado para fins de organização; é apenas uma quebra de linha a mais.

        do {
            // Executa ao menos uma vez, pois a condição é validada (ou não) somente no final.
            System.out.println(count);
            count++;
        } while (count < 12);

        System.out.println("\nSaída do for: ");

        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}
