import java.util.Random;

public class atividade17 {
    public static Random gerador = new Random();
    public static void main(String[] args){
        int[] vetor = new int[10];
        gerarVetor(vetor);
        imprimirVetor(vetor);
        System.out.println();
        imprimirZerarNegativos(vetor);
        System.out.println();
    }
    public static void gerarVetor(int[] v){
        for (int i = 0; i < v.length; i++) {
            v[i] = -10 + gerador.nextInt(20);
        }
    }

    public static void imprimirVetor(int[] v){
        for (int i = 0; i < v.length; i++) {
            if (i == v.length - 1) {
                System.out.print(v[i]);
            }else{
                System.out.print(v[i] + ", ");
            }
        }
        System.out.println();
    }

    public static void imprimirZerarNegativos(int[] v){
        for (int i = 0; i < v.length; i++) {
            if (i == v.length - 1) {
                if (v[i] < 0) {
                    v[i] = 0;
                    System.out.print(v[i]);
                }else{
                    System.out.print(v[i]);
                }
            }else{
                if (v[i] < 0) {
                    v[i] = 0;
                    System.out.print(v[i] + ", ");
                }else{
                    System.out.print(v[i] + ", ");
                }
            }
        }
    }
}
