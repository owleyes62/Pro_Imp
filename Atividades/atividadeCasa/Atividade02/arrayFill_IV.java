import java.io.IOException;
import java.util.Scanner;

public class arrayFill_IV {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws IOException{
        int[] par = new int[5];
        int[] impar = new int[5];
        int parIndex = 0, imparIndex = 0;

        for (int i = 0; i < 15; i++) {
            int num = input.nextInt();

            if (num % 2 == 0) {
                par[parIndex++] = num;
                if (parIndex == 5) {
                    for (int j = 0; j < 5; j++) {
                        System.out.println("par[" + j + "] = " + par[j]);
                    }
                    parIndex = 0; 
                }
            } else {
                impar[imparIndex++] = num;
                if (imparIndex == 5) {
                    for (int j = 0; j < 5; j++) {
                        System.out.println("impar[" + j + "] = " + impar[j]);
                    }
                    imparIndex = 0; 
                }
            }
        }

        
        for (int j = 0; j < imparIndex; j++) {
            System.out.println("impar[" + j + "] = " + impar[j]);
        }

        
        for (int j = 0; j < parIndex; j++) {
            System.out.println("par[" + j + "] = " + par[j]);
        }

        input.close();
    
    }
    
}
