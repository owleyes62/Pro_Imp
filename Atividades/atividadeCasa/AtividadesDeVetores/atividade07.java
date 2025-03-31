import java.util.Scanner;
import java.util.Random;

public class atividade07 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int[] vetor = new int[10];
        System.out.println("Vetor:");
        maiorMenorValor(vetor);
    }
    public static void maiorMenorValor(int[] v){
        Random gerador = new Random();
        int maior = 0;
        int pos = 0;
        for(int i = 0; i < v.length; i += 1){
            int geraNum = gerador.nextInt(20);
            v[i] = geraNum;
            System.out.println("posi " + i + ", v " + v[i] + ",");        
            if(v[i] > maior){
                maior = v[i];
                pos = i;
            }
        }

        System.out.println();
        System.out.println("O maior valor do vetor é " + maior + " e esta na posição " + pos);

    }
}

