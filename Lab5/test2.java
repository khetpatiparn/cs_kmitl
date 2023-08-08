import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rnd = sc.nextInt(); // 2
        for (int i = 1; i <= rnd; i++){
            System.out.println("round " + i);
        }
        sc.close();
    }
}
