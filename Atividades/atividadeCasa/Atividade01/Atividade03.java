package atividadeCasa.Atividade01;
import java.util.Scanner;

public class Atividade03 {
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        String sexo;
        int idade;
        double peso, media_p_homens, percentual_mulheres_abaixo50kg;

        int totalMulheres = 0;
        int mulheresAbaixo50kg = 0;
        double pesoHomens = 0;
        int contHomens = 0;
        int idadeMaisPesada = 0;
        double pesoMaisPesado = 0;
        
        System.out.println("Olá, bem-vindo ao registro de pessoas.");
        System.out.println("Para registrar as informações, preencha os dados abaixo:");
        System.out.println();

        while (true) {
            System.out.print("Digite o sexo (M/F) ou 'S' para sair: ");
            sexo = input.next().toUpperCase();

            if (sexo == "S") {
                break;
            }

            System.out.print("Digite a idade: ");
            idade = input.nextInt();

            System.out.print("Digite o peso: ");
            peso = input.nextDouble();

            if (peso > pesoMaisPesado) {
                pesoMaisPesado = peso;
                idadeMaisPesada = idade;
            } else if (peso == pesoMaisPesado) {
                idadeMaisPesada = idade;
            }

            if (sexo == "M" && idade < 30) {
                pesoHomens += peso;
                contHomens++;
            }

            if (sexo == "F") {
                totalMulheres++;
                if (peso < 50) {
                    mulheresAbaixo50kg++;
                }
            }
        }

        media_p_homens = (contHomens > 0) ? pesoHomens / contHomens : 0;
        percentual_mulheres_abaixo50kg = (totalMulheres > 0) 
                ? (double) mulheresAbaixo50kg / totalMulheres * 100 
                : 0;

        System.out.println("Idade da pessoa mais pesada: " + idadeMaisPesada);
        System.out.printf("Média de peso dos homens com menos de 30 anos: %.2f kg%n", media_p_homens);
        System.out.printf("Percentual de mulheres com menos de 50 kg: %.2f%%%n", percentual_mulheres_abaixo50kg);

    }
}
