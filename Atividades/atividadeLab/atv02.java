import java.util.Random;

public class atv02 {
    public static Random gerador = new Random();
    public static void main(String[] args) {
        int[] vetor = new int[1000];
        int[] vetor2 = new int[1000];
        gerarSemRepeticao(vetor);
        embaralharVetor(vetor, vetor2);
        exibir(vetor , vetor2);
        System.out.println();
        System.out.println("nova lista");
        
        
    }
    public static void gerarSemRepeticao(int[] v){
        int i = 0;

        while (i < v.length) {
            int valor = gerador.nextInt(1000) + 1; // Gera de 1 a 1000
            boolean repetido = false;

            for (int j = 0; j < i; j++) {
                if (v[j] == valor) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                v[i] = valor;
                ordenarVetor(v, i, valor); 
                i++;
            }
        }
    }
    public static void ordenarVetor(int[] v, int pos, int x){
        int i = pos;
        while (i > 0 && v[i - 1] > x) {
            v[i] = v[i - 1];
            i -= 1;
        }
        v[i] = x;
    }

    public static void embaralharVetor(int[] v, int[]v2){
        for(int i =  0; i < v.length; i += 1){
            v2[gerador.nextInt(1000) - 1] = v[i];
            
        }
    }

    public static void exibir(int[] v, int[] v2){
        for(int i = 0; i < v.length; i += 1){
            System.out.println( i + ", " + v[i] + " | " + v2[i]);
        }
    }
}
