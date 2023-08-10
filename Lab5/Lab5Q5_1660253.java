public class Lab5Q5_1660253 {
    public static void main(String[] args) {
        int n = 10, rows = n, cols = n;
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= cols; j++){
                if (i == j || j == (cols - i + 1)){
                    System.out.print(" ");
                }else{
                    System.out.print("x");
                }
            }
            System.out.println();
        }
    }
}
