
public class Pessoa13 {
  String nome;
  int idade;
  double peso;
  double altura;

  Pessoa13() {
  }

  Pessoa13(String nome, int idade, double peso, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
    this.altura = altura;
  }

  public String toString() {
    return String.format("{ %s, idade = %d, peso = %.2f, alt = %.2f }",
        this.nome, this.idade, this.peso, this.altura);
  }
}