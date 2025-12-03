package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // A restrição é que a parcela deve ser >= 1000
    public static void main(String[] args) {
        double valueCar = 30000, valueP;

        for (int i = 1; i <= valueCar; i++) {
            valueP = valueCar/i;
            if(valueP < 1000){
                break;
            }
            System.out.println(i+"x de R$ "+ valueP);

            // Usar o System.out.printf é uma ótima opção, pois você pode formatar os valores. Estou tentando entender o básico ainda e, por isso, não vou usar aqui.
            // Mas a ideia seria: System.out.printf("%dx de R$ %.2f%n", i, valueP);
            // %d = inteiro / %.2f% = decimal com duas casas / %n = quebra de linha
        }
    }
}
