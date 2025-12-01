package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 20;
        boolean isAutorizadoParaComprarBebida = age >= 18;

//        if (age >= 18){
//            System.out.println("Você pode comprar bebidas alcóolicas, pois possui "+age+" anos");
//        } else {
//            System.out.println("Você não pode comprar bebidas alcóolicas, pois possui "+age+" anos");
//        }

        if (isAutorizadoParaComprarBebida){
            System.out.println("Você pode comprar bebidas alcóolicas, pois possui "+age+" anos");
        } else {
            System.out.println("Você não pode comprar bebidas alcóolicas, pois possui "+age+" anos");
            // Para testar, altere a variável, pois, sendo sempre 20, a condição anterior é verdadeira em todos os casos.
        }
    }
}
