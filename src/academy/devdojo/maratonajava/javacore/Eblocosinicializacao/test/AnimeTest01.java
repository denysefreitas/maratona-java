package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime("One Piece");
        Anime anime2 = new Anime();

        for (int episodio : anime1.getEpisodios()) {
            System.out.print(episodio + " ");
        }
    }
}
