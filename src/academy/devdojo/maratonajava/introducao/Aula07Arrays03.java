package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int []numbersNew = {2, 4, 6, 8};
        int []numbersNewNew = new int[]{1, 3, 5, 7};

        for (int i = 0; i < numbersNew.length; i++) {
            System.out.println(numbersNew[i]);
        }

        for (int aux : numbersNewNew){
            System.out.println(aux);
            // 'aux' percorre todos os índices do array, recebendo o valor associado; não consegue puxar uma posição específica, pois essa informação não é armazenada.
        }
    }
}
