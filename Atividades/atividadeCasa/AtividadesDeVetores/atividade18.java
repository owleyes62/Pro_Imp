import java.util.Random;

public class atividade18 {
    public static Random gerador = new Random();
    public static void main(String[] args){
        int[] vetor = new int[10];
        int valor = 3;
        gerarNum(vetor);
        System.out.println("Vetor original.");
        imprimir(vetor);
        System.out.println();
        multiplosX(vetor, valor);
    }
    public static void gerarNum(int[] v){
        for(int i = 0; i < v.length; i++){
            v[i] = gerador.nextInt(20);
        }
    }
    public static void imprimir(int[] v){
        for (int i = 0; i < v.length; i++) {
            if(i == v.length - 1){
                System.out.print(v[i]);
            }else{
                System.out.print(v[i] + ", ");
            }
        }
    }
    public static void multiplosX(int[] v, int x){
        int multiplosX;
        for (int i = 0; i < v.length; i++) {
            if(v[i] % x == 0){
                multiplosX = v[i];
                System.out.println("O número " + multiplosX + " é múltiplo de " + x);
            }
        }
    }
}
