/*7. Escreva um programa que leia 10 numeros inteiros e os armazene em um vetor. Imprima
o vetor, o maior elemento e a posicao que ele se encontra */

package ListaC04pdf.Ex7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] v = new int[10]; 
        preencher(v);   
        mostrar(v);
        mostrarElemento(v);
    }

    private static void mostrarElemento(int[] v) {
        int maior = v[0];
        int posicao = 0;

        for (int i = 1; i < v.length; i++) {
            if (v[i] > maior) {
                maior = v[i];
                posicao = i;
            }
        }

        System.out.println("Aqui está o maior número: " + maior + ", encontrado na posição: " + posicao);
    }

    private static void preencher(int[] v) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite 10 números para nosso vetor:");
        for (int i = 0; i < v.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            v[i] = ler.nextInt();
            ler.close();
        }
    }

    private static void mostrar(int[] v) {
        System.out.print("Aqui está o seu vetor: ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}
