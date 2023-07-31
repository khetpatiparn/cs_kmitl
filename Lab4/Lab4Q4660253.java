import java.util.Scanner;

public class Lab4Q4660253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input K round: ");
        int k = sc.nextInt();
        int data[] = new int[4];
        int idx = 0;
        int max = 10_000;
        for (int num = 1; num <= max; num++){
            int sum = 0;
            for (int i = 1; i <= num / 2; i++){
                if (num % i == 0){
                    sum += i;
                }
            }
            if(sum == num){
                data[idx] = num;
                idx++;
            }
        }
        if(k <= 4){
            for (int j = 0; j < k; j++) {
                System.out.println("perfect number  = "  + data[j]);
            }
        }else{
            System.out.println("your round over limit of this program.");
        }
        sc.close();
    }
}
