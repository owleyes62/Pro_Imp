import java.util.Scanner;

public class atividade04 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8};
        buscarSomar(vetor);
    }
    public static void buscarSomar(int[] v){
        int x = 1;
        int y = 3;
        for(int i = 0; i < 1; i += 1){
            int soma = v[x] + v[y];
            System.out.println(v[x] + " + " + v[y] + " = " + soma);              
        }
    }
}
