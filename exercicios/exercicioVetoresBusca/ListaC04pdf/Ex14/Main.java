/* Faca um programa que leia um vetor de 10 posic¸oes e verifique se existem valores iguais ˜
e os escreva na tela.*/
package exercicios.exercicioVetoresBusca.ListaC04pdf.Ex14;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] v = new int[10];
        preencher(v);
        mostrar(v);
        mostrarIguais(v);
    }

    private static void preencher(int[] v) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite 10 números para nosso vetor:");
        for (int i = 0; i < 10; i++) {
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
        System.out.println(); // Pula para a linha seguinte após a impressão do vetor
    }

    private static void mostrarIguais(int[] v) {
        Set<Integer> vistos = new HashSet<>();
        Set<Integer> repetidos = new HashSet<>();

        for (int num : v) {
            if (vistos.contains(num)) {
                repetidos.add(num);
            } else {
                vistos.add(num);
            }
        }

        if (repetidos.isEmpty()) {
            System.out.println("Não existem valores iguais no vetor.");
        } else {
            System.out.print("Os valores iguais são: ");
            for (int num : repetidos) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
