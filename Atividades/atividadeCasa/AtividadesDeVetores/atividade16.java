import java.util.Random;
import java.util.Scanner;

public class atividade16 {
    public static final int TAM = 5;
    public static Random gerador = new Random();
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int[] vetor = new int[5];
        int opcao;
        gerarVetor(vetor);
        imprimirVetor(vetor);
        System.out.println();
        do {
            System.out.println("MENU");
            System.out.println("1. imprimir vetor original");
            System.out.println("2. imprimir vetor inverso");
            System.out.print("Digite sua opção (0 para sair): ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    imprimirVetor(vetor);
                    break;
                
                case 2:
                    imprimirVetorInverso(vetor);
                    break;
            
                default:
                    if (opcao != 0) {
                        System.out.println("opção invalida!");
                    }
                    break;
            }
        }while(opcao != 0);
    }

    public static void gerarVetor(int[] v){
        for (int i = 0; i < v.length; i++) {
            v[i] = gerador.nextInt(10);
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

    public static void imprimirVetorInverso(int[] v){
        for (int i = v.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(v[i]);
            }else{
                System.out.print(v[i] + ", ");
            }
        }
        System.out.println();
    }
}
