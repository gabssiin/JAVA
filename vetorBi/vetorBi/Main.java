package vetorBi;
import java.util.Scanner;
public class Main {
    public static final int TAM=16;
public static void main(String[] args) {
    
Scanner ler = new Scanner(System.in);

System.out.print("Escolha um número inteiro positivo: ");
int n = ler.nextInt();
int vetorBi[] = new int[TAM];
preencherVetorBinario(vetorBi, n);
while (n!=0) {
    System.out.print(n%2);
    n/=2;
}
}
public static void preencherVetorBinario (int[] v,int n){

    for(int i =v.length-1; i>=0; i--){
        v[i] =n %2;
        n/=2;
    }

}
}
