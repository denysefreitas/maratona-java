package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Time time = new Time("Cruzeiro Esporte Clube");

        Jogador jogador1 = new Jogador("Matheus Pereira");
        Jogador jogador2 = new Jogador("Kaio Jorge", time);
        Jogador jogador3 = new Jogador("Keny Arroyo");
        Jogador jogador4 = new Jogador("Lucas Romero");

        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3, jogador4};

        time.setJogadores(jogadores);
        jogador1.setTime(time);
        jogador3.setTime(time);
        jogador4.setTime(time);

        System.out.println("-------- Time --------");

        time.imprime();

        System.out.println("\n------ Jogadores ------");

        jogador1.imprime();
        jogadores[1].imprime();
        jogador3.imprime();
        jogadores[3].imprime();
    }
}
