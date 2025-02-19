import java.util.Scanner;

public class Exemplo02 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int num1 = 10, num2;
        double num3;
        System.out.print("Digite um numero inteiro: "); //sout
        num2 = input.nextInt();
        System.out.print("Digite um numero real: ");
        num3 = input.nextDouble();
        
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

    }
}