public class Lab5Q4_2660253{
    public static void main(String[] args) {
        String s1 = "i am happy";
        s1 = s1.toLowerCase();
        int i = 0;
        int idx = -1;
        while (i < s1.length()){
            char c = s1.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                idx = i;
                break;
            }
            i++;
        }
        System.out.println(idx);
    }
}