/*2. Crie um programa que le 6 valores inteiros e, em seguida, mostre na tela os valores lidos. */


package ListaC04pdf.Ex2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int v[] = new int[6];
        preencher(v);
        mostrar(v);
    }

    private static void preencher(int[] v) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite 6 números para nosso vetor:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Valor " + (i + 1) + ":");
            v[i] = ler.nextInt();
        }
    }

    private static void mostrar(int[] v) {
        System.out.print("Aqui está o seu vetor: ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println(); // Para pular para a linha seguinte após a impressão do vetor
    }
}
