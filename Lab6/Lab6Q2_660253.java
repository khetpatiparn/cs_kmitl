import java.util.Arrays;

public class Lab6Q2_660253 {
    public static void main(String[] args) {
        String str = "10 10 10 01 10 10";
        String arr[] = str.split(" ");

        int count = 1;
        for (int i = 1; i < arr.length; i++){
            if (Integer.parseInt(arr[i]) != Integer.parseInt(arr[i - 1])){
                count++;
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(arr));
    }
}