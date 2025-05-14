import java.util.Random;

public class atividade05 {
    public static void main(String[] args){
        int[] vetor = new int[10];
        valoresPares(vetor);
    }
    public static void valoresPares(int[]v ){
        Random gerador = new Random();
        int quantidade = 0;
        for(int i = 0; i < v.length; i += 1){
            int geraNum = gerador.nextInt(20);  
            v[i] = geraNum;
            if(v[i] % 2 == 0){
                System.out.println(v[i] + " Par");
                quantidade += 1;
            }else{
                System.out.println(v[i] + " Impar");
            }
        }System.out.println("quantidade total de pares " + quantidade);
        
    }
}
