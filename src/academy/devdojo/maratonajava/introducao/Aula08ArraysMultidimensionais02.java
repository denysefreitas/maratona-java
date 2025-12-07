package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int []array = new int[]{0,0};
        int [][] arrayInt = new int [3][];

        // Para definir tamanhos variáveis para as demais posições do array
        arrayInt[0] = new int[2];
        // arrayInt[0] = new int[]{0, 0};
        // arrayInt[0] = array;
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];

        int [][]array2 = {{0, 0}, {1, 1, 1}, {2, 3, 4, 5, 6, 7}};

        for (int []arrAux : arrayInt){
            System.out.println("\n-----------------");
            for (int aux : arrAux){
                System.out.print(aux + " ");
            }
        }

        System.out.println("\n\n*********************");

        for (int []arrAux : array2){
            System.out.println("\n-----------------");
            for (int aux : arrAux){
                System.out.print(aux + " ");
            }
        }
    }
}
