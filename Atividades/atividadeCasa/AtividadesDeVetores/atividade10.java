import java.util.Scanner;
import java.util.Random;

public class atividade10 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int[] vetor = new int[15];
        System.out.println("Vetor:");
        mediaNota(vetor);
    }
    public static void mediaNota(int[] v){
        Random gerador = new Random(2);
        int soma = 0;
        for(int i = 0; i < v.length; i += 1){
            v[i] = gerador.nextInt(11);
            System.out.println((i + 1) + "° Nota: " + v[i]);
            soma += v[i];
        }
        double media = soma / v.length;
        System.out.println(soma);
        System.out.println("Media da sala: " + media);
    }
}
