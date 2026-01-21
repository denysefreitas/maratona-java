package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {
    // "Regra de negócio"
//   public static void calcularImpostoComputador(Computador computador){
//       double imposto = computador.calcularImposto();
//
//       System.out.println("Relatório de imposto do computador");
//       System.out.println("Computador: " + computador.getName());
//       System.out.println("Valor: " + computador.getValue());
//       System.out.println("Imposto: " + imposto);
//   }
//
//   public static void calcularImpostoTomate(Tomate tomate){
//       double imposto = tomate.calcularImposto();
//
//       System.out.println("Relatório de imposto do tomate");
//       System.out.println("Tomate: " + tomate.getName());
//       System.out.println("Valor: " + tomate.getValue());
//       System.out.println("Imposto: " + imposto);
//   }

   public static void calcularImposto(Produto produto){
       System.out.println("Relatório de imposto");
       double imposto = produto.calcularImposto();

       System.out.println("Relatório de imposto do produto");
       System.out.println("Produto: " + produto.getName());
       System.out.println("Valor: " + produto.getValue());
       System.out.println("Imposto a ser pago: " + imposto);

       // Valida se o produto é uma instância da subclasse
       if(produto instanceof Tomate){
           Tomate tomate = (Tomate) produto;
//           ((Tomate) produto) permite acessar get.DataValidade() diretamente
           System.out.println(tomate.getDataValidade());
       }
   }
}
