package vetoresOrdenadosptum;
import java.util.Arrays;
/* 
Faça um programa em Java modular (isto é, cada funcionalidade deve ser implementada em uma função que será chamada no main) que:
Crie um vetor de tamanho 50 e preencha com valores aleatórios entre 1 e 10 *
Ordene esse vetor utilizando o algoritmo do bubble sort *
Imprima o menor e maior valor deste vetor (OBS: não pode utilizar nenhum comando de repetição (laço) nesta questão) *
Imprima a mediana deste vetor (OBS: não pode utilizar nenhum comando de repetição (laço) nesta questão)  *
Imprima uma listagem onde cada linha tem um valor que está no vetor e a quantidade de vezes que esse valor aparece no vetor *
Crie um novo vetor que não tenha valores repetidos (OBS: você deve criar esse vetor do tamanho exato necessário)  v.length?
OBS: a entrega deve ser realizada anexando um arquivo .java e um print screen (ou vários) mostrando o resultado da execução do seu programa
*/
import java.util.Random;


public class Main{
    public static void main(String[] args) {
        int[] v = new int[50];
     preencher(v);
     System.out.println("Antes da ordenação: ");
     imprimir(v);
     bubbleSort(v,v.length);
     System.out.println("Depois da ordenação com bubbleSort: ");
     imprimir(v);
     System.out.println(" ");
     imprimirMaioreMenor(v);
     imprimirMediana(v);
     System.out.println(" ");
     System.out.println("Aqui está a quantidade de aparições de cada valor no vetor: ");
     imprimirFrequencias(v);
     System.out.println(" ");
     vetornaorepetido(v);
     

    }
    
    public static int[] vetornaorepetido(int[] v) {
    
        int tamanhoUnico = (int) Arrays.stream(v).distinct().count();
        int[] vSemRepetidos = new int[tamanhoUnico];
        
    
        int index = 0;
        for (int elemento : v) {
            if (index == 0 || elemento != vSemRepetidos[index - 1]) {
                vSemRepetidos[index] = elemento;
                index++;
            }
        }
        
       
        System.out.println("Vetor sem valores repetidos: ");
        imprimir(vSemRepetidos);
        
        return vSemRepetidos;
    }
    

    public static void imprimirFrequencias(int[] v) {
        if (v.length == 0) {
            System.out.println("Vetor vazio.");
            return;
        }
        int elementoAtual = v[0];
        int contagem = 1;
    
        for (int i = 1; i < v.length; i++) {
            if (v[i] == elementoAtual) {
                contagem++;
            } else {
                System.out.println("O valor: "+ elementoAtual + " aparece: " + contagem + " vezes");
                elementoAtual = v[i];
                contagem = 1;
            }
        }
        System.out.println("O valor: "+ elementoAtual + " aparece: " + contagem + " vezes"); // Imprime o último elemento
    }




    public static void imprimirMediana(int[] v) {
      if (v.length == 0) {
        System.out.println("não existe vetor preenchido");
      } else{
        int meio = v.length / 2;
        double mediana;
        if (v.length % 2 == 0 ) {
            mediana = (v[meio - 1] + v[meio]) / 2.0; 
        } else { // vetor se for impar
            mediana = v[meio];
        }
        System.out.println("Aqui está a sua mediana: "+ mediana);
      }
    }

    public static void imprimirMaioreMenor(int[] v) {
        if (v.length == 0) {
            System.out.println("esse vetor não está preenchido");
        }
            else{
                int menor = v[0];
                int maior = v[v.length - 1];
                System.out.println("Nosso menor número é: "+ menor);
                System.out.println("Nosso maior número é: "+ maior);
            }   
        }
    

    public static void preencher(int v[]) {
        Random gerador = new Random();
        for (int i = 0; i < v.length; ++i) {
            v[i] = gerador.nextInt(10) + 1;
        }
    }
    public static void imprimir(int[] v) {
        System.out.print("{");
        if (v.length != 0) {
            System.out.print(" " + v[0]);
            for (int i = 1; i < v.length; ++i) {
                System.out.print(", " + v[i]);
            }
        }
        System.out.println(" }");
}



public static void bubbleSort(int[] v, int tam) {
    int fim = tam - 2, pos = 0;
    boolean trocou = true;
    while (trocou){
        trocou = false;
        for(int i = 0; i <= fim; i++){
            if (v[i]> v[i+1]) {
                int aux = v[i];
                v[i] = v[i+1];
                v[i+1]= aux;
                pos = i;
                trocou = true; 
            }
        }
        fim = pos;
    }

}
}

/*
public static void bubbleSort (int[] v, int tam) {
        int fim = tam - 2, pos = 0;
        boolean trocou = true;
        while (trocou) {
            trocou = false;
            for (int i = 0; i <= fim; i++) {
                if (v[i] > v[i+1]) {
                    int aux = v[i];
                    v[i] = v[i + 1];
                    v[i+1] = aux;
                    pos = i;
                    trocou = true;
                }
            }
            fim = pos-1;
        }
    } */