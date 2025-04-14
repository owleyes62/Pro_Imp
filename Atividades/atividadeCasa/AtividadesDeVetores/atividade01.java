import java.util.Scanner;

public class atividade01 {
    public static Scanner input = new Scanner (System.in);
    public static void main(String[] args){
        int[] A = {1, 0, 5, -2, -5, 7};
        System.out.println("Verto original");
        for(int i = 0; i < A.length; i += 1){
            System.out.println(A[i]);
        }
        System.out.println();
        somaValores(A);
        System.out.println();
        modificandoValor(A);
    }
    public static void somaValores(int[] v){
        for( int i = 0; i < 1; i += 1){
            int t = v.length;
            int soma = v[0] + v[1] + v[5];
            System.out.println("Soma dos valores A[0], A[1], A[5] é: " + soma);
        }
    }
    public static void modificandoValor(int[] v){
        System.out.println("Vertor modificado:");
        for( int i = 0; i < v.length; i += 1){
            v[4] = 100;
            System.out.println(v[i]); 
        }
    }

}
