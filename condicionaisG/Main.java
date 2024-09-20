package condicionaisG;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá Mundo!");
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantas pernas?");
        int p = ler.nextInt();
        String t;
        System.out.print("Isso é uma ");
        switch (p) {
            case 1:
            t="Saci";
            break;
            case 2:
            t=" Bipede";
                break;
                case 4:
                t=" Quadrupede";
                break;
                case 6,8:
                t=" Aranha";
                break;

            default:
            t= " ET";
                break;
        }
        System.out.println(t);
        ler.close();
    }
    
}
