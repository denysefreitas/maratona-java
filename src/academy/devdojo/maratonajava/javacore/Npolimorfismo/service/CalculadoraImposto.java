package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {
    // "Regra de negócio"
   public static void calculadoraImpostoComputador(Computador computador){
       double imposto = computador.calcularImposto();

       System.out.println("Relatório de imposto do computador");
       System.out.println("Computador: " + computador.getName());
       System.out.println("Valor: " + computador.getValue());
       System.out.println("Imposto: " + imposto);
   }

   public static void calculadoraImpostoTomate(Tomate tomate){
       double imposto = tomate.calcularImposto();

       System.out.println("Relatório de imposto do tomate");
       System.out.println("Tomate: " + tomate.getName());
       System.out.println("Valor: " + tomate.getValue());
       System.out.println("Imposto: " + imposto);
   }
}
