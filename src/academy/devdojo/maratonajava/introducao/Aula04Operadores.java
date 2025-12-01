package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // operadores aritméticos: + - / *

        int number1 = 10;
        int number2 = 20;
        int result = number1 + number2;

        System.out.println("O resultado da soma é: "+ result);

        result = number1 - number2;

        System.out.println("O resultado da subtração é: "+ result);

        result = number2/number1;

        System.out.println("O resultado da divisão é: "+ result);

        result = number1*number2;

        System.out.println("O resultado da multiplicação é: "+ result);

        // % usado para representar o resto da divisão

        int r = 21 % 3;
        System.out.println("O resto da divisão é: "+r);

        // < > <= >= == =! -> sempre retornam valores booleanos, não aritmético
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte" + isDezMaiorQueVinte);

        /* Você pode realizar o mesmo com os demais operadores; perceba que sempre será true or false, tipicamente booleano.
        O uso desses operadores (relacionais) faz mais sentido em estruturas de repetições, como if, else, elseif, while...*/

        // (and) &&, || (or), ! (not)
        int age = 29;
        float salary = 3000;
        boolean isDentroDaLeiMaiorQueTrinta = age >= 30 && salary >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = age < 30 && salary >= 3381;

        /*
            Obviamente, não faz sentido essa comparação quando se sabe ambas variáveis; no entanto, normalmente, há interação com o usuário.
            Essa interação permite que haja inúmeros valores associados às variáveis, o que torna necessária a validação feita.
            Na aula atual (18), isso ainda não foi feito e, por isso, parece redundante para a IDE.
         */

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);
    }
}
