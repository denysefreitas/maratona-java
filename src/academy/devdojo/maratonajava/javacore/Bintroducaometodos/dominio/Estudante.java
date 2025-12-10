package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

// Apesar de possível, a classe Estudante apresenta BAIXA coesão.
public class Estudante {
    public String name;
    public int age;
    public char sex;

    public void imprime(){
        // Não precisa passar parâmetros, pois está dentro do objeto

        String name = "Luke Castellan";
        int age = 20;
        char sex = 'M';

        System.out.println("----------------------");
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.sex);

        System.out.println("*********************************");

        System.out.println("Sem o this.:");
        System.out.println(name);
        System.out.println(age);
        System.out.println(sex);

        // Observe que o this evita que seja referenciada a variável local.
    }
}
