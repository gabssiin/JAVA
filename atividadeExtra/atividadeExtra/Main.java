package atividadeExtra;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
 
public class Main {
 
    public static void main(String[] args) {
        String[] nomesAlgoritmos = {"Bubble Sort", "Insertion Sort", "Selection Sort"};
 
        for (String nomeAlgoritmo : nomesAlgoritmos) {
            executarETerminal(nomeAlgoritmo);
        }
    }
 
    public static void executarETerminal(String nomeAlgoritmo) {
        System.out.println("\nExecutando " + nomeAlgoritmo);
 
        int tamanho = 10; // Começar com o menor tamanho
        long tempoLimite = 300000; // 5 minutos em milissegundos
 
        while (true) {
            int[] vetorAleatorio = gerarVetorAleatorio(tamanho);
            int[] vetorCrescente = gerarVetorOrdenado(tamanho);
 
            long tempoAleatorio = 0;
            long tempoCrescente = 0;
            long tempoDecrescente = 0;
 
            // Medir o tempo dos algoritmos
            switch (nomeAlgoritmo) {
                case "Bubble Sort":
                    tempoAleatorio = bubbleSort(Arrays.copyOf(vetorAleatorio, tamanho));
                    tempoCrescente = bubbleSort(Arrays.copyOf(vetorCrescente, tamanho));
                    tempoDecrescente = bubbleSortDec(Arrays.copyOf(vetorCrescente, tamanho));
                    break;
                case "Insertion Sort":
                    tempoAleatorio = insertionSort(Arrays.copyOf(vetorAleatorio, tamanho));
                    tempoCrescente = insertionSort(Arrays.copyOf(vetorCrescente, tamanho));
                    tempoDecrescente = insertionSortDec(Arrays.copyOf(vetorCrescente, tamanho));
                    break;
                case "Selection Sort":
                    tempoAleatorio = selectionSort(Arrays.copyOf(vetorAleatorio, tamanho));
                    tempoCrescente = selectionSort(Arrays.copyOf(vetorCrescente, tamanho));
                    tempoDecrescente = selectionSortDec(Arrays.copyOf(vetorCrescente, tamanho));
                    break;
            }
 
            // Verificar se o tempo de execução ultrapassou o limite de 5 minutos
            if (tempoAleatorio > tempoLimite || tempoCrescente > tempoLimite || tempoDecrescente > tempoLimite) {
                if (tamanho <= 10) break; // Impede que o tamanho seja reduzido abaixo de 10
                tamanho /= 2; // Reduz o tamanho do vetor
                System.out.println("Tempo limite excedido. Reduzindo para " + tamanho);
                continue;
            }
 
            // Exibir os resultados no console
            System.out.printf("Tamanho: %,d | Aleatório: %,d ms | Crescente: %,d ms | Decrescente: %,d ms\n",
                    tamanho, tempoAleatorio, tempoCrescente, tempoDecrescente);
 
            tamanho *= 10;
            if (tamanho > 10000000) break;
        }
    }
 
    public static long bubbleSort(int[] vetor) {
        long inicioTempo = System.nanoTime();
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
        long fimTempo = System.nanoTime();
        return (fimTempo - inicioTempo) / 1000000;
    }
 
    public static long bubbleSortDec(int[] vetor) {
        long inicioTempo = System.nanoTime();
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] < vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
        long fimTempo = System.nanoTime();
        return (fimTempo - inicioTempo) / 1000000;
    }
 
    public static long insertionSort(int[] vetor) {
        long inicioTempo = System.nanoTime();
        int n = vetor.length;
        for (int i = 1; i < n; ++i) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = chave;
        }
        long fimTempo = System.nanoTime();
        return (fimTempo - inicioTempo) / 1000000;
    }
 
    public static long insertionSortDec(int[] vetor) {
        long inicioTempo = System.nanoTime();
        int n = vetor.length;
        for (int i = 1; i < n; ++i) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] < chave) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = chave;
        }
        long fimTempo = System.nanoTime();
        return (fimTempo - inicioTempo) / 1000000;
    }
 
    public static long selectionSort(int[] vetor) {
        long inicioTempo = System.nanoTime();
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int temp = vetor[indiceMinimo];
            vetor[indiceMinimo] = vetor[i];
            vetor[i] = temp;
        }
        long fimTempo = System.nanoTime();
        return (fimTempo - inicioTempo) / 1000000;
    }
 
    public static long selectionSortDec(int[] vetor) {
        long inicioTempo = System.nanoTime();
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j > n; j++) {
                if (vetor[j] < vetor[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int temp = vetor[indiceMinimo];
            vetor[indiceMinimo] = vetor[i];
            vetor[i] = temp;
        }
        long fimTempo = System.nanoTime();
        return (fimTempo - inicioTempo) / 1000000;
    }
 
    public static int[] gerarVetorAleatorio(int tamanho) {
        int[] vetor = new int[tamanho];
        Random aleatorio = new Random();
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = aleatorio.nextInt(tamanho);
        }
        return vetor;
    }
 
    public static int[] gerarVetorOrdenado(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = i;
        }
        return vetor;
    }
 
   
}