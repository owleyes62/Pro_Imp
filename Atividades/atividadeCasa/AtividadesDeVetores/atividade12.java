import java.util.Random;

public class atividade12 {
    public static Random gerador = new Random();
    public static void main(String[] args){
        int[] vetor = new int[5];
        resultadoVetor(vetor);
        exibirMedia(vetor);
    }
    public static void resultadoVetor(int[] v){
        int mValor = 0, meValor = 0;
        for(int i = 0; i < v.length; i++){
            v[i] = gerador.nextInt();
            if(mValor < v[i]){
                mValor = v[i];
            }
        }
        meValor = mValor;

        for(int i = 0; i < v.length; i++){
            if(meValor > v[i]){
                meValor = v[i];
            }
        }

        System.out.println("Maior valor = "+ mValor + " Menor valor = " + meValor);
    }
    public static void exibirMedia(int[] v){
        int media = 0, soma = 0;
        for (int i = 0; i < v.length; i++) {
            soma += v[i];
            System.out.println(v[i]);
        }
        media = soma / v.length;
        System.out.println("Media = " + media);
    }
}
