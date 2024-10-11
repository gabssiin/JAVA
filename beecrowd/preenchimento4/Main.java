/*Neste problema você deverá ler 15 valores colocá-los em 2 vetores conforme estes valores forem pares ou ímpares. Só que o tamanho de cada um dos dois vetores é de 5 posições. Então, cada vez que um dos dois vetores encher, você deverá imprimir todo o vetor e utilizá-lo novamente para os próximos números que forem lidos. Terminada a leitura, deve-se imprimir o conteúdo que restou em cada um dos dois vetores, imprimindo primeiro os valores do vetor impar. Cada vetor pode ser preenchido tantas vezes quantas for necessário.

Entrada
A entrada contém 15 números inteiros.

Saída
Imprima a saída conforme o exemplo abaixo.

Exemplo de Entrada	Exemplo de Saída
1
3
4
-4
2
3
8
2
5
-7
54
76
789
23
98

par[0] = 4
par[1] = -4
par[2] = 2
par[3] = 8
par[4] = 2
impar[0] = 1
impar[1] = 3
impar[2] = 3
impar[3] = 5
impar[4] = -7
impar[0] = 789
impar[1] = 23
par[0] = 54
par[1] = 76
par[2] = 98 */
package beecrowd.preenchimento4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] pares = new int[5];
        int[] impares = new int[5];
        int countPares = 0;
        int countImpares = 0;

        // Lê 15 números inteiros
        for (int i = 0; i < 15; i++) {
            int numero = scanner.nextInt();

            // Verifica se o número é par ou ímpar
            if (numero % 2 == 0) {
                pares[countPares] = numero;
                countPares++;

                // Se o vetor de pares estiver cheio, imprime e reinicia
                if (countPares == 5) {
                    for (int j = 0; j < 5; j++) {
                        System.out.printf("par[%d] = %d%n", j, pares[j]);
                    }
                    countPares = 0; // Reinicia o contador para pares
                }
            } else {
                impares[countImpares] = numero;
                countImpares++;

                // Se o vetor de ímpares estiver cheio, imprime e reinicia
                if (countImpares == 5) {
                    for (int j = 0; j < 5; j++) {
                        System.out.printf("impar[%d] = %d%n", j, impares[j]);
                    }
                    countImpares = 0; // Reinicia o contador para ímpares
                }
            }
        }

        // Imprime os valores restantes nos vetores, se houver
        if (countImpares > 0) {
            for (int j = 0; j < countImpares; j++) {
                System.out.printf("impar[%d] = %d%n", j, impares[j]);
            }
        }

        if (countPares > 0) {
            for (int j = 0; j < countPares; j++) {
                System.out.printf("par[%d] = %d%n", j, pares[j]);
            }
        }

        scanner.close();
    }
}

