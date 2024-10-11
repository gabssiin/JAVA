/*Leia um valor X. Coloque este valor na primeira posição de um vetor N[100]. Em cada posição subsequente de N (1 até 99), coloque a metade do valor armazenado na posição anterior, conforme o exemplo abaixo. Imprima o vetor N.

Entrada
A entrada contem um valor de dupla precisão com 4 casas decimais.

Saída
Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor e Y é o valor armazenado naquela posição. Cada valor do vetor deve ser apresentado com 4 casas decimais. */

package beecrowd.preenchimento3;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Lê um valor de dupla precisão com 4 casas decimais
        double x = ler.nextDouble();

        // Inicializa o vetor com 100 posições
        double[] N = new double[100];

        // A primeira posição recebe o valor X
        N[0] = x;

        // Preenche as demais posições com a metade do valor anterior
        for (int i = 1; i < 100; i++) {
            N[i] = N[i - 1] / 2;
        }

        // Imprime os valores do vetor com 4 casas decimais
        for (int i = 0; i < 100; i++) {
            System.out.printf("N[%d] = %.4f%n", i, N[i]);
        }

        ler.close();
    }
}
