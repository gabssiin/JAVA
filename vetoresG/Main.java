package vetoresG;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int v[] = {3,2,8,7,5,4};
        //System.out.print("Tamanho do vetor"+ v.length); para usar o length de forma mais inteligente:
      /*   
        for(int c=0; c<=v.length-1; c++){
           // System.out.print(v[c] + "-" );
            System.out.println("Na posição: " +c+ "temos o valor: " +v[c]);

        } 
/*
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        int tot[] = { 31, 28,31,30,31,30,31,31,30,31,30,31};
            for (int c=0;c<mes.length;c++){
                    System.out.println("o mês de: "+mes[c]+" tem: "+tot[c]+" dias");
            }
             */
            /* 
            double vetor[] = {3.1,8.5,9,-7};
            //quero que fique em ordem usando apenas uma função de arrays
            Arrays.sort(vetor);
            for (double d : vetor) {
                System.out.println(d+" ");
                
            }*/

            double vetor[] = {3.1,8.5,9,-7};
           int pos = Arrays.binarySearch(vetor,1)
            for (double d : vetor) {
                System.out.println(d+" ");
                
            }





        }

    }

