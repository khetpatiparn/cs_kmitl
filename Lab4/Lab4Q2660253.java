public class Lab4Q2660253 {
    public static void main(String[] args) {
        int data[] = {0, 0, 0};
        int idx = 0;
        int min = 0;
        int sum = 0;
        for(int i = 0; i < args.length; i++){
            data[i] = Integer.parseInt(args[i]);
            sum += data[i];
        }

        for (int j = 0; j < data.length; j++){
            if (data[idx] > data[j]){
                min = data[j];
            } else {
                min = data[idx];
            }
        }
        int total = sum - min;
        System.out.println("sum of 2 largest values is: " + total);
    }
}