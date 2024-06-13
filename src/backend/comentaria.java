package backend;

public class comentaria {



    //                    Tabaleiro tab = new Tabaleiro(4, 4, teste);
//                    tab.setFundo(0, 1, barraae);
//                    tab.setFundo(0 , 0, barraae );
//                    tab.setFundo(1 , 0, barraae );
//                    tab.setFundo(2 , 0, barraae );
//                    tab.setFundo(3 , 0, barraae );
//                    tab.setFundo(4 , 0, barraae );
//                    tab.setFundo(5 , 0, barraae);
//                    tab.setFundo(0 , 1, tet );
//                    tab.setFundo(0 , 2, tet );
//                    tab.setFundo(0 , 3, tet );
//                    tab.setFundo(0 , 4, tet );
//                    tab.setFundo(0 , 5, tet );
//                    tab.setFundo(5 , 0, barraae );
//                    tab.setFundo(5 , 1, tet );
//                    tab.setFundo(5 , 2, tet );
//                    tab.setFundo(5 , 3, tet );
//                    tab.setFundo(5 , 4, tet );
//                    tab.setFundo(5 , 5, tet );
//                    tab.setFundo(0 , 5, barraad );
//                    tab.setFundo(1 , 5 , barraad );
//                    tab.setFundo(2 , 5, barraad );
//                    tab.setFundo(3 , 5, barraad );
//                    tab.setFundo(4 , 5, barraad );
//                    tab.setFundo(5 , 5, barraad );
//                    tab.setFundo(0 , 5, barraad );

//                    tab.colocaCartaAleatoria();
//                    tab.colocaCartaAleatoria();


//                    Console.println(tab);





//        Tabuleiro tab = new Tabaleiro(6, 6, teste);
//        tab.colocaCarta(0 , 0, barraae );
//        tab.colocaCarta(1 , 0, barraae );
//        tab.colocaCarta(2 , 0, barraae );
//        tab.colocaCarta(3 , 0, barraae );
//        tab.colocaCarta(4 , 0, barraae );
//        tab.colocaCarta(5 , 0, barraae);
//        tab.colocaCarta(0 , 1, tet );
//        tab.colocaCarta(0 , 2, tet );
//        tab.colocaCarta(0 , 3, tet );
//        tab.colocaCarta(0 , 4, tet );
//        tab.colocaCarta(0 , 5, tet );
//        tab.colocaCarta(5 , 0, barraae );
//        tab.colocaCarta(5 , 1, tet );
//        tab.colocaCarta(5 , 2, tet );
//        tab.colocaCarta(5 , 3, tet );
//        tab.colocaCarta(5 , 4, tet );
//        tab.colocaCarta(5 , 5, tet );
//        tab.colocaCarta(0 , 5, barraad );
//        tab.colocaCarta(1 , 5 , barraad );
//        tab.colocaCarta(2 , 5, barraad );
//        tab.colocaCarta(3 , 5, barraad );
//        tab.colocaCarta(4 , 5, barraad );
//        tab.colocaCarta(5 , 5, barraad );
//        tab.colocaCarta(0 , 5, barraad );
//
//
//
//
//
//        Console.println(tab);


//        Console.println("☛2048 por Joao Costa☚");
//        Console.println("1-Novo Jogo");
//        Console.println("2-Jogo Salvo");
//        Console.println("3-Sair");
//        Console.print("ESCOLHA ENTRE 1, 2, 3 NAO ERRE DNV SE NAO O SEU PC VAI EXPLODIR: ");

//    public void colocaCartaAleatoria() {
//        Random rand = new Random();
//
//        int totalLinhas = getTotalLinhas();
//        int totalColunas = getTotalColunas();
//
//
//        if (totalLinhas == 0 || totalColunas == 0) {
//            Console.println("O tabuleiro está vazio, não é possível adicionar uma carta.");
//            return;
//        }
//
//        int linha, coluna;
//        do {
//            linha = rand.nextInt(totalLinhas);
//            coluna = rand.nextInt(totalColunas);
//        } while (getPilha(linha, coluna).getTamanho() != 0);
//
//        colocaCarta(linha, coluna, a3);
//    }
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
//        } else if (cartaAtual instanceof carta && cartaDestino instanceof carta) {
//            carta cartaAtualTyped = (carta) cartaAtual;
//            carta cartaDestinoTyped = (carta) cartaDestino;
//
//            if (cartaAtualTyped.equals(a3) && cartaDestinoTyped.equals(a3)) {
//
//                pegaCarta(linha, coluna);
//                pegaCarta(novaLinha, novaColuna);
//
//                colocaCarta(novaLinha, novaColuna, a4);
//                colocaCarta(linha, coluna, teste);
//            }
//
//            if (cartaAtualTyped.equals(a4) && cartaDestinoTyped.equals(a4)) {
//
//                pegaCarta(linha, coluna);
//                pegaCarta(novaLinha, novaColuna);
//
//                colocaCarta(novaLinha, novaColuna, a8);
//
//                colocaCarta(linha, coluna, teste);
//                return true;
//            }
//
//            if (cartaAtualTyped.equals(a8) && cartaDestinoTyped.equals(a8)) {
//
//                pegaCarta(linha, coluna);
//                pegaCarta(novaLinha, novaColuna);
//
//                colocaCarta(novaLinha, novaColuna, a16);
//
//                colocaCarta(linha, coluna, teste);
//                return true;
//            }
//
//            if (cartaAtualTyped.equals(a16) && cartaDestinoTyped.equals(a16)) {
//
//                pegaCarta(linha, coluna);
//                pegaCarta(novaLinha, novaColuna);
//
//                colocaCarta(novaLinha, novaColuna, a32);
//                colocaCarta(linha, coluna, teste);
//                return true;
//            }
//
//            if (cartaAtualTyped.equals(a32) && cartaDestinoTyped.equals(a32)) {
//
//                pegaCarta(linha, coluna);
//                pegaCarta(novaLinha, novaColuna);
//
//                colocaCarta(novaLinha, novaColuna, a32);
//
//                colocaCarta(linha, coluna, teste);
//                return true;
//            }
//
//            if (cartaAtualTyped.equals(a32) && cartaDestinoTyped.equals(a32)) {
//
//                pegaCarta(linha, coluna);
//                pegaCarta(novaLinha, novaColuna);
//
//                colocaCarta(novaLinha, novaColuna, a64);
//
//                colocaCarta(linha, coluna, teste);
//                return true;
//            }
//
//            if (cartaAtualTyped.equals(a64) && cartaDestinoTyped.equals(a64)) {
//
//                pegaCarta(linha, coluna);
//                pegaCarta(novaLinha, novaColuna);
//
//                colocaCarta(novaLinha, novaColuna, a128);
//
//                colocaCarta(linha, coluna, teste);
//                return true;
//            }
//
//            if (cartaAtualTyped.equals(a128) && cartaDestinoTyped.equals(a128)) {
//
//                pegaCarta(linha, coluna);
//                pegaCarta(novaLinha, novaColuna);
//
//                colocaCarta(novaLinha, novaColuna, a256);
//
//                colocaCarta(linha, coluna, teste);
//                return true;
//            }
//
//            if (cartaAtualTyped.equals(a256) && cartaDestinoTyped.equals(a256)) {
//
//                pegaCarta(linha, coluna);
//                pegaCarta(novaLinha, novaColuna);
//
//                colocaCarta(novaLinha, novaColuna, a512);
//
//                colocaCarta(linha, coluna, teste);
//                return true;
//            }
//
//            if (cartaAtualTyped.equals(a512) && cartaDestinoTyped.equals(a512)) {
//
//                pegaCarta(linha, coluna);
//                pegaCarta(novaLinha, novaColuna);
//
//                colocaCarta(novaLinha, novaColuna, a1024);
//
//                colocaCarta(linha, coluna, teste);
//                return true;
//            }
//
//            if (cartaAtualTyped.equals(a1024) && cartaDestinoTyped.equals(a1024)) {
//
//                pegaCarta(linha, coluna);
//                pegaCarta(novaLinha, novaColuna);
//
//                colocaCarta(novaLinha, novaColuna, a2048);
//
//                colocaCarta(linha, coluna, teste);
//                return true;
//            } else if (cartaAtualTyped.equals(a2048) || cartaDestinoTyped.equals(a2048)) {
//
//                Console.println("Parabéns! Você ganhou o jogo!");
//                return true;
//            }
//        }
//        return false;
//    }
//}
}
//            if (cartaAtualTyped.equals(a3) && cartaDestinoTyped.equals(a3)) {
//
//                pegaCarta(linha, coluna);
//                pegaCarta(novaLinha, novaColuna);
//
//                colocaCarta(novaLinha, novaColuna, a4);
//                colocaCarta(linha, coluna, teste);
//                colocaCartaAleatoria();
//            }
//
//            if (cartaAtualTyped.equals(a4) && cartaDestinoTyped.equals(a4)) {
//
//                pegaCarta(linha, coluna);
//                pegaCarta(novaLinha, novaColuna);
//
//                colocaCarta(novaLinha, novaColuna, a8);
//
//                colocaCarta(linha, coluna, teste);
//                return true;
//            }
//
//            if (cartaAtualTyped.equals(a8) && cartaDestinoTyped.equals(a8)) {
//
//                pegaCarta(linha, coluna);
//                pegaCarta(novaLinha, novaColuna);
//
//                colocaCarta(novaLinha, novaColuna, a16);
//
//                colocaCarta(linha, coluna, teste);
//                return true;
//            }
//
//            if (cartaAtualTyped.equals(a16) && cartaDestinoTyped.equals(a16)) {
//
//                pegaCarta(linha, coluna);
//                pegaCarta(novaLinha, novaColuna);
//
//                colocaCarta(novaLinha, novaColuna, a32);
//                colocaCarta(linha, coluna, teste);
//                return true;
//            }
//
//            if (cartaAtualTyped.equals(a32) && cartaDestinoTyped.equals(a32)) {
//
//                pegaCarta(linha, coluna);
//                pegaCarta(novaLinha, novaColuna);
//
//                colocaCarta(novaLinha, novaColuna, a32);
//
//                colocaCarta(linha, coluna, teste);
//                return true;
//            }
//
//            if (cartaAtualTyped.equals(a32) && cartaDestinoTyped.equals(a32)) {
//
//                pegaCarta(linha, coluna);
//                pegaCarta(novaLinha, novaColuna);
//
//                colocaCarta(novaLinha, novaColuna, a64);
//
//                colocaCarta(linha, coluna, teste);
//                return true;
//            }
//
//            if (cartaAtualTyped.equals(a64) && cartaDestinoTyped.equals(a64)) {
//
//                pegaCarta(linha, coluna);
//                pegaCarta(novaLinha, novaColuna);
//
//                colocaCarta(novaLinha, novaColuna, a128);
//
//                colocaCarta(linha, coluna, teste);
//                return true;
//            }
//
//            if (cartaAtualTyped.equals(a128) && cartaDestinoTyped.equals(a128)) {
//
//                pegaCarta(linha, coluna);
//                pegaCarta(novaLinha, novaColuna);
//
//                colocaCarta(novaLinha, novaColuna, a256);
//
//                colocaCarta(linha, coluna, teste);
//                return true;
//            }
//
//            if (cartaAtualTyped.equals(a256) && cartaDestinoTyped.equals(a256)) {
//
//                pegaCarta(linha, coluna);
//                pegaCarta(novaLinha, novaColuna);
//
//                colocaCarta(novaLinha, novaColuna, a512);
//
//                colocaCarta(linha, coluna, teste);
//                return true;
//            }
//
//            if (cartaAtualTyped.equals(a512) && cartaDestinoTyped.equals(a512)) {
//
//                pegaCarta(linha, coluna);
//                pegaCarta(novaLinha, novaColuna);
//
//                colocaCarta(novaLinha, novaColuna, a1024);
//
//                colocaCarta(linha, coluna, teste);
//                return true;
//            }
//
//            if (cartaAtualTyped.equals(a1024) && cartaDestinoTyped.equals(a1024)) {
//
//                pegaCarta(linha, coluna);
//                pegaCarta(novaLinha, novaColuna);
//
//                colocaCarta(novaLinha, novaColuna, a2048);
//
//                colocaCarta(linha, coluna, teste);
//                return true;
//            } else if (cartaAtualTyped.equals(a2048) || cartaDestinoTyped.equals(a2048)) {
//
//                Console.println("Parabéns! Você ganhou o jogo!");
//                return true;
//            }
//        }
//        return false;
//    }
//}









