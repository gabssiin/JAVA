package testesdeSala;

import java.util.Scanner;

public class QuartaQuestão {
    public static Scanner ler = new Scanner(System.in);
    public static final int numDeAlunos = 5;

    public static void main(String[] args) {
        Alunos[] alunos = new Alunos[numDeAlunos];

        lerAlunos(alunos); // (A) Ler os dados dos alunos

        Alunos alunoMaiorNota1 = encontrarAlunoMaiorNota1(alunos); // (B) Encontrar aluno com maior nota na primeira prova
        System.out.println("Aluno com maior nota na primeira prova: " + alunoMaiorNota1);


        Alunos alunoMaiorMedia = encontrarAlunoMaiorMedia(alunos); // (C) Encontrar aluno com maior média
        System.out.println("Aluno com maior média: " + alunoMaiorMedia);

        Alunos alunoMenorMedia = encontrarAlunoMenorMedia(alunos); // (D) Encontrar aluno com menor média
        System.out.println("Aluno com menor média: " + alunoMenorMedia);


        imprimirResultados(alunos); // (E) Imprimir resultados e status de aprovação

        ler.close();
    }



    public static void lerAlunos(Alunos[] alunos) {
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Digite os dados do aluno " + (i + 1) + ":");
            alunos[i] = lerAluno();
        }
    }


    public static Alunos lerAluno() {
        System.out.print("Nome: ");
        String nome = ler.next(); // Use next() para ler apenas o nome
        System.out.print("Matrícula: ");
        int matricula = ler.nextInt();
        System.out.print("Nota 1: ");
        double nota1 = ler.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = ler.nextDouble();
        System.out.print("Nota 3: ");
        double nota3 = ler.nextDouble();
        ler.nextLine(); // Limpar o buffer do scanner
        return new Alunos(nome, matricula, nota1, nota2, nota3);
    }


    public static Alunos encontrarAlunoMaiorNota1(Alunos[] alunos) {
        Alunos maiorNota1 = alunos[0];
        for (int i = 1; i < alunos.length; i++) {
            if (alunos[i].nota1 > maiorNota1.nota1) {
                maiorNota1 = alunos[i];
            }
        }
        return maiorNota1;
    }




    public static Alunos encontrarAlunoMaiorMedia(Alunos[] alunos) {
        Alunos maiorMedia = alunos[0];
        for (int i = 1; i < alunos.length; i++) {
            if (alunos[i].calcularMedia() > maiorMedia.calcularMedia()) {
                maiorMedia = alunos[i];
            }
        }
        return maiorMedia;
    }


    public static Alunos encontrarAlunoMenorMedia(Alunos[] alunos) {
        Alunos menorMedia = alunos[0];
        for (int i = 1; i < alunos.length; i++) {
            if (alunos[i].calcularMedia() < menorMedia.calcularMedia()) {
                menorMedia = alunos[i];
            }
        }
        return menorMedia;
    }

    public static void imprimirResultados(Alunos[] alunos) {
        for (Alunos aluno : alunos) {
            System.out.println(aluno);
            if (aluno.calcularMedia() >= 6.0) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
            System.out.println("--------------------");
        }
    }
}
