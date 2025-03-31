import java.util.Scanner;
import java.util.Random;

public class atividade08 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int[] vetor = new int[6];
        System.out.println("Vetor:");
        maiorMenorValor(vetor);
    }
    public static void maiorMenorValor(int[] v){
        int[] vetorInverte = new int[v.length];
        Random gerador = new Random();

        for (int i = 0; i < v.length; i += 1) {
            v[i] = gerador.nextInt(20);
            vetorInverte[v.length - 1 - i] = v[i];
        }
        for(int i = 0; i < v.length; i += 1 ){
            System.out.println(v[i] + ", " + vetorInverte[i]);
        }
    }
}