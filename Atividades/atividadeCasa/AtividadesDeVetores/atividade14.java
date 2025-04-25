import java.util.Random;

public class atividade14 {
    public static Random gerador = new Random(5);
    public static void main(String[] args){
        int[] vetor = new int[10];
        gerarVetor(vetor);
        imprimirVetor(vetor);
        verificarRepetidos(vetor);
        System.out.println();
    }
    public static void gerarVetor(int[] v){
        for(int i = 0; i < v.length; i++){
            v[i] = gerador.nextInt(10);
        }
    }

    public static void imprimirVetor(int[] v){
        for(int i = 0; i < v.length; i++){
            if( i == v.length - 1){
                System.out.println(v[i]);
            }else{
                System.out.print(v[i]+ ", ");
            }
        }
    }
    public static void verificarRepetidos(int[] v){
        int  valor, valorRepetido, qtdValorV = 1;
        int[] valorVerificado = new int[v.length];
        for(int i = 0; i < v.length; i++){
            valorRepetido = 0;
            valor = v[i];
            boolean verificado = false;
            for(int k = 0; k < qtdValorV; k++){
                if(valorVerificado[k] == valor){
                    verificado = true;
                    break;
                }    
            }
            if(!verificado){
                for(int j = 0; j < v.length; j++){
                    if(valor == v[j]){
                        valorRepetido += 1;
                    }
                }
            }
            valorVerificado[i] = valor;
            qtdValorV += 1;
            if(valorRepetido > 1){
                System.out.println("Valor " + valor + " repetido " + (valorRepetido - 1) + " vezes." );
            }
        }
    }
}
