package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando switch e dado um dia qualquer de 1 a 7, imprima se é dia útil ou não.
        // Considere 1 como Domingo.

        byte day = 0;
        String result = ""; // É redundante, pois será (necessariamente) incializado, mas estou tentando me acostumar a sempre inicializar.

        /* Como estou seguindo o curso, uso o JDK 8, que não suporta blocagem de switch.
        Essa é a solução mais inteligente para as versões posteriores a 14.*/

        switch (day){
            case 1:
                result = "Fim de semana";
                break;
            case 2:
                result = "Dia útil";
                break;
            case 3:
                result = "Dia útil";
                break;
            case 4:
                result = "Dia útil";
                break;
            case 5:
                result = "Dia útil";
                break;
            case 6:
                result = "Dia útil";
                break;
            case 7:
                result = "Fim de semana";
                break;
            default:
                result = "Opção inválida";
                break;
        }

        System.out.println(result);

        /* Código do William:
         switch (day){
            case 1:
            case 7:
                result = "Fim de semana";
                break;
            case 2;
            case 3:
            case 4:
            case 5:
            case 6:
                result = "Dia útil";
                break;
            default:
                result = "Opção inválida";
                break;
        }
        */
    }
}
