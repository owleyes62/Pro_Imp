import java.util.Scanner;

public class atividade02 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int[] valores = new int[10];
        lerValores(valores);
        for (int i = 0; i < valores.length; i += 1){
            System.out.println(valores[i]);
        }
    }
    public static void lerValores(int[] v){
        int valor;
        for (int i = 0; i < v.length; i += 1){
            System.out.print("valor " + (i + 1) + ": ");
            valor = input.nextInt();
            v[i] = valor;
        }
        
    }
}
