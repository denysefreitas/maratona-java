package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(10 - 3);
    }

    public void multiplicaDoisNumeros(int a, float b) {
        // Aqui, a e b são parâmetros
        System.out.println(a * b);
    }

    public double divideDoisNumeros(double a, double b) {
        // Precisa de uma variável de mesmo tipo para armazenar o retorno.
        if(b == 0){
            return 0;
            // Esse comando faz com que as linhas demais não sejam executadas, pois retorna à 'main'.
        }
        return a / b;
    }

    public double divideDoisNumeros02(double a, double b) {
        if(b == 0){
            return 0;
        } else{
            return a / b;
        }
    }

    public double divideDoisNumeros03(double a, double b) {
        if(b != 0){
            return a / b;
        } else{
            return 0;
        }
    }

    public void imprimeDivisaoDeDoisNumeros03(double a, double b) {
        if(b == 0){
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(a/b);
        // Se não usar o return, precisa de ter o else (ou tudo será compilado).
    }


}
