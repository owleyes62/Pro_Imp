import java.io.IOException;
import java.util.Scanner;

public class ArrayReplacement_I {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args)  throws IOException{
        int[] v = new int[10];
        int l = 0;
        while (l != 9) {
            for(int i = 0; i <= 9; i++) {
                v[i] = input.nextInt();
                if(v[i] <= 0){
                    v[i] = 1;
                }
                l += 1;
        }
        input.close();
        
        for(int  j = 0; j <= 9; j++)
            System.out.println("X[" + j + "] = " + v[j]);
        }
    }
}