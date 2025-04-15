import java.util.Scanner;
import java.util.Random;

public class vetorOrdenacao {
    public static Random gerar = new Random();
    public static Scanner input = new Scanner(System.in);
    public static final int TAM = 10;
    public static void main(String[] args){
        int[] vetor = new int[TAM];
        int[] vetorPar = new int[TAM];
        int[] vetorImpar = new int[TAM];

        System.out.println("Digite "+ TAM + " numeros.");
        System.err.println();
        PreencherVetor(vetor);
        System.out.println();
        System.out.print("1) Sua lista de numeros: ");
        imprimirVetor(vetor);
        System.out.println();
        System.out.print("2) lista de numeros ordenada: ");
        ordenar(vetor);
        imprimirVetor(vetor);
        System.err.println();
        System.out.print("3) Maior valor impar da lista: ");
        imprimirMaiorImpar(vetor);
        System.out.println();
        System.out.println("4) Listas de pares e impares:");
        System.out.println();
        criarParesImpares(vetor, vetorPar, vetorImpar);
        imprimirVetorParImpar(vetorPar, vetorImpar);
    }

    public static void PreencherVetor(int[] v){
        int valor;
        for(int i = 0; i < v.length; i += 1){
            System.out.print("Digite o " + (i + 1) + "° valor: ");
            valor = input.nextInt(21);
            v[i] = valor;
        }
    }

    public static void ordenar(int[] v){
        int fim = v.length - 2, pos = 0;
        boolean trocou = true;
        int chave;
        while (trocou) {
            trocou = false;
            for(int i = 0; i<= fim; i++){
                if(v[i] > v[i+1]){
                    chave = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = chave;
                    pos = i; trocou = true;
                }
            }
            fim = pos-1;
        }
    }

    public static void imprimirMaiorImpar(int[] v){
        int imparMaior = 0;
        for(int i = 0; i < v.length; i += 1){
            if(v[i] % 2 == 1 && v[i] > imparMaior){
                imparMaior = v[i];
            }
        }
        System.out.println("{" + imparMaior + "}");
    }

    public static void criarParesImpares(int[] v, int[] pa, int[] im){
        for(int i = 0; i < v.length; i += 1){
            if (v[i] % 2 == 0) {
                pa[i] = v[i];
            }else{
                im[i] = v[i];
            }
        }
    } 

    public static void imprimirVetor(int[] v) {
        System.out.print("{");
        for(int i = 0; i < v.length; i += 1){
            if(i < v.length - 1){
                System.out.print(v[i] + ", ");
            }else{
                System.out.print(v[i]);
            }       
        }
        System.out.print("}");
        System.out.println();
    }
    
    public static void imprimirVetorParImpar(int[] pa, int[] im){
        System.out.print("Lista pares: ");
        System.out.print("{");
        for(int i = 0; i < pa.length; i += 1){
            if(i < pa.length - 1){
                if(pa[i] == 0){
                    pa[i] = -1;
                    System.out.print(pa[i] + ", ");
                }else{
                    System.out.print(pa[i] + ", ");
                }
                    
            }else{
                if(pa[i] == 0){
                    pa[i] = -1;
                    System.out.print(pa[i]);
                }else{
                    System.out.print(pa[i]);
                }
            }       
        }
        System.out.print("}");
        System.out.println();
        System.out.print("Lista Impares: ");
        System.out.print("{");
        for(int i = 0; i < im.length; i += 1){
            if(i < im.length - 1){
                if(im[i] == 0){
                    im[i] = -1;
                    System.out.print(im[i] + ", ");
                }else{
                    System.out.print(im[i] + ", ");
                }
            }else{
                if(im[i] == 0){
                    im[i] = -1;
                    System.out.print(im[i]);
                }else{
                    System.out.print(im[i]);
                }
            }       
        }
        System.out.print("}");
        System.out.println();
    }
}
