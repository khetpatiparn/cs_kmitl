public class Lab5Q4_2660253{
    public static void main(String[] args) {
        String s1 = "i am happy";
        s1 = s1.toLowerCase();
        int idx = -1;
        for (int i = 0; i < s1.length(); i++){
            char c = s1.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                idx = i;
                break;
            }
        }
        System.out.println(idx);
    }
}