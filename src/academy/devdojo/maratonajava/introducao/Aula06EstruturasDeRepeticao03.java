package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // Imprima os 25 primeiros números de um dado valor
        int value = 30, count = 0;

        do {
            System.out.println(count);
            count++;
        } while(count <= 25 && count <= value);
    }
}
