import java.util.Random;

public class Aitividade05 {
    public static Random gerador = new Random();

    public static void main(String[] args) {
        int jogador1 = 0;
        int jogador2 = 0;
        
        for (int i = 1; i<= 10; i+= 1){
            int dado1 = gerador.nextInt(6);
            int dado2 = gerador.nextInt(6);
            if (dado1 > dado2){
                jogador1 = jogador1 + 1;
                System.out.println("jogador 1: " + dado1 + " jogarodor 2: "  + dado2 + " jogador 1 ganhou");
            }
            else if (dado2 > dado1){
                jogador2 = jogador2 + 1;
                System.out.println("jogador 1: " + dado1 + " jogarodor 2: "  + dado2 + " jogador 2 ganhou");
            }
            else{
                System.out.println("jogador 1: " + dado1 + " jogarodor 2: "  + dado2 + " Empate");
            }
        }

        if (jogador1 > jogador2){
            System.out.println("Jogador 1 ganhou de " + jogador1 + " x " + jogador2);
        }
        else{
            System.out.println("Jogador 2 ganhou de " + jogador2 + " x " + jogador1);
        }


    }
}
