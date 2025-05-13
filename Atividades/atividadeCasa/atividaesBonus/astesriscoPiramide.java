public class astesriscoPiramide {
    public static void main(String[] args){
        int base = 5;
        gerarPiramide(base);
    }
    public static void gerarPiramide(int n){
        String ast = "*";
        for (int i = 0; i < n; i++) {
            System.out.println(ast);
            if(i < n){
                ast += "*";
            }
        }
    }
}
