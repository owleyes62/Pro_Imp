import java.util.Random;

public class atv03ReverterMetade {
    public static Random gerador = new Random();
    public static void main(String[] args){
        
        int[] vetor = {8, 13, 21, 34, 55, 8};
        int qtdVetor = vetor.length;
        imprimir(vetor);
        System.out.println();
        System.out.println("Vetor verificado");
        verificarFibo(vetor);
        imprimir(vetor);
        System.out.println();
        System.out.println("Vetor invertido");
        reverteVetor(vetor);
        imprimir(vetor);
        System.out.println();
        System.out.println("Vetor invertido verificado");
        verificarFibo(vetor);
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
        for(int i = 0; i < meio; i++){
            aux = v[fim - i];
            v[fim - i] = v[i];
            v[i] = aux;
        }
    }
    public static void verificarFibo(int[] v){
       
        
    }


}
