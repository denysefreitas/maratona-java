package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.sex);

        estudante.name = "Grover Underwood";
        // Após o SOUT, altera o nome do estudante (objeto); por isso, na classe EstudanteTest01
        // é exibido "Grover Underwood" ao solicitar a impressão de estudante.name.
        // O ideal (boas práticas) não é alterar o objeto, mas retornar um novo (cópia) com tais alterações.
    }
}
