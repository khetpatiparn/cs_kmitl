public class Lab5Q5_2660253 {
    public static void main(String[] args) {
        int n = 4;

        int k = 4;
        for (int row = n; row > 0; row--){
            k = 4;
            for (int col = 0; col < n - row + 1; col++){
                System.out.print(k);
                k--;
            }
            System.out.println();
        }
    }
}
