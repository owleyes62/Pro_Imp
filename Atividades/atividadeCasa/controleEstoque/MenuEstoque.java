import java.util.Scanner;

public class MenuEstoque {
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
            System.out.println("4. Ordenar produtos");
            System.out.println("5. Remover/recuperar produto");
            System.out.println("6. atualizar preço");
            System.out.println("7. quatidade de estoque por categoria");
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
                    input.nextLine();
                    filtraCategoria(listaProdutos, qtdlistaProdutos);
                    break;

                case 4:
                    // Ordenar produto por preço...
                    System.out.println("Lista de produtos ordenados por nome");
                    System.out.println();
                    metodoBolhaPorNome(listaProdutos, qtdlistaProdutos);
                    imprimirProdutos(listaProdutos, qtdlistaProdutos);
                    System.out.println();
                    
                case 5:
                    // Remover produto 
                    input.nextLine();
                    qtdlistaProdutos = RemoverProdutoPorNome(listaProdutos, qtdlistaProdutos);
                    imprimirProdutos(listaProdutos, qtdlistaProdutos);
                    break;

                case 6:
                    // atualizar preço
                    input.nextLine();
                    atualizarPreco(listaProdutos, qtdlistaProdutos);
                    break;

                case 7:
                    // valor em estoque por categoria
                    input.nextLine();
                    quatidadeEstoquePorCategoria(listaProdutos, qtdlistaProdutos);
                    break;

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
      imprimirListaCategoria(vp, tam);
      System.out.println();

    }

    public static void imprimirListaCategoria(Produto[] vp, int tam){
      System.out.println("lista de categorias:");
      System.out.println();
      int cont = 0, qtdCat = 0, opcao = 1;
      String[] listaCat = new String[TAM]; 
      listaCat[qtdCat] = vp[0].categoria;
      qtdCat += 1;
      for (int i = 0; i < tam; i += 1) {
        if(busca(listaCat, qtdCat, vp[i].categoria) == -1){
          listaCat[qtdCat] = vp[i].categoria;
          qtdCat += 1;
        }
      }
      
      for (int i = 0; i < qtdCat; i++) {
        System.out.printf((cont += 1) + " (%s)\n", listaCat[i]);
      }
      System.out.println();
      while (opcao == 1) {
        System.out.print("Escolha uma das categoria: ");
        String categoria = input.nextLine();
        System.out.println();
        for(int i = 0; i < tam ; i++) {
            if (categoria.toUpperCase().equalsIgnoreCase(vp[i].categoria.toUpperCase())) {
              System.out.printf("(%s, %s, %s, R$ %.2f, %d unidades, %d unidades minimas)\n",
            vp[i].nome, vp[i].descricao, vp[i].categoria,  vp[i].preco, vp[i].qtdEstoque, vp[i].qtdMinima);
            }
        }

        System.out.println();
        System.out.print("Gostaria de ver mais alguma categoria? digite [1]: ");
        opcao = input.nextInt();
        input.nextLine();
      }
    }

    public static int busca(String[] v, int tam,  String x) {
          for (int i = 0; i < tam; i += 1) {
              if (v[i].equalsIgnoreCase(x)) {
                  return 0;
              }
          }
          return -1;
    }

    public static int buscaProduto(Produto[] v, int tam,  String x) {
          for (int i = 0; i < tam; i += 1) {
              if (v[i].nome.equalsIgnoreCase(x)) {
                  return 0;
              }
          }
          return -1;
    }
   

    public static void metodoBolhaPorNome(Produto[] vp, int tam) {
      int fim = tam - 2, pos = 0;
      boolean trocou = true;
      Produto chave;
      while (trocou) {
        trocou = false;
        for (int i = 0; i <= fim; i++) {
          if (vp[i].nome.toUpperCase().compareTo(vp[i + 1].nome.toUpperCase()) > 0) {
            chave = vp[i];
            vp[i] = vp[i + 1];
            vp[i + 1] = chave;
            pos = i;
            trocou = true;
          }
        }
        fim = pos - 1;
      }
    }

    public static int RemoverProdutoPorNome(Produto[] vp, int tam){
      int cont = 0, prodRemovios = 0, prodAtualizado = 0, opcao = 1;
      Produto[] produtosRemovidos = new Produto[TAM]; 
      Produto[] listaProdutosAtualizados = new Produto[TAM];
      System.out.println("Lista de produtos Removiveis");
      for (int i = 0; i < tam; i++) {
        System.out.printf((cont += 1) + " (%s)\n", vp[i].nome);
      }
      System.out.println();
      while (opcao == 1) {
        System.out.print("Escolha um Produto para remove: ");
        String produtoNome = input.nextLine();
        System.out.println();
        if(buscaProduto(vp, tam, produtoNome) == -1){
          System.out.println("Não exite esse produto");
        }else{
          for(int i = 0; i < tam ; i++) {
            if (produtoNome.toUpperCase().equalsIgnoreCase(vp[i].nome.toUpperCase())) {
              System.out.println("Produto removido");
              System.out.println();
              System.out.printf("(%s, %s, %s, R$ %.2f, %d unidades, %d unidades minimas)\n",
              vp[i].nome, vp[i].descricao, vp[i].categoria,  vp[i].preco, vp[i].qtdEstoque, vp[i].qtdMinima);
              produtosRemovidos[prodRemovios] = vp[i];
              prodRemovios += 1;
            }else{
              listaProdutosAtualizados[prodAtualizado] = vp[i];
              prodAtualizado += 1;
            }
          } 
        }

        System.out.println();
        System.out.print("Gostaria de remover mais algum produto? digite [1]: ");
        opcao = input.nextInt();
        input.nextLine();
      }

      confirmarRemoção(produtosRemovidos, listaProdutosAtualizados, prodAtualizado, prodRemovios);

      for (int i = 0; i < prodAtualizado; i++) {
        vp[i] = listaProdutosAtualizados[i];
      }

      System.out.println("Lista de produtos atualizada com sucesso");
      System.out.println();
      return prodAtualizado;
    }

    public static void confirmarRemoção (Produto[] rem, Produto[] atual, int tamAtual, int tamRem){
      int opcao = 0;
      System.out.println("Deseja mesmo remover esses produtos?");
      System.out.println();
      for (int i = 0; i < tamRem; i++) {
        System.out.printf("(%s, %s, %s, R$ %.2f, %d unidades, %d unidades minimas)\n",
            rem[i].nome, rem[i].descricao, rem[i].categoria,  rem[i].preco, rem[i].qtdEstoque, rem[i].qtdMinima);
      }
      System.out.println();
      System.out.print("Se sim digite [1]: ");
      opcao = input.nextInt();
      System.out.println();

      if (opcao == 1) {
        System.out.println("Produtos removidos com sucesso");
      }else{
        System.out.println("Vamos recuperar o produto");
      }
      
    }

    public static void atualizarPreco(Produto[] vp, int tam){
      int opcao = 1, cont = 0;
      System.out.println("Lista de produtos atualizaveis");
      for (int i = 0; i < tam; i++) {
        System.out.printf((cont += 1) + " (%s, %.2f)\n", vp[i].nome, vp[i].preco);
      }
      System.out.println();
      while (opcao == 1) {
        System.out.print("Escolha um Produto para atualizar o preço: ");
        String produtoNome = input.nextLine();
        System.out.println();
        System.out.print("Escolha o novo preço: ");
        double novoPreco = input.nextDouble();
        if(buscaProduto(vp, tam, produtoNome) == -1){
          System.out.println("Não exite esse produto");
        }else{
          for(int i = 0; i < tam ; i++) {
            if (produtoNome.toUpperCase().equalsIgnoreCase(vp[i].nome.toUpperCase())) {
              vp[i].preco = novoPreco;
              System.out.println("Produto atualizado");
              System.out.println();
              System.out.printf("(%s, %s, %s, R$ %.2f, %d unidades, %d unidades minimas)\n",
              vp[i].nome, vp[i].descricao, vp[i].categoria,  vp[i].preco, vp[i].qtdEstoque, vp[i].qtdMinima);  
            }
          } 
        }

      System.out.println();
      System.out.print("Gostaria de atualizar mais algum preço? digite [1]: ");
      opcao = input.nextInt();
      input.nextLine();
      }
    }  

    public static void quatidadeEstoquePorCategoria(Produto[] vp, int tam){
      System.out.println("lista de categorias:");
      System.out.println();
      int cont = 0, qtdCat = 0, opcao = 1, qtdEstoque = 0;
      String[] listaCat = new String[TAM]; 
      listaCat[qtdCat] = vp[0].categoria;
      qtdCat += 1;
      for (int i = 0; i < tam; i += 1) {
        if(busca(listaCat, qtdCat, vp[i].categoria) == -1){
          listaCat[qtdCat] = vp[i].categoria;
          qtdCat += 1;
        }
      }
      
      for (int i = 0; i < qtdCat; i++) {
        System.out.printf((cont += 1) + " (%s)\n", listaCat[i]);
      }
      System.out.println();
      while (opcao == 1) {
        System.out.print("Escolha uma das categorias: ");
        String categoria = input.nextLine();
        System.out.println(); 
        for(int i = 0; i < tam ; i++) {
            if (categoria.toUpperCase().equalsIgnoreCase(vp[i].categoria.toUpperCase())) {
              qtdEstoque += vp[i].qtdEstoque;
            }
        }

        System.out.println("Essa é a quatidade em estoque da categoria " + categoria + ": " + qtdEstoque);
        System.out.println();
        System.out.print("Gostaria de ver mais alguma categoria? digite [1]: ");
        opcao = input.nextInt();
        input.nextLine();
      }
    }
     // public static int buscaBinariaPorCategoria(String[] v, int tam, String x) {
    //   int inicio = 0, fim = tam - 1, meio;
    //   while (inicio <= fim) {
    //       meio = (inicio + fim) / 2;
    //       if (x.toUpperCase().compareTo(v[meio].toUpperCase()) == 0) {
    //           return 0;
    //       } else if (x.toUpperCase().compareTo(v[meio].toUpperCase()) < 0) {
    //           fim = meio - 1;
    //       } else {
    //           inicio = meio + 1;
    //       }
    //   }
    //   return -1;
    // }
}