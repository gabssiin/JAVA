/*Faça um programa que leia um vetor N[20]. Troque a seguir, o primeiro elemento com o último, o segundo elemento com o penúltimo, etc., até trocar o 10º com o 11º. Mostre o vetor modificado.

Entrada
A entrada contém 20 valores inteiros, positivos ou negativos.

Saída
Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor e Y é o valor armazenado naquela posição. */

package beecrowd.trocaemvetor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] N = new int[20];

        // Lendo os 20 valores inteiros
        for (int i = 0; i < 20; i++) {
            N[i] = ler.nextInt();
        }

        // Trocando os elementos
        for (int i = 0; i < 10; i++) {
            int temp = N[i];
            N[i] = N[19 - i]; // Troca o elemento i com o elemento correspondente do final
            N[19 - i] = temp;
        }

        // Exibindo o vetor modificado
        for (int i = 0; i < 20; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }

        ler.close(); // Fecha o scanner


        
    }
}
