/*12. Fazer um programa para ler 5 valores e, em seguida, mostrar todos os valores lidos
juntamente com o maior, o menor e a media dos valores. */

/*13. Fazer um programa para ler 5 valores e, em seguida, mostrar a posic¸ao onde se encon- ˜
tram o maior e o menor valor.
 */


 package exercicios.exercicioVetoresBusca.ListaC04pdf.Ex12;

 import java.util.Scanner;
 
 public class Main {
     public static void main(String[] args) {
         int v[] = new int[5];
         preencher(v);
         mostrar(v);
         nummaior(v);
         nummenor(v);
         calcularMedia(v);
         posicaoDoMaior(v);
         posicaoDoMenor(v);
     }
 
     private static void posicaoDoMenor(int[] v) {
         int menor = v[0];
         int posMenor = 0; // Inicializa com a posição do primeiro valor
         for (int i = 1; i < v.length; i++) {
             if (v[i] < menor) {
                 menor = v[i];
                 posMenor = i; // Atualiza a posição do menor valor
             }
         }
         System.out.println("Aqui está a posição do seu menor número: " + posMenor);
     }
 
     private static void posicaoDoMaior(int[] v) {
         int maior = v[0];
         int posMaior = 0; // Inicializa com a posição do primeiro valor
         for (int i = 1; i < v.length; i++) {
             if (v[i] > maior) {
                 maior = v[i];
                 posMaior = i; // Atualiza a posição do maior valor
             }
         }
         System.out.println("Aqui está a posição do seu maior número: " + posMaior);
     }
 
     private static void nummaior(int[] v) {
         int maior = v[0];
         for (int i = 1; i < v.length; i++) {
             if (v[i] > maior) {
                 maior = v[i];
             }
         }
         System.out.println("Aqui está seu maior número: " + maior);
     }
 
     private static void nummenor(int[] v) {
         int menor = v[0];
         for (int i = 1; i < v.length; i++) {
             if (v[i] < menor) {
                 menor = v[i];
             }
         }
         System.out.println("Aqui está seu menor número: " + menor);
     }
 
     private static void calcularMedia(int[] v) {
         int soma = 0;
         for (int num : v) {
             soma += num;
         }
         double media = soma / (double) v.length;
         System.out.println("A média dos valores é: " + media);
     }
 
     private static void preencher(int[] v) {
         Scanner ler = new Scanner(System.in);
         System.out.println("Digite 5 números para nosso vetor:");
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
         System.out.println(); // Para pular para a linha seguinte após a impressão do vetor
     }
 }
 