import java.util.Scanner;

class inclass_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rnd = sc.nextInt(); // 2
        for (int i = 1; i <= rnd; i++){
            int outer = sc.nextInt(); // inner round = 3
            int sum = 0;
            for (int inner = 0; inner < outer; inner++){
                int input_to_sum = sc.nextInt();
                sum += input_to_sum;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}