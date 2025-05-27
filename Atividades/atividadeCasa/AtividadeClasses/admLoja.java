import java.util.Scanner;

public class admLoja{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        Produto po1 = new Produto();
        gerarProduto(po1);
        
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
}