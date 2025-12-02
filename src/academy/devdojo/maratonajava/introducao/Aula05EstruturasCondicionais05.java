package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // imprima o dia da semana, considerando 1 como domingo
        byte dayByte = 6;
        String dayString = "";

        switch (dayByte){
            case 1:
                dayString = "Domingo";
                break;
            case 2:
                dayString = "Segunda-feira";
                break;
            case 3:
                dayString = "Terça-Feira";
                break;
            case 4:
                dayString = "Quarta-feira";
                break;
            case 5:
                dayString = "Quinta-feira";
                break;
            case 6:
                dayString = "Sexta-feira";
                break;
            case 7:
                dayString = "Sábado";
                break;
            default: // Pode ficar em qualquer posição dentro do switch, mas o indicado é no final.
                dayString = "Opção inválida";
                break;
        }

        System.out.println(dayString);

        char sexo = 'M';
        String resultado;

        switch (sexo){
            case 'F': // F: feminino
                resultado = "Mulher";
                break;
            case 'M': // M: masculino
                resultado = "Homem";
                break;
            default:
                resultado = "Opção inválida. Tente novamente!";
                break;
        }

        System.out.println(resultado);
    }
}
