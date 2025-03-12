import java.util.Scanner;

public class Atividade03{
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args){
        double num;
        double num2;
        System.out.print("Digite seu peso: ");
        num = input.nextDouble();
        System.out.print("Digite sua altura: ");
        num2 = input.nextDouble();

        double imc = num / (num2 * num2) ;
        System.out.printf("%.2f", imc);

        if ( imc < 18.5){
            System.out.println(" Abaixo do peso normal");
        } else if (imc < 25){
            System.out.println(" Peso nomal");
        } else if ( imc < 30){
            System.out.println(" Excesso de peso");
        } else if ( imc < 35){
            System.out.println(" Obesidade classe I");
        } else if ( imc < 40){
            System.out.println(" Obesidade classe II");
        } else {
            System.out.println(" Obesidade classe III");
        }
    }
}