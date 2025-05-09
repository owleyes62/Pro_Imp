import java.util.Random;

public class atv03ReverterMetade {
    public static Random gerador = new Random(2);
    public static void main(String[] args){
        int[] vetor = {1, 1, 2, 3, 5, 7};
        imprimir(vetor);
        System.out.println();
        System.out.println("Vetor verificado");
        verificaFibo(vetor);
        imprimir(vetor);
        System.out.println();
        System.out.println("Vetor invertido");
        reverteVetor(vetor);
        imprimir(vetor);
    }
    public static void gerarVetor(int[] v ){
        for(int i = 0; i < v.length; i++){
            v[i] = gerador.nextInt(20);
        }
    }
    public static void imprimir(int[] v){
        for(int i = 0;i < v.length; i++){
            if (i == v.length - 1) {
                System.out.print(v[i]);
            }else{
                System.out.print(v[i] + ", ");
            }
        }
        System.err.println();
    }
    public static void reverteVetor(int[] v){
        int meio = v.length / 2;
        int fim = v.length - 1;
        int aux;
        for(int i = 0; i < v.length; i++){
            if(i < meio){
            aux = v[fim - i];
            v[fim - i] = v[i];
            v[i] = aux;
            }
        }
    }
    public static void verificaFibo(int[] v){
        int soma, qtdSoma = 0;
        int totalSoma = v.length - 2;
        boolean fibo = false;
        for(int i = 2; i < v.length; i++) {
            soma = v[i - 2] + v[i - 1];
            if(soma == v[i]){
                fibo = true;
                qtdSoma += 1;
            }
        }
        if(fibo){
            System.out.println("Existe fibonacci no codigo.");
            if(qtdSoma == totalSoma){
                System.out.println("Todo o vetor esta em fibo");
            }else{
                System.out.println("Mas não em todo vetor");
            }
        }else{
            System.out.println("Não existe fibonacci");
        }
    }


}
