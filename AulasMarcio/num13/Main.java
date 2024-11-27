
import java.util.Scanner;

public class Main {
  public static Scanner ler = new Scanner(System.in);
  public static final int QTD_PESSOAS = 5;

  public static void main(String[] args) {
    Pessoa13[] pessoas = new Pessoa13[QTD_PESSOAS];
    lerPessoas(pessoas);
    imprimir(pessoas);
    System.out.printf("A média de idade destas pessoas é %.2f\n",
        calcularMedia(pessoas));
    int indiceMaisAlta = pessoaMaisAlta(pessoas);
    System.out.println("A pessoa mais alta é " + pessoas[indiceMaisAlta].nome);
    System.out.print("A pessoa mais alta é ");
    System.out.println(pessoas[indiceMaisAlta]);
  }
  
  public static void imprimir(Pessoa13[] pessoas) {
    System.out.println("=============Listagem de Pessoas=============");
    for (int i = 0; i < pessoas.length; ++i) {
      System.out.println(pessoas[i]);
    }
  }

  public static void lerPessoas(Pessoa13[] pessoas) {
    for (int i = 0; i < pessoas.length; ++i) {
      System.out.println("Digite os dados da " + (i + 1) + "ª pessoa");
      pessoas[i] = lerPessoa();
    }
  }

  public static Pessoa13 lerPessoa() {
    System.out.print("Digite o nome da pessoa: ");
    String nome = ler.nextLine();
    System.out.print("Digite a idade da pessoa: ");
    int idade = ler.nextInt();
    System.out.print("Digite o peso da pessoa: ");
    double peso = ler.nextDouble();
    System.out.print("Digite a altura da pessoa: ");
    double altura = ler.nextDouble();
    ler.nextLine();
    return new Pessoa13(nome, idade, peso, altura);
  }

  public static double calcularMedia(Pessoa13[] pessoas) {
    double somatorio = 0.0;
    for (int i = 0; i < pessoas.length; ++i) {
      somatorio += pessoas[i].idade;
    }
    return somatorio / pessoas.length;
  }

  public static int pessoaMaisAlta(Pessoa13[] pessoas) {
    int maisAlta = 0;
    for (int i = 1; i < pessoas.length; ++i) {
      if (pessoas[i].altura > pessoas[maisAlta].altura) {
        maisAlta = i;
      }
    }
    return maisAlta;
  }
}