package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Matheus Pereira");
        Jogador jogador2 = new Jogador("Kaio Jorge");
        Jogador jogador3 = new Jogador("Keny Arroyo");
        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};

        // Ao fazer isso, os parâmetros do objeto jogador1 podem ser acessados tanto a partir de jogador1
        // quanto a partir da sua posição no vetor jogadores (i = 0).

        for(Jogador jogador : jogadores){
            jogador.imprime();
        }
    }
}
