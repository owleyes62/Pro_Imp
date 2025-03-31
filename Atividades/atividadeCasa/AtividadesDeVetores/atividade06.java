import java.util.Scanner;
import java.util.Random;

public class atividade06 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int[] vetor = new int[10];
        System.out.println("Vetor:");
        maiorMenorValor(vetor);
    }
    public static void maiorMenorValor(int[] v){
        Random gerador = new Random();
        int maior = 0;
        for(int i = 0; i < v.length; i += 1){
            int geraNum = gerador.nextInt(20);
            v[i] = geraNum;
            System.out.print(v[i] + ", ");
            if(v[i] > maior){
                maior = v[i];
            }
        }
        int menor = maior;
        for(int i = 1;i <  v.length; i += 1){
            if(v[i] < menor){
                menor = v[i];
            }
        }
        System.out.println();
        System.out.println("O menor valor do vetor é " + menor);
        System.out.println();
        System.out.println("O maior valor do vetor é " + maior);

    }
}
