import java.util.Scanner;

public class admLoja{
    public static final int TAM = 2;
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        Produto[] listaProduto = new Produto[TAM];

        for (int i = 0; i < TAM; i++) {
            listaProduto[i] = new Produto();
            gerarProduto(listaProduto[i]);
        }

        System.out.println();
        System.out.println(" informações dos produtos");
        imprimirPessoa(listaProduto, TAM);
      
        
    }

    public static void gerarProduto(Produto p){
        System.out.print("Titulo do produto: ");
        p.titulo = input.nextLine();
        System.out.print("descrição do produto: ");
        p.descricao = input.nextLine();
        System.out.print("preço do produto: ");
        p.precoUnitario= input.nextDouble();
        System.out.print("quantidade do produto: ");
        p.qtdEstoque = input.nextInt();
        input.nextLine();
    }

    public static void imprimirPessoa(Produto[] p, int t){
        for (int i = 0; i < t; i++) {
            System.out.println("Titulo do produto" + p[i].titulo);
            System.out.println("Titulo do decrição" + p[i].descricao);
            System.out.println("Titulo do precoUnitario" + p[i].precoUnitario);
            System.out.println("Titulo do quantidade estoque" + p[i].qtdEstoque);
            System.out.println();
        }
    }

    public static void ordenarVetorPorPreço(Produto[] lp, int t){
        
    }
}