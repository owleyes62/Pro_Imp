package atividadeCasa.Atividade01;
import java.util.Scanner;

public class Atividade01 {
    public static Scanner input = new Scanner((System.in));
    public static void main(String[] args){
        double v_multa, v_juros, q_juros, soma_cm_cj;
        int v_conta, q_dias_atraso, resultado_f;

        System.out.println("Ola bem vindo ao Cálculo de Débito em Atraso");
        System.out.println("para saber o quanto vc precisa pagar a mais da sua conta atrasa voce precisa prencher as informações a baixo:");
        System.out.println();
        System.out.print("Valor da conta: ");
        v_conta = input.nextInt();
        System.out.print("Dias em atraso: ");
        q_dias_atraso = input.nextInt();
        if (q_dias_atraso <= 45){
            System.out.print("Valor da multa: ");
            v_multa = input.nextDouble();
            System.out.print("Valor do juros: ");
            v_juros = input.nextDouble();

            q_juros = q_dias_atraso * (v_juros / 30);
            soma_cm_cj = (v_conta * (v_multa / 100)) + (v_conta *(q_juros / 100));
            resultado_f = (int) v_conta + (int) soma_cm_cj;

            System.out.println("o valor mais multa e juros que vc deve pagar é de " + resultado_f + "R$");
        }
        else{
            System.out.println("Voce passou da quatidade de dias possiveis para realizar esse calculo\n porfavor va em uma de nossas agencias resolver pessoalmente");
        }



    }
}