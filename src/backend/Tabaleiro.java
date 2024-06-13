package backend;

import console.Console;
import cores.Cor;
import cores.StringColorida;
import mecanicas.Carta;
import mecanicas.Tabuleiro;
import java.util.Random;

public class Tabaleiro extends Tabuleiro {

    private carta teste;
    private carta a2;
    StringColorida c2 = new StringColorida("4   ", Cor.AZUL, Cor.FUNDO_PRETO);
    StringColorida c3 = new StringColorida("8   ", Cor.AZUL, Cor.FUNDO_PRETO);
    StringColorida c4 = new StringColorida("16  ", Cor.AZUL, Cor.FUNDO_PRETO);
    StringColorida c5 = new StringColorida("32  ", Cor.AZUL, Cor.FUNDO_PRETO);
    StringColorida c6 = new StringColorida("64  ", Cor.AZUL, Cor.FUNDO_PRETO);
    StringColorida c7 = new StringColorida("128 ", Cor.AZUL, Cor.FUNDO_PRETO);
    StringColorida c8 = new StringColorida("256 ", Cor.AZUL, Cor.FUNDO_PRETO);
    StringColorida c9 = new StringColorida("512 ", Cor.AZUL, Cor.FUNDO_PRETO);
    StringColorida c10 = new StringColorida("1024", Cor.AZUL, Cor.FUNDO_PRETO);
    StringColorida c11 = new StringColorida("2048", Cor.AZUL, Cor.FUNDO_PRETO);

    carta a4 = new carta(c2);
    carta a8 = new carta(c3);
    carta a16 = new carta(c4);
    carta a32 = new carta(c5);
    carta a64 = new carta(c6);
    carta a128 = new carta(c7);
    carta a256 = new carta(c8);
    carta a512 = new carta(c9);
    carta a1024 = new carta(c10);
    carta a2048 = new carta(c11);
    StringColorida c1 = new StringColorida("2   ", Cor.AZUL, Cor.FUNDO_PRETO);
    carta a3 = new carta(c1);


    public Tabaleiro(int numLinhas, int numColunas, Carta fundo) {
        super(numLinhas, numColunas, fundo);

        this.teste = teste;
        this.a2 = a2;
    }




    public void colocaCartaAleatoria() {
        Random rand = new Random();

        int totalLinhas = getTotalLinhas();
        int totalColunas = getTotalColunas();

        if (totalLinhas == 0 || totalColunas == 0) {
            Console.println("O tabuleiro está vazio, não é possível adicionar uma carta.");
            return;
        }

        int linha, coluna;
        do {
            linha = rand.nextInt(totalLinhas);
            coluna = rand.nextInt(totalColunas);
        } while (getPilha(linha, coluna).getTamanho() != 0);

        colocaCarta(linha, coluna, a3);
    }

    public void iniciarNovoJogo() {
        Console.limpaTela();
        colocaCartaAleatoria();
        colocaCartaAleatoria();
    }


    //USADO CHATGPT E MODIFICADO//
    public void moverParaCima() {
        boolean moved = false;
        for (int coluna = 0; coluna < getTotalColunas(); coluna++) {
            for (int linha = 1; linha < getTotalLinhas(); linha++) {
                while (moverCarta(linha, coluna, -1, 0)) {
                    moved = true;
                    linha--;
                    linha--;
                }
            }
        }
        if (moved) colocaCartaAleatoria();
    }

    public void moverParaBaixo() {
        boolean moved = false;
        for (int coluna = 0; coluna < getTotalColunas(); coluna++) {
            for (int linha = getTotalLinhas() - 2; linha >= 0; linha--) {
                while (moverCarta(linha, coluna, 1, 0)) {
                    moved = true;
                    linha++;
                    linha++;
                }
            }
        }
        if (moved) colocaCartaAleatoria();
    }

    public void moverParaEsquerda() {
        boolean moved = false;
        for (int linha = 0; linha < getTotalLinhas(); linha++) {
            for (int coluna = 1; coluna < getTotalColunas(); coluna++) {
                while (moverCarta(linha, coluna, 0, -1)) {
                    moved = true;
                    coluna--;
                    coluna--;
                }
            }
        }
        if (moved) colocaCartaAleatoria();
    }

    public void moverParaDireita() {
        boolean moved = false;
        for (int linha = 0; linha < getTotalLinhas(); linha++) {
            for (int coluna = getTotalColunas() - 2; coluna >= 0; coluna--) {
                while (moverCarta(linha, coluna, 0, 1)) {
                    moved = true;
                    coluna++;
                    coluna++;
                }
            }
        }
        if (moved) colocaCartaAleatoria();
    }



//USADO CHATGPT PARA CRIAR UM MODELO E MODIFICADO
    private boolean moverCarta(int linha, int coluna, int deltaLinha, int deltaColuna) {
        int novaLinha = linha + deltaLinha;
        int novaColuna = coluna + deltaColuna;

        if (novaLinha < 0 || novaLinha >= getTotalLinhas() || novaColuna < 0 || novaColuna >= getTotalColunas()) {
            return false;
        }

        if (getPilha(linha, coluna).getTamanho() == 0) {
            return false;
        }

        Carta cartaAtual = getPilha(linha, coluna).verTopo();
        Carta cartaDestino = getPilha(novaLinha, novaColuna).verTopo();

        if (getPilha(novaLinha, novaColuna).getTamanho() == 0) {
            pegaCarta(linha, coluna);
            colocaCarta(novaLinha, novaColuna, cartaAtual);
            return moverCarta(novaLinha, novaColuna, deltaLinha, deltaColuna)  || true;
        } else if (cartaAtual instanceof carta && cartaDestino instanceof carta) {
            carta cartaAtualTyped = (carta) cartaAtual;
            carta cartaDestinoTyped = (carta) cartaDestino;





            if (cartaAtualTyped.equals(cartaDestinoTyped)) {
                int novoValor = Integer.parseInt(cartaAtualTyped.getFrente().getString().trim()) * 2;
                Carta novaCarta = criarNovaCarta(novoValor);

                if (novaCarta != null) {
                    pegaCarta(linha, coluna);
                    pegaCarta(novaLinha, novaColuna);
                    colocaCarta(novaLinha, novaColuna, novaCarta);
                    return true;
                }
            }
        }
        return false;
    }

    private Carta criarNovaCarta(int valor) {
        switch (valor) {
            case 4:
                return a4;
            case 8:
                return a8;
            case 16:
                return a16;
            case 32:
                return a32;
            case 64:
                return a64;
            case 128:
                return a128;
            case 256:
                return a256;
            case 512:
                return a512;
            case 1024:
                return a1024;
            case 2048:
                Console.println("Parabéns! Você ganhou o jogo!");
                return a2048;
            default:
                return null;
        }
    }
}


//esse essa funçao moveCarta q esta comentada foi a primeria q eu fiz porem esta quebrada, entao pedi ajuda pro gpt
//para corrigir e simplicar ela assim como a funçao a cima.

//    private boolean moverCarta(int linha, int coluna, int deltaLinha, int deltaColuna) {
//        int novaLinha = linha + deltaLinha;
//        int novaColuna = coluna + deltaColuna;
//
//        if (novaLinha < 0 || novaLinha >= getTotalLinhas() || novaColuna < 0 || novaColuna >= getTotalColunas()) {
//            return false;
//        }
//
//        if (getPilha(linha, coluna).getTamanho() == 0) {
//            return false;
//        }
//
//        Carta cartaAtual = getPilha(linha, coluna).verTopo();
//        Carta cartaDestino = getPilha(novaLinha, novaColuna).verTopo();
//
//        if (getPilha(novaLinha, novaColuna).getTamanho() == 0) {
//            pegaCarta(linha, coluna);
//            colocaCarta(novaLinha, novaColuna, cartaAtual);
//            moverCarta(novaLinha, novaColuna, deltaLinha, deltaColuna);
//            return true;
//        } else if (podemSerCombinadas(cartaAtual, cartaDestino)) {
//            combinarCartas(cartaAtual, cartaDestino);
//            return true;
//        }
//        return false;
//    }
//}
//

//    // Método para combinar as cartas com os valores corretos
//    private void combinarCartas(Carta cartaAtual, Carta cartaDestino) {
//        if (cartaAtual instanceof carta && cartaDestino instanceof carta) {
//            carta cartaAtualTyped = (carta) cartaAtual;
//            carta cartaDestinoTyped = (carta) cartaDestino;
//            // Verifica se as duas cartas têm o mesmo valor
//            if (cartaAtualTyped.getFrente().equals(cartaDestinoTyped.getFrente())) {
//                // Obtém o valor da carta atual e converte para um número inteiro
//                int valorAtual = Integer.parseInt(cartaAtualTyped.getFrente().getString().trim());
//                // Calcula o valor da próxima carta na sequência
//                int novoValor = valorAtual * 2;
//                // Verifica se o novo valor está dentro dos limites permitidos
//                if (novoValor <= 2048) {
//                    // Cria uma nova carta com o valor dobrado
//                    String novoValorString = String.valueOf(novoValor);
//                    Carta novaCarta = new carta(new StringColorida(novoValorString + " ", Cor.AZUL, Cor.FUNDO_PRETO));
//                    // Remove as duas cartas atuais
//                    getPilha(cartaAtualTyped.getLinha(), cartaAtualTyped.getColuna()).removeTopo();
//                    getPilha(cartaDestinoTyped.getLinha(), cartaDestinoTyped.getColuna()).removeTopo();
//                    // Adiciona a nova carta com o valor dobrado na posição da carta destino
//                    colocaCarta(cartaDestinoTyped.getLinha(), cartaDestinoTyped.getColuna(), novaCarta);
//                }
//            }
//        }
//    }
//
//    // Método para verificar se duas cartas podem ser combinadas
//    private boolean podemSerCombinadas(Carta cartaAtual, Carta cartaDestino) {
//        if (cartaAtual instanceof carta && cartaDestino instanceof carta) {
//            carta cartaAtualTyped = (carta) cartaAtual;
//            carta cartaDestinoTyped = (carta) cartaDestino;
//            // Verifica se as duas cartas têm o mesmo valor
//            return cartaAtualTyped.getFrente().equals(cartaDestinoTyped.getFrente());
//        }
//        return false;
//    }
//
//}
