package VetorDeClasses;
/*
 * Faça um programa que leia os dados de 10 alunos (Nome, matricula, Média Final), armazenando em um vetor.
Uma vez lidos os dados, divida estes dados em 2 novos vetores, o vetor dos aprovados e o vetor dos reprovados, considerando a média mínima para a aprovação como sendo 
.5,0.
Exibir na tela os dados do vetor de aprovados, seguido dos dados do vetor de reprovados.

Anexar:
arquivos .java com os seus códigos
arquivo .txt para executar o seu código
vídeo de até 1 minuto executando o seu código

 */

 import java.util.Scanner;

 
 
 public class Main {
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
        
         Aluno[] alunos = new Aluno[10];
         Aluno[] aprovados = new Aluno[10];
         Aluno[] reprovados = new Aluno[10];
         
         int aprovadosCount = 0;
         int reprovadosCount = 0;
         
        
         for (int i = 0; i < 10; i++) {
             System.out.println("Digite o nome do aluno " + (i+1) + ":");
             String nome = sc.nextLine();
             
             System.out.println("Digite a matrícula do aluno " + (i+1) + ":");
             int matricula = sc.nextInt();
             
             System.out.println("Digite a média final do aluno " + (i+1) + ":");
             double mediaFinal = sc.nextDouble();
             sc.nextLine(); 
             
             
             alunos[i] = new Aluno(nome, matricula, mediaFinal);
             
            
             if (mediaFinal >= 5.0) {
                 aprovados[aprovadosCount++] = alunos[i];
             } else {
                 reprovados[reprovadosCount++] = alunos[i];
             }
         }
         
         System.out.println("\nAlunos Aprovados:");
         for (int i = 0; i < aprovadosCount; i++) {
             System.out.println("Nome: " + aprovados[i].nome + ", Matrícula: " + aprovados[i].matricula + ", Média: " + aprovados[i].mediaFinal);
         }
 
 
         System.out.println("\nAlunos Reprovados:");
         for (int i = 0; i < reprovadosCount; i++) {
             System.out.println("Nome: " + reprovados[i].nome + ", Matrícula: " + reprovados[i].matricula + ", Média: " + reprovados[i].mediaFinal);
         }
         
         sc.close();
     }
 }
 