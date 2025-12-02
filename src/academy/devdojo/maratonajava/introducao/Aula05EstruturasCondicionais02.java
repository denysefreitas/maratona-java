package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int age = 16;
        String category = "";

        /* Variáveis locais devem ser inicializadas para evitar erros de compilação. Isso não ocorre aqui, pois,
        necessariamente, 'category' tem atribuição (devido ao else).
        No entanto, se ele for retirado, haverá erros de compilação. Para evitar, inicialize suas variáveis locais.*/

        if(age < 15){
            category = "infantil";
        } else if (age >= 15 && age < 18) {
            /* É desnecessário dizer age <= 15 && age < 18.
             Se há compilação do else if quer dizer que a condição anterior não é atendida.
             Portanto, o usuário tem, necessariamente, mais do que 15 anos.
             No entanto, por questões de boas práticas, usarei ambas.*/
            category = "juvenil";
        } else {
            category = "adulta";
        }

        System.out.println("A categoria do usuário é " + category);
    }
}
