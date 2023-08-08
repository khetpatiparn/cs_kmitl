import java.util.Scanner;

class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rnd = sc.nextInt(); // 2
        for (int i = 1; i <= rnd; i++){
            System.out.println("round " + i);
            i = sc.nextInt(); // inner round = 3
            // System.out.println("input: " + i);
            int sum = 0;
            for (int inner = 0; inner < i; inner++){
                // System.out.println("input round " + inner);
                int input_to_sum = sc.nextInt();
                sum += input_to_sum;
            }
            System.out.println(sum);
        }
        System.out.println("end");
        sc.close();
    }
}