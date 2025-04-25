import java.util.Random;

public class atividade15 {
    public static Random gerador = new Random(5);
    public static void main(String[] args){
        int[] vetor = new int[20];
    }
    public static void gerarVetor(int[] v){
        for (int i = 0; i < v.length; i++) {
            v[i] = gerador.nextInt(15);
        }
    }
}
