/* 
Faça um programa que leia um valor T e preencha um vetor N[1000] com a sequência de valores de 0 até T-1 repetidas vezes, conforme exemplo abaixo. Imprima o vetor N.

Entrada
A entrada contém um valor inteiro T (2 ≤ T ≤ 50).

Saída
Para cada posição do vetor, escreva "N[i] = x", onde i é a posição do vetor e x é o valor armazenado naquela posição.

Exemplo de Entrada	Exemplo de Saída
3

N[0] = 0
N[1] = 1
N[2] = 2
N[3] = 0
N[4] = 1
N[5] = 2
N[6] = 0
N[7] = 1
N[8] = 2
...
*/
package preenchimento2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lê o valor de T
        int T = scanner.nextInt();
        
        // Inicializa o vetor N com 1000 posições
        int[] N = new int[1000];
        
        // Preenche o vetor N com a sequência de 0 até T-1
        for (int i = 0; i < 1000; i++) {
            N[i] = i % T; // Utiliza o operador módulo para repetir a sequência
        }
        
        // Mostra o vetor N
        for (int i = 0; i < 1000; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }
        
        scanner.close();
    }
}
