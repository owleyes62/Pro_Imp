import java.util.Random;

public class Aitividade05 {
    public static Random gerador = new Random(1);

    public static void main(String[] args) {
        int jogador1 = 0;
        int jogador2 = 0;
        int jogadas = 0;
        for (int i = 1; i<= 10; i+= 1){
            int dado1 = gerador.nextInt(6);
            int dado2 = gerador.nextInt(6);
            System.out.println(dado1, dado2);

        }


    }
}
