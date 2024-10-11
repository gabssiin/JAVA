package ListaC04pdf.Ex3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] v = new double[10];
        double[] quadrados = new double[10];
        
        armazenar(v);
        quadrados = calcularQuadrado(v);
        
        imprimir(v, quadrados);
    }

    private static double[] calcularQuadrado(double[] v) {
        double[] quadrados = new double[v.length];
        for (int i = 0; i < v.length; i++) {
            quadrados[i] = v[i] * v[i]; // Calcula o quadrado
        }
        return quadrados;
    }

    private static void armazenar(double[] v) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            v[i] = ler.nextDouble();
        }
        ler.close();
    }

    private static void imprimir(double[] v, double[] quadrados) {
        System.out.println("\nNúmeros e seus quadrados:");
        for (int i = 0; i < v.length; i++) {
            System.out.println("Número: " + v[i] + " -> Quadrado: " + quadrados[i]);
        }
    }
}
