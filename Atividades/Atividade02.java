import java.util.Scanner;

public class Atividade02{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        double desconto_p;
        int categoria_p, preco_p, quantidade_p, resultado_f;

        System.out.println("Bemvindo a area de descontos, para receber seu desconto porfavor preencha os dados abaixo.");
        System.out.print("preço do produto: ");
        preco_p = input.nextInt();
        System.out.print("categoria do produto, ");
        System.out.print("Categoria de 1 a 3: ");
        categoria_p = input.nextInt();
        if(categoria_p == 1){
            System.out.print("quantidade de produtos: ");
            quantidade_p = input.nextInt();
            if(quantidade_p <= 2){
                desconto_p = (preco_p * (12.0 / 100));
                resultado_f = preco_p - (int) desconto_p;
                System.out.println("Valor desncotado " + (int) desconto_p + " R$");
                System.out.println("Novo valor a ser pago " + resultado_f + " R$");
            }else if(quantidade_p <= 10){
                desconto_p = (preco_p * (15.0 / 100));
                resultado_f = preco_p - (int) desconto_p;
                System.out.println("Valor desncotado " + (int) desconto_p + " R$");
                System.out.println("Novo valor a ser pago " + resultado_f + " R$");
            }else{
                desconto_p = (preco_p * (20.0 / 100));
                resultado_f = preco_p - (int) desconto_p;
                System.out.println("Valor desncotado " + (int) desconto_p + " R$");
                System.out.println("Novo valor a ser pago " + resultado_f + " R$");
            }
        }else if(categoria_p == 2){
            System.out.print("quantidade de produtos: ");
            quantidade_p = input.nextInt();
            if(quantidade_p <= 2){
                desconto_p = (preco_p * (17.0 / 100));
                resultado_f = preco_p - (int) desconto_p;
                System.out.println("Valor desncotado " + (int) desconto_p + " R$");
                System.out.println("Novo valor a ser pago " + resultado_f + " R$");
            }else if(quantidade_p <= 10){
                desconto_p = (preco_p * (20.0 / 100));
                resultado_f = preco_p - (int) desconto_p;
                System.out.println("Valor desncotado " + (int) desconto_p + " R$");
                System.out.println("Novo valor a ser pago " + resultado_f + " R$");
            }else{
                desconto_p = (preco_p * (25.0 / 100));
                resultado_f = preco_p - (int) desconto_p;
                System.out.println("Valor desncotado " + (int) desconto_p + " R$");
                System.out.println("Novo valor a ser pago " + resultado_f + " R$");
            }
        }else if(categoria_p == 3){
            System.out.print("quantidade de produtos: ");
            quantidade_p = input.nextInt();
            if(quantidade_p <= 2){
                desconto_p = (preco_p * (10.0 / 100));
                resultado_f = preco_p - (int) desconto_p;
                System.out.println("Valor desncotado " + (int) desconto_p + " R$");
                System.out.println("Novo valor a ser pago " + resultado_f + " R$");
            }else if(quantidade_p <= 10){
                desconto_p = (preco_p * (13.0 / 100));
                resultado_f = preco_p - (int) desconto_p;
                System.out.println("Valor desncotado " + (int) desconto_p + " R$");
                System.out.println("Novo valor a ser pago " + resultado_f + " R$");
            }else{
                desconto_p = (preco_p * (18.0 / 100));
                resultado_f = preco_p - (int) desconto_p;
                System.out.println("Valor desncotado " + (int) desconto_p + " R$");
                System.out.println("Novo valor a ser pago " + resultado_f + " R$");
            }
        }else{
            System.out.println("Categoria invalida");
        }
        
        
    }
}