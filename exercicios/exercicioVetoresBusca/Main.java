package exercicios.exercicioVetoresBusca;
 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];
        preencher(vetor);
       

        // Verificando se o vetor está ordenado
        boolean ordenado = verificarOrdenacao(vetor);
        if (ordenado) {
            System.out.println("O vetor está ordenado.");
        } else {
            System.out.println("O vetor não está ordenado.");
        }

        // Laço para realizar buscas no vetor
        String continuar;
        do {
            System.out.print("Digite o valor a ser buscado: ");
            int valorBuscado = input.nextInt();

            // Chamando o método de busca apropriado
            int posicao;
            if (ordenado) {
                posicao = buscaBinaria(vetor, valorBuscado);
            } else {
                posicao = buscaSequencial(vetor, valorBuscado);
            }

            // Exibindo o resultado da busca
            if (posicao != -1) {
                System.out.println("Valor encontrado na posição: " + posicao);
            } else {
                System.out.println("Valor não encontrado no vetor.");
            }

            // Verificando se o usuário deseja realizar outra busca
            System.out.print("Deseja continuar buscando (s/n)? ");
            continuar = input.next();
        } while (continuar.equalsIgnoreCase("s"));

        input.close();
    }
 // Preenchendo o vetor com valores informados pelo usuário
    private static void preencher(int[] vetor) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite 10 valores inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetor[i] = input.nextInt();
            input.close();
        }
    }

    // Método para verificar se o vetor está ordenado em ordem crescente
    public static boolean verificarOrdenacao(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Método para realizar busca sequencial
    public static int buscaSequencial(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    // Método para realizar busca binária (o vetor precisa estar ordenado)
    public static int buscaBinaria(int[] vetor, int valor) {
        int inicio = 0;
        int fim = vetor.length - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (vetor[meio] == valor) {
                return meio;
            } else if (valor < vetor[meio]) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return -1;
    }
}
    

