import java.util.Scanner;

public class menuEstoque {
    public static final int TAM = 10;
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        int opcao, qtdlistaProdutos = 0;
        Produto[] listaProdutos = new Produto[TAM];
        do {
            System.out.println("MENU");
            System.out.println("1. Inserir produto");
            System.out.println("2. Imprimir Vetor");
            System.out.println("3. Filtra por categoria");
            System.out.println("4. Ordenar preco");
            System.out.println("5. Calcular a média");
            System.out.print("Digite sua opção (0 p/ sair): ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    // inserir produto
                    qtdlistaProdutos = inserirProdutos(listaProdutos, qtdlistaProdutos);
                    System.out.println();
                    break;
                
                case 2:
                    // Imprimir Produtos
                    imprimirProdutos(listaProdutos, qtdlistaProdutos);
                    System.out.println();
                    break;

                case 3:
                    // Filtrar por categoria
                    filtraCategoria(listaProdutos, qtdlistaProdutos);
                    break;

                // case 4:
                //     // Ordenar produto por preço...
                //     insercaoDireta(listaProdutos, qtdlistaProdutos);
                //     System.out.print("Digite o número a ser pesquisado: ");
                //     num = input.nextInt();
                //     pos = buscaBinaria(listaProdutos, qtdlistaProdutos, num);
                //     if (pos != -1) {
                //         System.out.println("Achou o número " + num + " na posição " + (pos + 1));
                //     } else {
                //         System.out.println("Não achou o número " + num + " no vetor!");
                //     }
                //     break;
                    
                // case 5:
                //     // Remover produto 
                //     System.out.println("A média do vetor é " + calcularMedia(listaProdutos, qtdlistaProdutos));
                //     break;

                // case 6:
                //     // atualizar preço
                //     System.out.println("A média do vetor é " + calcularMedia(listaProdutos, qtdlistaProdutos));
                //     break;

                // case 7:
                //     // valor em estoque por categoria
                //     System.out.println("A média do vetor é " + calcularMedia(listaProdutos, qtdlistaProdutos));
                //     break;

                default:
                    if (opcao != 0) {
                        System.out.println("Opção Inválida!");
                    }
                    break;
                }
        }while (opcao != 0);
    }

    public static int inserirProdutos(Produto[] vp, int tam) {
        int qtd = tam, opcao = 1;
        input.nextLine();
        while (opcao == 1 && qtd < vp.length) {
            vp[qtd] = new Produto();
            System.out.print("Digite o nome do produto: ");
            vp[qtd].nome = input.nextLine();
            System.out.print("Digite a descrição do produto: ");
            vp[qtd].descricao = input.nextLine();
            System.out.print("Digite a categoria do produto: ");
            vp[qtd].categoria = input.nextLine();
            System.out.print("Digite preço do produto: ");
            vp[qtd].preco = input.nextDouble();
            System.out.print("Digite a quantidade em estoque deste produto: ");
            vp[qtd].qtdEstoque = input.nextInt();
            System.out.print("Digite a quantidade minima: ");
            vp[qtd].qtdMinima = input.nextInt();
            qtd += 1;
            System.out.println("Digite 1 para cadastrar novo produto e outro valor para encerrar!");
            opcao = input.nextInt();
            input.nextLine();
        }

        System.out.println();
        if(qtd == 1){
            System.out.println("Produto registrado");
        }else{
            System.out.println("Produtos registrados");
        }
        System.out.println();
        return qtd;
    }

    public static void imprimirProdutos(Produto[] vp, int tam) {
    for (int i = 0; i < tam; i += 1) {
      System.out.printf("(%s, %s, %s, R$ %.2f, %d unidades, %d unidades minimas)\n",
          vp[i].nome, vp[i].descricao, vp[i].categoria,  vp[i].preco, vp[i].qtdEstoque, vp[i].qtdMinima);
    }
  }

  public static void filtraCategoria(Produto[] vp, int tam){
    System.out.println("lista de categorias:");
    metodoBolhaPorCategoria(vp, tam);
    for (int i = 0; i < tam; i += 1) {
      if(vp[i].categoria != vp[i - 1].categoria){
        System.out.printf((i + 1) + "° (%s, \n",
          vp[i].categoria);
      } 
    }
    System.out.println();
    System.out.print("Escolha a cetegoria de produtos que gostaria de ver: ");
    String categoria = input.nextLine();

  }

  public static void metodoBolhaPorCategoria(Produto[] v, int tam) {
    int fim = tam - 2, pos = 0;
    boolean trocou = true;
    Produto chave;
    while (trocou) {
      trocou = false;
      for (int i = 0; i <= fim; i++) {
        if (v[i].categoria.toUpperCase().compareTo(v[i + 1].categoria.toUpperCase()) > 0) {
          chave = v[i];
          v[i] = v[i + 1];
          v[i + 1] = chave;
          pos = i;
          trocou = true;
        }
      }
      fim = pos - 1;
    }
  }

}
