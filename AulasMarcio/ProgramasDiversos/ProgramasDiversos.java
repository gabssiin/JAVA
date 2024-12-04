import java.util.Scanner;

public class ProgramasDiversos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // Menu de opções
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Calculadora Simples");
            System.out.println("2 - Cálculo do IMC");
            System.out.println("3 - Cálculo do INSS");
            System.out.println("4 - Cálculo do Imposto de Renda");
            System.out.println("5 - Números Pares e Ímpares");
            System.out.println("6 - Fatorial de um Número");
            System.out.println("7 - Tabuada");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Calculadora Simples
                    System.out.print("Digite o primeiro número: ");
                    int num1 = scanner.nextInt();

                    System.out.print("Digite o segundo número: ");
                    int num2 = scanner.nextInt();

                    // Operações
                    int soma = num1 + num2;
                    int subtracao = num1 - num2;
                    int multiplicacao = num1 * num2;
                    double divisao = num2 != 0 ? (double) num1 / num2 : Double.NaN;

                    // Exibindo resultados
                    System.out.println("Soma: " + soma);
                    System.out.println("Subtração: " + subtracao);
                    System.out.println("Multiplicação: " + multiplicacao);
                    System.out.println("Divisão: " + (divisao == Double.NaN ? "Erro: Divisão por zero!" : divisao));
                    break;

                case 2:
                    // Cálculo do IMC
                    System.out.print("Digite seu peso (em kg): ");
                    double peso = scanner.nextDouble();

                    System.out.print("Digite sua altura (em metros): ");
                    double altura = scanner.nextDouble();

                    // Cálculo do IMC
                    double imc = peso / (altura * altura);
                    System.out.println("Seu IMC é: " + imc);

                    // Classificação do IMC
                    if (imc < 18.5) {
                        System.out.println("Você está abaixo do peso.");
                    } else if (imc >= 18.5 && imc < 24.9) {
                        System.out.println("Você está com peso normal.");
                    } else if (imc >= 25 && imc < 29.9) {
                        System.out.println("Você está com sobrepeso.");
                    } else {
                        System.out.println("Você está obeso.");
                    }
                    break;

                case 3:
                    // Cálculo do INSS
                    System.out.print("Digite seu salário bruto: ");
                    double salarioBruto = scanner.nextDouble();

                    double inss = 0;
                    if (salarioBruto <= 1302) {
                        inss = salarioBruto * 0.075;
                    } else if (salarioBruto <= 2571.29) {
                        inss = salarioBruto * 0.09;
                    } else if (salarioBruto <= 3856.94) {
                        inss = salarioBruto * 0.12;
                    } else if (salarioBruto <= 7507.49) {
                        inss = salarioBruto * 0.14;
                    } else {
                        inss = 7507.49 * 0.14; // Teto do INSS
                    }

                    double salarioLiquido = salarioBruto - inss;
                    System.out.println("Valor da contribuição ao INSS: R$ " + inss);
                    System.out.println("Salário líquido: R$ " + salarioLiquido);
                    break;

                case 4:
                    // Cálculo do Imposto de Renda
                    System.out.print("Digite seu salário bruto: ");
                    salarioBruto = scanner.nextDouble();

                    double impostoDeRenda = 0;
                    if (salarioBruto <= 1903.98) {
                        impostoDeRenda = 0;
                    } else if (salarioBruto <= 2826.65) {
                        impostoDeRenda = salarioBruto * 0.075 - 142.80;
                    } else if (salarioBruto <= 3751.05) {
                        impostoDeRenda = salarioBruto * 0.15 - 354.80;
                    } else if (salarioBruto <= 4664.68) {
                        impostoDeRenda = salarioBruto * 0.225 - 636.13;
                    } else {
                        impostoDeRenda = salarioBruto * 0.275 - 869.36;
                    }

                    System.out.println("Valor do imposto de renda: R$ " + impostoDeRenda);
                    break;

                case 5:
                    // Números Pares e Ímpares
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextInt();

                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextInt();

                    System.out.println("Números pares entre " + num1 + " e " + num2 + ":");
                    for (int i = num1; i <= num2; i++) {
                        if (i % 2 == 0) {
                            System.out.println(i);
                        }
                    }

                    System.out.println("Números ímpares entre " + num1 + " e " + num2 + ":");
                    for (int i = num1; i <= num2; i++) {
                        if (i % 2 != 0) {
                            System.out.println(i);
                        }
                    }
                    break;

                case 6:
                    // Fatorial de um Número
                    System.out.print("Digite um número inteiro positivo: ");
                    int numero = scanner.nextInt();

                    int fatorial = 1;
                    int i = numero;

                    while (i > 1) {
                        fatorial *= i;
                        i--;
                    }

                    System.out.println("O fatorial de " + numero + " é: " + fatorial);
                    break;

                case 7:
                    // Tabuada
                    System.out.print("Digite um número para ver a tabuada: ");
                    int numeroTabuada = scanner.nextInt();

                    System.out.println("Tabuada de " + numeroTabuada + ":");
                    for (int j = 1; j <= 10; j++) {
                        System.out.println(numeroTabuada + " x " + j + " = " + (numeroTabuada * j));
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}