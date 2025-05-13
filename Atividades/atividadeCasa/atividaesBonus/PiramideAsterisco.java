public class PiramideAsterisco {
    public static void main(String[] args){
        int tamanhoPiramide = 8;
        gerarPiramide(tamanhoPiramide);
    }
    public static void gerarPiramide(int b){
            for (int i = 1; i <= b; i++) {

                for (int j = 1; j <= b - i; j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }

            System.out.println();
        }
    }
}
