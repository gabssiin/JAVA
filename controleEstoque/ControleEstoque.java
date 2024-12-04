import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produto {
    String nome;
    String categoria;
    double preco;
    int quantidade;

    // Construtor
    public Produto(String nome, String categoria, double preco, int quantidade) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Método para exibir o produto
    public void exibirProduto() {
        System.out.println("Nome: " + nome + ", Categoria: " + categoria + ", Preço: R$" + preco + ", Quantidade: " + quantidade);
    }

    // Método para calcular o valor total em estoque
    public double valorEmEstoque() {
        return preco * quantidade;
    }
}

public class ControleEstoque {
    public static final Scanner ler = new Scanner(System.in);
    public static List<Produto> produtos = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("Menu");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Filtrar por categorias");
            System.out.println("4 - Ordenar produtos");
            System.out.println("5 - Remover um produto");
            System.out.println("6 - Atualizar preço de um produto");
            System.out.println("7 - Listar produtos com subtotal por categoria");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = ler.nextInt();
            ler.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    filtrarPorCategoria();
                    break;
                case 4:
                    ordenarProdutos();
                    break;
                case 5:
                    removerProduto();
                    break;
                case 6:
                    atualizarPreco();
                    break;
                case 7:
                    listarSubtotalPorCategoria();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            }
        } while (opcao != 0);

        ler.close();
    }

    public static void cadastrarProduto() {
        System.out.print("Nome do produto: ");
        String nome = ler.nextLine();

        System.out.print("Categoria do produto: ");
        String categoria = ler.nextLine();

        System.out.print("Preço do produto: ");
        double preco = ler.nextDouble();

        System.out.print("Quantidade do produto: ");
        int quantidade = ler.nextInt();
        ler.nextLine(); // Limpar o buffer

        Produto produto = new Produto(nome, categoria, preco, quantidade);
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    public static void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto p : produtos) {
                p.exibirProduto();
            }
        }
    }

    public static void filtrarPorCategoria() {
        System.out.print("Informe a categoria para filtrar: ");
        String categoria = ler.nextLine();

        boolean encontrou = false;
        for (Produto p : produtos) {
            if (p.categoria.equalsIgnoreCase(categoria)) {
                p.exibirProduto();
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum produto encontrado nesta categoria.");
        }
    }

    public static void ordenarProdutos() {
        produtos.sort((p1, p2) -> p1.nome.compareToIgnoreCase(p2.nome));
        System.out.println("Produtos ordenados por nome.");
    }

    public static void removerProduto() {
        System.out.print("Informe o nome do produto a ser removido: ");
        String nome = ler.nextLine();

        Produto produtoRemovido = null;
        for (Produto p : produtos) {
            if (p.nome.equalsIgnoreCase(nome)) {
                produtoRemovido = p;
                break;
            }
        }

        if (produtoRemovido != null) {
            produtos.remove(produtoRemovido);
            System.out.println("Produto removido com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public static void atualizarPreco() {
        System.out.print("Informe o nome do produto para atualizar o preço: ");
        String nome = ler.nextLine();

        Produto produtoEncontrado = null;
        for (Produto p : produtos) {
            if (p.nome.equalsIgnoreCase(nome)) {
                produtoEncontrado = p;
                break;
            }
        }

        if (produtoEncontrado != null) {
            System.out.print("Informe o novo preço: ");
            double novoPreco = ler.nextDouble();
            produtoEncontrado.preco = novoPreco;
            System.out.println("Preço atualizado com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public static void listarSubtotalPorCategoria() {
        System.out.println("Produtos com subtotal por categoria:");
        produtos.stream()
                .collect(java.util.stream.Collectors.groupingBy(p -> p.categoria))
                .forEach((categoria, listaProdutos) -> {
                    double subtotal = listaProdutos.stream().mapToDouble(Produto::valorEmEstoque).sum();
                    System.out.println("Categoria: " + categoria + " | Subtotal em estoque: R$" + subtotal);
                });
    }
}
