import java.util.Scanner;

public class atividade03 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        double[] valores = new double[10];
        double[] valorQuadrados = new double[10];
        receberValoresParaQuadrado(valores, valorQuadrados);
        for(int i = 0; i < valorQuadrados.length; i += 1){
            System.out.println("Valores em quadrados" + valorQuadrados[i]);
        }

    }

    public static void receberValoresParaQuadrado(double[] v, double[] vQ){
        double valor;
        for(int i = 0; i < v.length; i += 1){
            System.out.print((i + 1) + ") Valores digitados: ");
            valor = input.nextDouble();
            v[i] = valor;
            vQ[i] = v[i] * v[i]; 
        }

    }
}
