public class Lab4Q1_2660253 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++){
            int data = Integer.parseInt(args[i]);
            if ((data > 0) && (data % 2 == 0)){
                sum += data;
            }
        }
        System.out.println("sum of even number is: " + sum);
    }
}