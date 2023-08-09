public class Lab5Q4_1660253{
    public static void main(String[] args) {
        String str = "WWWWMMMMWMWMWMWMMMWWWWWM";
        int numW = 0;
        int numM = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'W'){
                numW++;
            }else{
                numM++;
            }
        }
        System.out.printf("There are %d men and %d women", numM, numW);
    }
}