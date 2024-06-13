//usei alguns codigos com ajuda do chat gpt pra entender como funciona umas funçoes.
//nesssas funcoes foram algumas da mecanica do jogo, soma de cartas, colocar a aleatoria e movimentaçao
//usei exemplos q pedi a ele e modifiquei para funcionar junto da engine


package frontend;

import backend.Tabaleiro;
import backend.carta;
import console.Console;
import cores.Cor;
import cores.StringColorida;

import java.util.Scanner;


public class Main {
    private static Jogo jogoAtual;

    private static Tabaleiro tab1;
    private Jogo jogo;

    public static void main(String[] args) {
        StringColorida fundin = new StringColorida("0   ", Cor.BRANCO_BRANCO, Cor.FUNDO_PRETO);
        StringColorida barrae = new StringColorida("|---", Cor.CINZA, Cor.FUNDO_PRETO);
        StringColorida barrad = new StringColorida("---|", Cor.CINZA, Cor.FUNDO_PRETO);
        StringColorida teto = new StringColorida("----", Cor.CINZA, Cor.FUNDO_PRETO);
        StringColorida c1 = new StringColorida("2   ", Cor.AZUL, Cor.FUNDO_PRETO);
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

        carta tet = new carta(teto);
        carta barraae = new carta(barrae);
        carta barraad = new carta(barrad);
        carta a2 = new carta(c1);
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
        carta teste = new carta(fundin);





        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            Tela();
            escolha = scanner.nextInt();

            switch (escolha) {

                case 1:
                    Console.println("Novo Jogo");


                    jogoAtual = new Jogo();
                    jogoAtual.iniciarNovoJogo();
                    jogada();

                    break;

                case 2:
                    Console.println("Sair");
                    return;

                case 3:
                    Console.println("menu");
                    paus();
                    break;
                default:
                    Console.println("ESCOLHA");
                    break;


            }
        } while (true);


    }


    private static void Tela() {

        Console.println(" ");
        Console.println("╔══════════════════════════════════╗");
        Console.println("║            ☛ 2048 ☚             ║");
        Console.println("║        ▄██▄             ▄▄       ║");
        Console.println("║       █████▄▄▄▄       ▄▀         ║");
        Console.println("║         ▀██▀▀████▄    ▄▀         ║");
        Console.println("║         ▄█▀▄██▄████▄ ▄█          ║");
        Console.println("║       ▄▄█▀▄▄█─▀████▀██▀          ║");
        Console.println("╠══════════════════════════════════╣");
        Console.println("║      1 - Novo Jogo               ║");
        Console.println("║      2 - Sair                    ║");
        Console.println("╚══════════════════════════════════╝");
        Console.print("ESCOLHA ENTRE 1, 2: ");


    }


    public static void paus1() {


        Scanner scanner = new Scanner(System.in);
        int escolha1;


        do {
            paus();
            escolha1 = scanner.nextInt();

            switch (escolha1) {

                case 1:
                    Console.println("Voltar ao jogo");
                    if (jogoAtual != null) {
                        jogoAtual.mostrarTabuleiro();
                    } else {
                        Console.println("Nenhum jogo em andamento.");
                    }


                    break;
                case 2:
                    Console.println("voltar ao menu");
                    paus2();
                    ;

                    break;
                case 3:
                    Console.println("Fechar jogo");
                    exitProgram();
                default:
                    Console.println("ESCOLHA");
                    break;


            }
        } while (true);


    }

    public static void paus() {
        Console.println("MENU DE PAUSE");
        Console.println("1-VOLTAR AO JOGO");
        Console.println("2-VOLTAR AO MENU");
        Console.println("3-Sair");
        Console.print("Escolha: ");

    }


    public static void exitProgram() {
        System.exit(0);
    }

    private static void jogada() {
        Scanner scanner = new Scanner(System.in);
        char escolha;

        do {
            Console.print("Use W/A/S/D para mover, P para pausar e Q para sair: ");
            escolha = scanner.next().toUpperCase().charAt(0);

            if (jogoAtual != null) {
                switch (escolha) {
                    case 'W':
                        jogoAtual.getTabuleiro().moverParaCima();
                        Console.limpaTela();
                        break;

                    case 'S':
                        jogoAtual.getTabuleiro().moverParaBaixo();
                        Console.limpaTela();
                        break;

                    case 'A':
                        jogoAtual.getTabuleiro().moverParaEsquerda();
                        Console.limpaTela();
                        break;

                    case 'D':
                        jogoAtual.getTabuleiro().moverParaDireita();
                        Console.limpaTela();
                        break;


                    case 'P':
                        paus1();
                        break;

                    case 'Q':
                        return;

                    default:
                        Console.println("opçao nao funcional use W,A,S,D . Tente novamente.");
                        break;
                }
                jogoAtual.mostrarTabuleiro();
            }
        } while (escolha != 'Q');
    }

public static void paus2(){


    Scanner scanner = new Scanner(System.in);
    int escolha;

    do {
        Tela();
        escolha = scanner.nextInt();

        switch (escolha) {

            case 1:
                Console.println("Novo Jogo");


                jogoAtual = new Jogo();
                jogoAtual.iniciarNovoJogo();
                jogada();

                break;

            case 2:
                Console.println("Sair");
                return;

            case 3:
                Console.println("menu");
                paus();
                break;
            default:
                Console.println("ESCOLHA");
                break;


        }
    } while (true);


}
}











