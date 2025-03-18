import java.util.Scanner;

public class Atividade04 {
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int v_inicial, fator_incremento, q_termos;

        System.out.println("Olá, bem-vindo ao gerador de Progressão Aritmética.");
        System.out.println("Por favor, preencha as informações abaixo:");

        System.out.print("Valor inicial: ");
        v_inicial = input.nextInt();

        System.out.print("Fator de incremento: ");
        fator_incremento = input.nextInt();

        System.out.print("Quantidade de termos: ");
        q_termos = input.nextInt();

        System.out.println("A Progressão Aritmética é:");

        for (int i = 0; i < q_termos; i++) {
            int termo = v_inicial + (i * fator_incremento);
            System.out.print(termo);
            if (i < q_termos - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        input.close();
    }
}
