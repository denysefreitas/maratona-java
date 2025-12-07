package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01Extra {
    public static void main(String[] args) {
        // Isso é um código adicional. Estou testando o uso do foreach para arrays multidimensionais.
        int[][][] test = new int[2][3][3];

        // Para i = 0 e j = 0
        test[0][0][0] = 1;
        test[0][0][1] = 1;
        test[0][0][2] = 1;
        // Para i = 0 e j = 1
        test[0][1][0] = 2;
        test[0][1][1] = 2;
        test[0][1][2] = 2;
        // Para i = 0 e j = 2
        test[0][2][0] = 3;
        test[0][2][1] = 3;
        test[0][2][2] = 3;
        // Para i = 1 e j = 0
        test[1][0][0] = 4;
        test[1][0][1] = 4;
        test[1][0][2] = 4;
        // Para i = 1 e j = 1
        test[1][1][0] = 5;
        test[1][1][1] = 5;
        test[1][1][2] = 5;
        // Para i = 1 e j = 2
        test[1][2][0] = 6;
        test[1][2][1] = 6;
        test[1][2][2] = 6;

        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                for (int k = 0; k < test[i][j].length; k++) {
                    System.out.println(test[i][j][k]);
                }
            }
        }

        System.out.println("------------------------------------------");

        for(int [][]arrMAux : test) {
            for (int []arrAux : arrMAux){
                for (int aux : arrAux){
                    System.out.println(aux);
                }
            }
        }
    }
}
