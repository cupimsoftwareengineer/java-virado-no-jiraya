package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar Jr.");
        Jogador jogador2 = new Jogador("Vinicius Jr.");
        Jogador jogador3 = new Jogador("Ronaldinho.");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for(Jogador jogador: jogadores) {
            jogador.imprime();
        }
    }
}