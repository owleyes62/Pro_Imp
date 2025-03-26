import java.io.IOException;
import java.util.Scanner;

public class ArrayChange_I {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws IOException{
        int[] v_original = new int[20];
        int r = 0;
        
        while (r != 19){
            for (int j = 0; j <= 19; j++){
                v_original[j] = input.nextInt();
                r += 1;
            }
            
        int tamanhoVetorOriginal = v_original.length;
        int[] v_copia = new int[tamanhoVetorOriginal];
        int tamanhoVetorOriginalZeroBased = tamanhoVetorOriginal - 1;

        for(int i = 0; i < tamanhoVetorOriginal; i++) {
            v_copia[i] = v_original[tamanhoVetorOriginalZeroBased - i];
            System.out.println("N["+ i + "] = " + v_copia[i]);
        }
        input.close();
        }

    }
}
