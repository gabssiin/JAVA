package repeticaoG;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*      
        int cc= 0;
        while (cc<4) {
            System.out.println("Cambalhota: "+(cc+1));
            cc++;
        }
        
        int cn = 0;
        while (cn<=10){

            cn++;
            if (cn==5||cn == 7) {
                continue;
            }
            System.out.println("CN"+cn);
        }


        int cb=0;
        while (cb<10) {
            cb++;
            if (cb==2||cb==4||cb==3) {
                continue;    
            }
            if (cb==7) {
                break;
            }
            System.out.println("CB: "+cb);
        }

        */
        /*
         * 
         * 
         * 
         * PARTE 2
         * 
         * USANDO DO
         *
         */

/* 
        int cd = 0;
        do{
           
            System.out.println("CD: "+cd); 
            cd++;
        } while(cd<4);

*/

/* 
        int n, s=0;
        String resp;
        Scanner ler= new Scanner(System.in);        
        do{

            System.out.println("Digite um número: ");
            n = ler.nextInt();
            s+=n; // s= s+n
            System.out.println("Quer continuar?  [S/N]");
            resp = ler.next();
        }while (resp.equals("5"));
        System.out.println("A soma de todos os valores é: " +s);
            */
        


/*
 * 
 * 
 * 
 * 
 * 
 * PARTE 3 
 * FOR IN RANGE
 * 
 * 
 * 
 * 
 * 
 */



/* 
for(int a = 0; a<=10;a++){
    System.out.println("te amo");
}
*/








        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha uma das nossas datas especiais: ");
        int repeticoes = scanner.nextInt();

        for (int i = 1; i <= repeticoes; i++) {
            System.out.println("Te amo meu bem!");
        }
    























    }
}
