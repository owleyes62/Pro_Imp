import java.util.Random;

public class atividade13 {
    public static Random gerador = new Random();
    public static void main(String[] args){
        int[] vetor = new int[5];
        menorMaiorValor(vetor);
        exibir(vetor);
    }
    public static void menorMaiorValor(int[] v){
        int maValor = 0, meValor, posMaValor = 0, posMeValor = 0;
        for (int i = 0; i < v.length; i++) {
            v[i] = gerador.nextInt();
            if (maValor < v[i]) {
                maValor = v[i];
                posMaValor = i;
            }
        }
        meValor = maValor;
        for (int i = 0; i < v.length; i++) {
            if (meValor > v[i]) {
                meValor = v[i];
                posMeValor = i;
            }
        }
        System.out.println("posiçãoMaior = " + posMaValor + ", valorMaior = " + maValor);
        System.out.println("posiçãoMenor = " + posMeValor + ", valorMenor = " + meValor);
    }

    public static void exibir(int[] v){
        for (int i = 0; i < v.length; i++) {
            System.out.println( i + " | " + v[i]);
        }
    }
}
