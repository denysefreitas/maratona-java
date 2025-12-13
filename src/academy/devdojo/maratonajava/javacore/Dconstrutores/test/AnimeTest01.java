package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args){
        Anime anime = new Anime("Haykiuu", "TV", 12, "Ação");
        Anime anime2 = new Anime();
        Anime anime3 = new Anime("Naruto", "TV", 20, "Ação", "Production IG");

        anime.imprime();
        anime2.imprime();
        anime3.imprime();
    }
}
