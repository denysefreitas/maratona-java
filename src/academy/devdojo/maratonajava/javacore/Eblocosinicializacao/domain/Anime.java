package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String name;
    private int[] episodios;

    // Bloco de inicialização: é executado antes do construtor e em todas as vezes que uma instância do objeto for criada;
    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];

        for (int i = 0; i < episodios.length; i++) {
            this.episodios[i] = i + 1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
//        System.out.println(episodios); // Exibe o endereço de memória
        for (int aux : this.episodios) {
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
