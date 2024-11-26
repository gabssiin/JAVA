package VetorDeClasses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno[] alunos = new Aluno[10];
        Aluno[] aprovados = new Aluno[10];
        Aluno[] reprovados = new Aluno[10];

        int aprovadosCount = 0;
        int reprovadosCount = 0;

        // Leitura dos dados dos alunos
        alunos = lerDadosAlunos(sc, alunos);

        // Classificação dos alunos em aprovados e reprovados
        classificacaoAlunos(alunos, aprovados, reprovados);

        // Exibição dos alunos aprovados
        aprovadosCount = exibirAlunos("Aprovados", aprovados);
        
        // Exibição dos alunos reprovados
        reprovadosCount = exibirAlunos("Reprovados", reprovados);
        
        sc.close();
    }

    // Função para ler os dados dos alunos
    public static Aluno[] lerDadosAlunos(Scanner sc, Aluno[] alunos) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            String nome = sc.nextLine();

            System.out.println("Digite a matrícula do aluno " + (i + 1) + ":");
            int matricula = sc.nextInt();

            System.out.println("Digite a média final do aluno " + (i + 1) + ":");
            double mediaFinal = sc.nextDouble();
            sc.nextLine(); // Consumir a nova linha pendente

            alunos[i] = new Aluno(nome, matricula, mediaFinal);
        }
        return alunos;
    }

    // Função para classificar os alunos em aprovados e reprovados
    public static void classificacaoAlunos(Aluno[] alunos, Aluno[] aprovados, Aluno[] reprovados) {
        int aprovadosCount = 0;
        int reprovadosCount = 0;

        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].mediaFinal >= 5.0) {
                aprovados[aprovadosCount++] = alunos[i];
            } else {
                reprovados[reprovadosCount++] = alunos[i];
            }
        }
    }

    // Função para exibir os alunos (aprovados ou reprovados)
    public static int exibirAlunos(String tipo, Aluno[] alunos) {
        int count = 0;
        System.out.println("\nAlunos " + tipo + ":");
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                System.out.println("Nome: " + alunos[i].nome + ", Matrícula: " + alunos[i].matricula + ", Média: " + alunos[i].mediaFinal);
                count++;
            }
        }
        return count;
    }
}
