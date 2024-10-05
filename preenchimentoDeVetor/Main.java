/*
Leia um valor e faça um programa que coloque o valor lido na primeira posição de um vetor N[10]. Em cada posição subsequente, coloque o dobro do valor da posição anterior. Por exemplo, se o valor lido for 1, os valores do vetor devem ser 1,2,4,8 e assim sucessivamente. Mostre o vetor em seguida.

Entrada
A entrada contém um valor inteiro (V<=50).

Saída
Para cada posição do vetor, escreva "N[i] = X", onde i é a posição do vetor e X é o valor armazenado na posição i. O primeiro número do vetor N (N[0]) irá receber o valor de V.

Exemplo de Entrada	Exemplo de Saída
1

N[0] = 1
N[1] = 2
N[2] = 4
... */


 package preenchimentoDeVetor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lê um valor inteiro V
        int V = scanner.nextInt();
        
        // Inicializa o vetor N com 10 posições
        int[] N = new int[10];
        
        // Atribui o valor lido à primeira posição do vetor
        N[0] = V;
        
        // Preenche as demais posições com o dobro do valor da posição anterior
        for (int i = 1; i < 10; i++) {
            N[i] = N[i - 1] * 2;
        }
        
        // Mostra o vetor
        for (int i = 0; i < 10; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }
        
        scanner.close();
    }
}











