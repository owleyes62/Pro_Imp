import java.util.Scanner;
import java.util.Random;

public class atividade11 {
    public static Scanner input = new Scanner(System.in);
    public static Random gerador = new Random();

    public static void main(String[] args){
        int[] vetor = new int[10];
        negativosAndSomaPositivos(vetor);
    }
    public static void negativosAndSomaPositivos(int[] v){
        int soma = 0, qNegativos = 0;
        for(int i = 0; i < v.length; i += 1){
            v[i] = gerador.nextInt(21) - 10;
            if (v[i] < 0){
                qNegativos += 1;
                System.out.println("i " + i + " N (" + v[i] + ")");
            }else{
                soma += v[i];
                System.out.println("i " + i + " p (" + v[i] + ")");
            }
        }
        System.out.println();
        System.out.println("Quantidade de numeros negativos: " + qNegativos);
        System.out.println();
        System.out.println("soma dos valores positivos: " + soma);
    }
}
