package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valueCar = 30000, valueP;

        for (int i = (int) valueCar; i >= 1; i--) {
            valueP = valueCar/i;
            if(valueP < 1000){
                continue;
                /* O comando 'continue' faz com que tudo abaixo (se a condição for 'V') não seja executado.
                Note que SOUT é executado apenas a partir da parcela de número 30, pois, somente assim, a condição do IF não é atendida.
                 */
            }
            System.out.println(i+"x de R$ "+ valueP);
        }
    }
}
