package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] days = new int[3][3];
        // Não é necessário atribuir tamanho para as partes do array além da primeira;

        days[0][0] = 31;
        days[0][1] = 28;
        days[0][2] = 31;

        days[1][0] = 25;
        days[1][1] = 27;
        days[1][2] = 25;

        days[2][0] = 30;
        days[2][1] = 29;
        days[2][2] = 30;

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println(days[i][j]);
            }
        }

        System.out.println("------------------------------------------");

        for(int []arrAux : days) {
            // Devem ser feitos quantos forem necessários; apenas ao último será atribuído somente o 'int' (pois os demais abrem em arrays)
            // Em cada foreach, reduza o tamanho do array multidimensional em uma unidade
            for (int aux: arrAux){
                System.out.println(aux);
            }
        }
    }
}
