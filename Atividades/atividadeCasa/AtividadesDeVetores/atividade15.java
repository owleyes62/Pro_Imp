import java.util.Random;

public class atividade15 {
    public static Random gerador = new Random(5);
    public static void main(String[] args){
        int qtdvetor = 0;
        int[] vetor = new int[20];
        int[] novoVetor = new int[20];
        gerarVetor(vetor);
        System.out.println("Vetor original");
        imprimirVetor(vetor, vetor.length);
        System.out.println();
        qtdvetor = eliminarRepitidos(vetor, novoVetor, qtdvetor);
        System.out.println();
        System.out.println("Vetor sem valores repetidos");
        imprimirVetor(novoVetor, qtdvetor);
        System.out.println();
    }
    public static void gerarVetor(int[] v){
        for (int i = 0; i < v.length; i++) {
            v[i] = gerador.nextInt(15);
        }
    }
    public static void imprimirVetor(int[] v, int qtdV){
        for (int i = 0; i < qtdV; i++) {
            if(i  == qtdV - 1){
                System.out.print(v[i]);
            }else{
                System.out.print(v[i] + ", ");                }
        }
    }

    public static int eliminarRepitidos(int[] v, int[] nv, int qtdNv){
        int valor, qtdRepetidos, qtdValorV = 0;
        int [] valorVerificado = new int[v.length];
        
        for (int i = 0; i < v.length; i++) {
            qtdRepetidos = 0;
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
                        qtdRepetidos += 1;
                        if (qtdRepetidos == 1) {
                            nv[qtdNv] = valor;
                            qtdNv += 1;
                        }
                    }
                }
            }
            valorVerificado[i] = valor;
            qtdValorV += 1;            
        }
        return qtdNv;
    }
}
