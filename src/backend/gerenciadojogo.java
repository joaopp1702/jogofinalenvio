package backend;

import mecanicas.Tabuleiro;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class gerenciadojogo {

    public static void salvarJogo(Tabuleiro tabuleiro, String nomeArquivo) {
        try (PrintWriter writer = new PrintWriter(new File(nomeArquivo))) {
            // Escrever os dados do tabuleiro no arquivo
            writer.println(tabuleiro.toString());
            System.out.println("Jogo salvo com sucesso!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Erro ao salvar o jogo.");
        }
    }













//    public static Tabuleiro carregarJogo(String nomeArquivo) {
//        try (Scanner scanner = new Scanner(new File(nomeArquivo))) {
//            int linhas = scanner.nextInt();
//            int colunas = scanner.nextInt();
//            Tabuleiro tabuleiro = new Tabaleiro(linhas, colunas);
//
//            for (int i = 0; i < linhas; i++) {
//                for (int j = 0; j < colunas; j++) {
//                    int valorCarta = scanner.nextInt();
//                    carta carta = new carta(valorCarta);
//                    tabuleiro.setCarta(i, j, carta);
//                }
//            }
//
//            return tabuleiro;
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            return null;

//    public static Tabuleiro carregarJogo(String nomeArquivo) {
//        try (Scanner scanner = new Scanner(new File(nomeArquivo))) {
//            // Ler os dados do arquivo e reconstruir o tabuleiro
//            int tamanhoTabuleiro = Integer.parseInt(scanner.nextLine()); // Ler o tamanho do tabuleiro
//            int[][] matrizTabuleiro = new int[tamanhoTabuleiro][tamanhoTabuleiro];
//            for (int i = 0; i < tamanhoTabuleiro; i++) {
//                String linha = scanner.nextLine();
//                String[] valores = linha.split(" ");
//                for (int j = 0; j < tamanhoTabuleiro; j++) {
//                    matrizTabuleiro[i][j] = Integer.parseInt(valores[j]);
//                }
//            }
//            // Aqui você deve criar e retornar o objeto Tabuleiro com base na matrizTabuleiro
//            // Por enquanto, apenas imprime a matriz para fins de demonstração
//            System.out.println("Tabuleiro carregado:");
//            for (int i = 0; i < tamanhoTabuleiro; i++) {
//                for (int j = 0; j < tamanhoTabuleiro; j++) {
//                    System.out.print(matrizTabuleiro[i][j] + " ");
//                }
//                System.out.println();
//            }
//            return null; // Substitua null pelo tabuleiro reconstruído
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            System.out.println("Erro ao carregar o jogo.");
//            return null;
//        }
//    }
//
}
