package aula3;

import java.util.Scanner;

public class Main {
    public static int QTD_ALUNOS = 6;
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        double[] notas = new double[QTD_ALUNOS];
        double somatorio = 0.0, media;

        // Coleta as notas e calcula o somatório
        for (int i = 0; i < QTD_ALUNOS; i++) {
            System.out.printf("Digite a nota do aluno %d: ", i + 1);
            notas[i] = ler.nextDouble();
            somatorio += notas[i];
        }

        // Chama a função para calcular a média geral
        media = mediaGeral(somatorio);
        System.out.printf("Média: %.2f\n", media);
        mediaGeral(somatorio);
        // Exibe notas acima da média
        for (int i = 0; i < QTD_ALUNOS; i++) {
            if (notas[i] > media) {
                System.out.printf("notas[%d] = %.2f\n", i, notas[i]);
            }
        }

        // Calcula e imprime a maior nota
        double maior = notas[0];
        for (int i = 1; i < QTD_ALUNOS; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
        }
        System.out.printf("Maior nota = %.2f\n", maior);

        // Exibe todas as notas
        System.out.printf("-----------------------------\n");
        for (int i = 0; i < QTD_ALUNOS; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.printf("\n-----------------------------\n");

        // Calcula e imprime a nota mais próxima da média
        double maisProxMedia = notas[0];
        for (int i = 1; i < QTD_ALUNOS; i++) {
            if (Math.abs(media - notas[i]) < Math.abs(media - maisProxMedia)) {
                maisProxMedia = notas[i];
            }
        }
        System.out.printf("Nota mais próxima da média = %.2f\n", maisProxMedia);

        // Encontra o índice da nota mais próxima da média
        System.out.printf("\n-----------------------------\n");
        int maisProxMediaV2 = 0;
        for (int i = 1; i < QTD_ALUNOS; i++) {
            if (Math.abs(media - notas[i]) < Math.abs(media - notas[maisProxMediaV2])) {
                maisProxMediaV2 = i;
            }
        }
        System.out.printf("Nota mais próxima da média: notas[%d] = %.2f\n",
                maisProxMediaV2, notas[maisProxMediaV2]);
    }

    private static double mediaGeral(double somatorio) {
        double a = somatorio / QTD_ALUNOS;
        System.out.println("A média geral é:" +a ); // Cálculo da média geral
        return a;
    }
}
