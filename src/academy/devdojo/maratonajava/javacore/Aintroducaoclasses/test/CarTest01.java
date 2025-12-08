package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "Fiat Uno vermelho";
        car1.model = "Uno Mille";
        car1.color = "Vermelho";
        car1.year = 1983;

        car2.name = "Camaro";
        car2.model = "Chevrolet Camaro";
        car2.color = "Amarelo";
        car2.year = 1967;

        // Para referenciar objetos, basta: car1 = car2 (supondo que o objetivo é que car1 tenha as informações de car2)
        // Isso pode ser feito somente com objetos de mesmo tipo

        System.out.println("Informações sobre o carro 1: ");
        System.out.println("Nome: " + car1.name);
        System.out.println("Modelo: " + car1.model);
        System.out.println("Cor: " + car1.color);
        System.out.println("Ano: " + car1.year);

        System.out.println("\n-----------------------");

        System.out.println("\nInformações sobre o carro 2: ");
        System.out.println("Nome: " + car2.name);
        System.out.println("Modelo: " + car2.model);
        System.out.println("Cor: " + car2.color);
        System.out.println("Ano: " + car2.year);
    }
}
