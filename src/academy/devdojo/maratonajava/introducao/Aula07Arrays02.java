package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // Inicialização dos tipos primitivos:
        // byte, short, int, long: 0
        // float, double: 0.0
        // char: ' ' or '\u0000'
        // boolean: false
        // String: null

        String []names = new String[4];

        names[0] = "Denyse";
        names[1] = "Dayana";
        names[2] = "Ana";
        names[3] = "Andrey";

        for (int i = 0; i < names.length; i++) {
            // names.length retorna o tamanho do array; portanto, ao alterar o tamanho na inicialização, o limite do for também é alterado.
            System.out.println(names[i]);
        }

    }
}
