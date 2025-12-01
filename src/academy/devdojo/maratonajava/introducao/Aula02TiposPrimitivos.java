package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = 10;
        byte ageByte = 10;
        short ageShort = 10;
        long ageLong = 10000;

        double salaryDouble = 2000;
        // tu também pode usar 2000.0D ou 2000.0d, mas a IDE já reconhece

        float salaryFloat = 2500;
        // float salaryFloat = 2500.0F ou 2500.0f

        char c = 'D';
        char cASCII = 64; //transforma o Decimal para Char; "ASCII table"
        char cUnicode = '\u03A9'; // transforma Unicode para Char; "Unicode table"

        boolean f = false;
        boolean v = true;

        String name = "Denyse Freitas";

        System.out.println("A idade é: " + age);
        System.out.println(ageByte);
        System.out.println(ageShort);
        System.out.println(ageLong);

        System.out.println(salaryDouble);
        System.out.println(salaryFloat);

        System.out.println(c);
        System.out.println(cASCII);
        System.out.println(cUnicode);

        System.out.println(f);
        System.out.println(v);

        System.out.println(name);

        long value = (long) 155.89;
        /*
            Obriga a variável a receber o valor estipulado; nesse caso, se tratava de um ponto flutuante (decimal).
            Ao transformar um número decimal em um inteiro, apenas a parte inteira (155) é armazenada na variável.
            Assim, a parte flutuante (00.55) não é armazenada.
         */

        System.out.println(value);
    }
}
