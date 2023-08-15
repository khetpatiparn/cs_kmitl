public class Lab5Q5_4660253{
    public static void main(String[] args) {
        int layer = 3;
        int numLines = 4;
        int numStars;
        int space;
        for (int i = 0; i < layer; i++) {
            numStars = (2 * i) - 1;
            for (int j = 0; j < numLines; j++) {
                numStars += 2;
                space = layer - i - j + 2;
                for (int s = 0; s < space; s++) {
                    System.out.print(" ");
                }

                for (int j2 = 0; j2 < numStars; j2++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        for (int k = 0; k < layer ; k++) {
            System.out.print("    ");
            for (int g = 0; g < layer; g++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
