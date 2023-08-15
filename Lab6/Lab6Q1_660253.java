import java.util.Scanner;

public class Lab6Q1_660253{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt(); // 12
        int arr[] = new int[input];// [1,5,0,0,0,0,0,0,0,0,0,0]
        // add num to arr
        for (int i = 0; i < arr.length; i++){
            int num = sc.nextInt();
            arr[i] += num;
        }
        // compare
        boolean prop = true;
        for (int j = 0; j < arr.length - 1; j++){
            if (arr[j] > arr[j + 1]){
                prop = false;
                break;
            }
        }
        System.out.println(prop);
        sc.close();
    }
}
