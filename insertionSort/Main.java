//https://liveexample.pearsoncmg.com/liang/animation/web/SelectionSort.html
//https://marciobueno.com/
//https://www.geeksforgeeks.org/insertion-sort-algorithm/
//https://www.javatpoint.com/insertion-sort-in-java

package insertionSort;
import java.util.Random;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
       
        int[] v = new int[16];
        preencher(v);
        insertionSort(v);
  
    }


   private static void preencher(int[] v) {
    Random gerador = new Random();
       for(int i = 0; i < v.length ; ++i){
        v [i]= gerador.nextInt(100)+1;
       }
    }


private static void insertionSort(int[] v) // tam é opcional
   {
    //ou v.length
       for(int i = 1; i < v.length ;i++){
        int temp = v [i];
        int j = i-1;
        while (j >= 0 && temp< v[j]) {
            v[j+1] = v[j];
            --j;
        }
        v[j+1]=temp;
       }
    }

/*
 private static void preencher(int[] v) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha 16 números diferentes para nosso vetor: ");
        for(int i = 0; i > 16; i++){
            System.out.println("Valor " + (i + 1) + ":");
            v[i] = input.nextInt();
        }
    } */

}
