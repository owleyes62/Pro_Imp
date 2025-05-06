import java.util.Random;

public class teste {
    public static Random gerador = new Random();
    public static void main(String[] args) {
        int[] vetor = new int[5];
        gerarVetor(vetor);
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[vetor.length - 2]);
        }
        System.out.println();
        imprimirVetor(vetor);
    }
    public static void gerarVetor(int[] v){
        for(int i = 0; i < v.length; i++ ){
            v[i] = gerador.nextInt(10);
        }
    }

    public static void imprimirVetor(int[] v){
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " | ");
        }
    }
    
    public static void insercaoDireta(int[] v, int n) {
        int j;
        int chave;
        for (int i = 1; i <= n - 1; i += 1) {
            chave = v[i];
            System.out.println("Valor de troca = " + chave + "| in de valor = " + i);
            j = i - 1;
            while (j >= 0 && v[j] > chave) {
                v[j + 1] = v[j];
                j = j - 1;
                System.out.println("In valor de troca = " + j);
            }
            v[j + 1] = chave;
            System.out.println("In valor de troca 2 = " + (j + 1));
        }
    }
}
