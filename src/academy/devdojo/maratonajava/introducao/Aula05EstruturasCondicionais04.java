package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salary = 100.0, result;
        double firstT = 9.70/100, secondT = 37.35/100, thirdT = 49.5/100;

        if(salary <= 34712){
            result = salary * firstT;
        } else if(salary > 34712 && salary <= 68507){

            /* Como disse anteriormente, você pode usar a condição salary > 34712 && salary <= 68507. Porém, para que seja verificado a condição do else if, a primeira, necessariamente, é falsa.

                Logo, fazer ambas as verificações é desnecessário (em termos de performance, apenas), pois, em todos os casos, a primeira será validada.

                Obviamente, isso é válido somente para estruturas concatenadas (else if), pois, se fossem dois if, a primeira validação seria obrigatória para ambos.

                Por isso, por questões de boas práticas, use ambas. O próximo a alterar o código pode não ser você.
            */

            result = salary * secondT;
        } else {
            result = salary * thirdT;
        }

        System.out.println("O valor a ser pago é de: " + result);
    }
}
