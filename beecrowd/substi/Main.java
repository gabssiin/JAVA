/* Faça um programa que leia um vetor X[10]. Substitua a seguir, todos os valores nulos e negativos do vetor X por 1. Em seguida mostre o vetor X.

Entrada
A entrada contém 10 valores inteiros, podendo ser positivos ou negativos.

Saída
Para cada posição do vetor, escreva "X[i] = x", onde i é a posição do vetor e x é o valor armazenado naquela posição.

Exemplo de Entrada	Exemplo de Saída
0
-5
63
0
...

X[0] = 1
X[1] = 1
X[2] = 63
X[3] = 1
...*/ 

package beecrowd.substi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] X = new int[10];

        // Lê os 10 valores inteiros
        for (int i = 0; i < 10; i++) {
            X[i] = scanner.nextInt();
        }

        // Substitui valores nulos e negativos por 1
        for (int i = 0; i < 10; i++) {
            if (X[i] <= 0) {
                X[i] = 1;
            }
        }

        // Imprime o vetor X
        for (int i = 0; i < 10; i++) {
            System.out.printf("X[%d] = %d%n", i, X[i]);
        }

        scanner.close();
    }
}

