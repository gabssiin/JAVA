/*Faça um programa que leia um valor e apresente o número de Fibonacci correspondente a este valor lido. Lembre que os 2 primeiros elementos da série de Fibonacci são 0 e 1 e cada próximo termo é a soma dos 2 anteriores a ele. Todos os valores de Fibonacci calculados neste problema devem caber em um inteiro de 64 bits sem sinal.

Entrada
A primeira linha da entrada contém um inteiro T, indicando o número de casos de teste. Cada caso de teste contém um único inteiro N (0 ≤ N ≤ 60), correspondente ao N-esimo termo da série de Fibonacci.

Saída
Para cada caso de teste da entrada, imprima a mensagem "Fib(N) = X", onde X é o N-ésimo termo da série de Fibonacci. */



package fib;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lê o número de casos de teste
        int T = scanner.nextInt();
        
        // Processa cada caso de teste
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            long fibValue = fibonacci(N);
            System.out.println("Fib(" + N + ") = " + fibValue);
        }
        
        scanner.close();
    }

    // Método para calcular o N-ésimo número de Fibonacci
    private static long fibonacci(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;

        long a = 0;
        long b = 1;
        long fib = 0;

        for (int i = 2; i <= N; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }

        return fib;
    }
}
