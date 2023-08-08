import java.util.Scanner;

class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rnd = sc.nextInt(); // 2
        for (int i = 0; i<rnd; i++){
            // System.out.println(i);
            i = sc.nextInt(); // inner round = 3
            System.out.println("input: " + i);
            
        }
        System.out.println("end");
        sc.close();
    }
}