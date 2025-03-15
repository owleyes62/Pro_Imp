import java.util.Scanner;

public class Ex06 {
    public static Scanner input = new Scanner(System.in);
    public static double[] notas = new double[3];
    public static void main(String[] args){
    
        for(int i = 0; i < notas.length; i += 1){
            System.out.print("Digite a " + (i + 1) + " notas: ");
            notas[i] = input.nextDouble();
        }
        for(int i = 0; i < notas.length; i += 1){
            System.out.println( (i + 1) +"° nota = " + notas[i] );
        }
        for(int i = 0; i < notas.length; i += 1){
            System.out.println(notas[i] += notas[i]);
            // if (notas[i] > media){
            //     System.out.println("Notas maiores que a media: " + notas[i]);
            // }
            // else{
            //     System.out.println("Notas Abaixo da media: " + notas[i]);
            // }
        }
    }
}
