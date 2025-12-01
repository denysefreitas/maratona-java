package academy.devdojo.maratonajava.introducao;
/*
    Prática:

    Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

    Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.
 */

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String name ="Denyse";
        String adress = "Guarapiranga, Ponte Nova (MG)";
        String dateSalary = "30/11/2025";

        // Para agrupar todas variáveis em uma só linha, após atribuir valores, use vírgulas.

        double salary = 2000.0;
        // float salary = 2000.0F;
        salary = 2000.0 - 5.0;

        System.out.println("Eu " + name + ", morando no endereço " + adress +", confirmo que recebi o salário de " + salary + ", na data " + dateSalary);

    }
}
