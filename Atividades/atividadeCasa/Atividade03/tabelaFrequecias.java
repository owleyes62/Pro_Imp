import java.util.Random;
import java.util.Scanner;

public class tabelaFrequecias {
    public static final int tamV = 200;
    public static final int valorV = 20;
    public static Random gerador = new Random();
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int[] vetor = new int[tamV];
        int[] vetorAux = new int[valorV + 1];
        gerarValores(vetor, vetorAux);
        exibir(vetorAux);
    }
    public static void gerarValores(int[] v, int[] v2){
        for(int i = 0; i < v.length; i += 1){
            v[i] = gerador.nextInt(valorV) + 1;
            v2[v[i]]++;
            System.out.print("(" + v[i] + ") ");
        }
    }
    
    public static void exibir(int[] v2){
        System.out.println();
        System.out.println("Valor | Frequência");
        for (int i = 1; i < v2.length; i++) {
            System.out.println("  " + i + "   |   " + v2[i]);
        }
    }


}
