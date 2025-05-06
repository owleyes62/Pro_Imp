// https://www.facom.ufu.br/~backes/gsi002/ListaC04.pdf

import java.util.Scanner;

public class atividade01 {
    public static Scanner input = new Scanner (System.in);
    public static void main(String[] args){
        int[] A = {1, 0, 5, -2, -5, 7, 8};
        System.out.println("Verto original");
        imprimirVetor(A);
        System.out.println();
        somaValores(A);
        System.out.println();
        System.out.println("Vertor modificou A["+ (A.length - 2) +"]:");
        modificandoValor(A);
        imprimirVetor(A);

    }
    public static void somaValores(int[] v){
        for( int i = 0; i < 1; i += 1){
            int t = v.length;
            int soma = v[0] + v[1] + v[v.length - 1];
            System.out.println("Soma dos valores A[0], A[1], A["+ (v.length - 1) + "] é: " + soma);
        }
    }
    public static void modificandoValor(int[] v){
        for( int i = 0; i < v.length; i += 1){
            v[v.length - 2] = 100;
        }
    }
    public static void imprimirVetor(int[] v){
        for(int i = 0; i < v.length; i += 1){
            System.out.println(v[i]);
        }
    }

}
