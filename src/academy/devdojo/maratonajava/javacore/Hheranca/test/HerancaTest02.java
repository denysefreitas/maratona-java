package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;

// 0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar a classe pai
// 1 - Bloco de inicialização estático da subclasse é executado quando a JVM carregar a classe filha
// 2 - Alocado em espaço de memória pro objeto da superclasse
// 3 - Cada atributo da superclasse pai é criado e inicializado com valores default ou com o que for passado
// 4 - Bloco de inicialização da super classe é executado
// 5 - Construtor da super classe é executado
// ### Para a subclasse:
// 6 - Alocado em espaço de memória pro objeto da subclasse
// 7 - Cada atributo da subclasse é criado e inicializado com valores default ou com o que for passado
// 8 - Bloco de inicialização da subclasse é executado
// 9  - Construtor da subclasse é executado

public class HerancaTest02 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Kaiki Bruno");
    }
}
