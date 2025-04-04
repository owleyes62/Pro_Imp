public class teste {
    public static void main(String[] args){
        int [] v ={1, 2, 3, 4, 5, 6};
        int x = 5;
        for(int i = 0; i < v.length; i += 1){
            if (x != v[i]){
                System.out.println("Adiciona valor");
            }else{
                System.out.println("Refaz valor");
                v[i] = 4;
                x = 3;
            }
            System.out.println(v[i] + ", ");
        }
    }
    
}
