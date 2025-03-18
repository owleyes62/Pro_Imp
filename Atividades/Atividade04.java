import java.util.Scanner;

public class Atividade04 {
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int valorInicial, fatorIncremento, quantidadeTermos;

        System.out.println("Olá, bem-vindo ao gerador de Progressão Aritmética.");
        System.out.println("Por favor, preencha as informações abaixo:");

        System.out.print("Valor inicial: ");
        valorInicial = input.nextInt();

        System.out.print("Fator de incremento: ");
        fatorIncremento = input.nextInt();

        System.out.print("Quantidade de termos: ");
        quantidadeTermos = input.nextInt();

        System.out.println("A Progressão Aritmética é:");

        for (int i = 0; i < quantidadeTermos; i++) {
            int termo = valorInicial + (i * fatorIncremento);
            System.out.print(termo);
            if (i < quantidadeTermos - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        input.close();
    }
}
