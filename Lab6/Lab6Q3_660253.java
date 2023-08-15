public class Lab6Q3_660253 {
    public static void main(String[] args) {
        String str = "At KMITL CHALONGKRUNG BMI MTL";
        String replace = "MI";
        String replaceto = "CSP";
        // tokenize
        String token[] = str.split(" ");
        // for each token
        for (int i = 0; i < token.length; i++){
            // token[i] = KMITL
            int pos = token[i].indexOf(replace); // K[M]ITL = 1
            int len = replaceto.length(); // len(CSP) = 3

            if (token[i].contains(replace)){ // if MI in K[MI]TL => boolean
                // token[i].substring(0, pos) => K
                // token[i].substring(len) => TL
                token[i] = token[i].substring(0, pos) + replaceto + token[i].substring(len); // K + CSP + TL
            }
            
            System.out.print(token[i] + " ");
        }
    }
}