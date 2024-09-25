import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static final int TAM = 16;
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int[] binario1 = new int[TAM];
        int[] binario2 = new int[TAM];
        System.out.print("Digite um número inteiro: ");
        int num1 = ler.nextInt();
        System.out.print("Digite outro número inteiro: ");
        int num2 = ler.nextInt();
        preencherVetorBinario(binario1, num1);
        imprimirVetor(binario1);
        preencherVetorBinario(binario2, num2);
        imprimirVetor(binario2);
    }
    public static void preencherVetorBinario(int[] vetor, int num) {
        for (int i = vetor.length - 1; i >= 0; i--) {
            vetor[i] = num % 2;
            num /= 2;
        }
        if (num != 0) {
            System.out.println("Erro: não deu para representar " + num);
        }
    }
    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}