// https://www.facom.ufu.br/~backes/gsi002/ListaC04.pdf

import java.util.Random;

public class atividade01 {
    public static Random input = new Random ();
    public static void main(String[] args){
        int[] A = {1, 0, 5, -2, -5, 7, 8};
        System.out.println("Verto original");
        imprimirVetor(A);
        System.out.println();
        somaValores(A);
        System.out.println();
        System.out.println("Vertor modificou A[4]:");
        modificandoValor(A);
        imprimirVetor(A);
    }
    public static void somaValores(int[] v){
        for( int i = 0; i < 1; i += 1){
            int soma = v[0] + v[1] + v[5];
            System.out.println("Soma dos valores A[0], A[1], A[5] é: " + soma);
        }
    }
    public static void modificandoValor(int[] v){
        for( int i = 0; i < v.length; i += 1){
            v[4] = 100;
        }
    }
    public static void imprimirVetor(int[] v){
        for(int i = 0; i < v.length; i += 1){
            if(i == v.length - 1){
                System.out.print(v[i]);
            }else{
                System.out.print(v[i] + ", ");
            }
        }
        System.out.println();
    }

}
