package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String name;
    private static int[] episodios;

    // Tendo mais do que um bloco de inicalização estático, a ordem de execução é a que aparece.
    static {
        System.out.println("Dentro do bloco de inicialização estático 1");

        episodios = new int[100];

        for (int i = 0; i < episodios.length; i++) {
            Anime.episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 2");
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 3");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático");
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int aux : Anime.episodios) {
            System.out.print(aux + " ");
        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public String getName() {
        return name;
    }
}
