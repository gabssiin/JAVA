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
    public static Produto[] produtos = new Produto[10]; // Capacidade fixa para 10 produtos
    public static int indice = 0; // Controla o índice do próximo produto a ser adicionado

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
        if (indice < produtos.length) {
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
            produtos[indice++] = produto;
            System.out.println("Produto cadastrado com sucesso!");
        } else {
            System.out.println("Espaço insuficiente para cadastrar mais produtos.");
        }
    }

    public static void listarProdutos() {
        if (indice == 0) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (int i = 0; i < indice; i++) {
                produtos[i].exibirProduto();
            }
        }
    }

    public static void filtrarPorCategoria() {
        System.out.print("Informe a categoria para filtrar: ");
        String categoria = ler.nextLine();

        boolean encontrou = false;
        for (int i = 0; i < indice; i++) {
            if (produtos[i].categoria.equalsIgnoreCase(categoria)) {
                produtos[i].exibirProduto();
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum produto encontrado nesta categoria.");
        }
    }

    public static void ordenarProdutos() {
        for (int i = 0; i < indice - 1; i++) {
            for (int j = i + 1; j < indice; j++) {
                if (produtos[i].nome.compareToIgnoreCase(produtos[j].nome) > 0) {
                    Produto temp = produtos[i];
                    produtos[i] = produtos[j];
                    produtos[j] = temp;
                }
            }
        }
        System.out.println("Produtos ordenados por nome.");
    }

    public static void removerProduto() {
        System.out.print("Informe o nome do produto a ser removido: ");
        String nome = ler.nextLine();

        int posicao = -1;
        for (int i = 0; i < indice; i++) {
            if (produtos[i].nome.equalsIgnoreCase(nome)) {
                posicao = i;
                break;
            }
        }

        if (posicao != -1) {
            for (int i = posicao; i < indice - 1; i++) {
                produtos[i] = produtos[i + 1];
            }
            produtos[--indice] = null; // Reduzir o índice e limpar a posição
            System.out.println("Produto removido com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public static void atualizarPreco() {
        System.out.print("Informe o nome do produto para atualizar o preço: ");
        String nome = ler.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < indice; i++) {
            if (produtos[i].nome.equalsIgnoreCase(nome)) {
                System.out.print("Informe o novo preço: ");
                double novoPreco = ler.nextDouble();
                produtos[i].preco = novoPreco;
                System.out.println("Preço atualizado com sucesso.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Produto não encontrado.");
        }
    }

    public static void listarSubtotalPorCategoria() {
        System.out.println("Produtos com subtotal por categoria:");

        for (int i = 0; i < indice; i++) {
            String categoria = produtos[i].categoria;
            double subtotal = 0;

            for (int j = 0; j < indice; j++) {
                if (produtos[j].categoria.equalsIgnoreCase(categoria)) {
                    subtotal += produtos[j].valorEmEstoque();
                }
            }

            System.out.println("Categoria: " + categoria + " | Subtotal em estoque: R$" + subtotal);
        }
    }
}
