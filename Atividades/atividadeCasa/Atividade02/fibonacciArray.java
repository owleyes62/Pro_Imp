import java.util.Scanner;

public class fibonacciArray {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int T = input.nextInt();
        for (int j = 0; j < T; j++) {
        	int N = input.nextInt();
            long anterior = 0, atual = 1, proximo;
	        for (int i=0; i < N; i++) {
	        	proximo = anterior + atual;
	        	anterior = atual;
	        	atual = proximo;
	        }
	        System.out.println("Fib("+ N +") = " + anterior);
        }
    }
}
