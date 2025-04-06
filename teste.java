import java.util.Random;

public class teste {
    public static void main(String[] args) {
        int[] vetor = new int[200];
        int[] frequencia = new int[21]; // índices de 1 a 20
        Random gerador = new Random();

        // Preencher vetor com números aleatórios de 1 a 20
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(20) + 1;
            frequencia[vetor[i]]++;
        }

        System.out.println("Valor | Frequência");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%2d   |    %2d\n", i, frequencia[i]);
        }
    }
    
}
