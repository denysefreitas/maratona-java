package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

import java.sql.SQLOutput;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    // A vantagem do construtor é definir como obrigatório alguns parâmetros
    public Anime(String nome, String tipo, int episodios, String genero){
        this(); // Chama o construtor sem parâmetros, pois não foi passado nenhum argumento
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");
    }

    public Anime(String nome, String tipo, int episodios, String genero, String estudio){
        this(nome, tipo, episodios, genero);
        // Anime() é compilado 3 vezes, pois anime vai para o primeiro construtor, que puxa o segundo; outro (anime2) vai direto para o segundo
        // e o anime3 compila este, que passa para o primeiro construtor e (lá) o construtor puxa o primeiro.
        // Se retirar o this(); do primeiro construtor, Anime() será compilado uma única vez. Faça o teste!
        this.estudio = estudio;
    }

    public void imprime(){
        System.out.println("---------------");
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.genero);
        System.out.println(this.episodios);
        System.out.println(this.estudio);
    }

    public String getGenero() {
        return genero;
    }

    public String getTipo(){
        return this.tipo;
    }

    public int getEpisodios(){
        return this.episodios;
    }

    public String getNome(){
        return this.nome;
    }
}
