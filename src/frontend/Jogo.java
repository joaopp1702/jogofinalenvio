package frontend;

import backend.Tabaleiro;
import backend.carta;
import console.Console;
import cores.Cor;
import cores.StringColorida;
import mecanicas.Carta;

public class Jogo {
    private Tabaleiro tabuleiro;

    public Jogo() {
        StringColorida fundin = new StringColorida("0   ", Cor.BRANCO_BRANCO, Cor.FUNDO_PRETO);
        Carta fundo = new carta(fundin);
        this.tabuleiro = new Tabaleiro(5, 5, fundo);
    }

    public void iniciarNovoJogo() {
        tabuleiro.iniciarNovoJogo();
        Console.println(" ");
        Console.println(tabuleiro);
    }

    public void mostrarTabuleiro() {
        if (tabuleiro != null) {
            Console.println(tabuleiro);
        } else {
            Console.println("Nenhum jogo em andamento.");
        }
    }

    public Tabaleiro getTabuleiro() {
        return tabuleiro;
    }




}




