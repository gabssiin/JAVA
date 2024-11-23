package testesdeSala;

public class Alunos {
    String nome;
    int matricula;
    double nota1;
    double nota2;
    double nota3;

    public Alunos() {
        // Construtor padrão - inicializa com valores padrão se necessário
    }

    public Alunos(String nome, int matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
               ", Matrícula: " + matricula +
               ", Nota 1: " + nota1 +
               ", Nota 2: " + nota2 +
               ", Nota 3: " + nota3 +
               ", Média: " + calcularMedia();
    }


    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {  // Getter para nota3
        return nota3;
    }

    public void setNota3(double nota3) {  // Setter para nota3
        this.nota3 = nota3;
    }
}