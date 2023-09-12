import java.util.Arrays;

public class ProFun09_xxyyyy {
    public static void main(String... args) {
        // 
        q2();
        q3_markTheBomb();
        /* Q1 could take sometime to understand the idea, solve q1 last. */
        // q1();
    }
    static void q1() {
        System.out.println("-q1----");
        int [] template = {0,1,0,1,1,0,0,0,1};
        int [] data = new int [template.length];
        System.arraycopy(template, 0, data, 0, template.length);
        q1_supernavie(template);
        System.arraycopy(template, 0, data, 0, template.length);
        q1_improve_naive(template); 
        System.arraycopy(template, 0, data, 0, template.length);
        q1_transform(template);

    }
    static void q1_supernavie(int [] data) {
        int goLeft, goRight;
        for (int i = 0; i < data.length; i++) {

            for (goLeft = 0; goLeft < data.length; goLeft++)
                if (data[goLeft] == 1)
                    break;
            for (goRight = data.length - 1; goRight >= 0; goRight--)
                if (data[goRight] == 0)
                    break;

            if (goLeft < goRight) { 
                int tmp = data[goLeft];
                data[goLeft] = data[goRight];
                data[goRight] = tmp;
            }
        }
        System.out.println(Arrays.toString(data));
    }
    static void q1_improve_naive(int [] data) {
        // not so easy, you may consider doing this later
    }
    static void q1_transform(int [] data) {

    }
    static void q2() {
        // 
        int [][] data = {   {11,12,13,14}, 
                            {15,16,17,18},
                            {19,20,21,22},
                            {23,24,25,26},
                            {27,28,29,30} };
        System.out.println("-q2----");
        q2_flip_by_new_array(data);
        System.out.println("way2");
        q2_flipHorizontal_inplace(data);
        for (int row = 0; row < data.length; row++) {
                System.out.println(Arrays.toString(data[row]));
        }        
        System.out.println("way3");
        q2_swap_rows(data);
        for (int row = 0; row < data.length; row++) {
                System.out.println(Arrays.toString(data[row]));
        }
    }
    static void q2_flip_by_new_array(int [][] data) {
        int [][] hori = flipHorizontal(data);
        for (int row = 0; row < data.length; row++) {
                System.out.println(Arrays.toString(hori[row]));
        }
    }

    static int[][] flipHorizontal(int [][] img) {
        int [][] aRef = new int[img.length][img[0].length];// arr[5][4]
        int r2 = img.length - 1; // 4
        for (int row = 0; row < img.length; row++) {
            for (int col = 0; col < img[row].length; col++) {
                aRef[r2 - row][col] = img[row][col];// [4 - 0][0/1/2/3]
            }
        }
        return aRef;
    }
    
    static void q2_flipHorizontal_inplace(int [][] img) {
        int r2 = img.length - 1; // 4
        for (int row = 0; row < img.length/2; row++) {
            for (int col = 0; col < img[row].length; col++) {
                int temp = img[row][col];
                img[row][col] = img[r2 - row][col];
                img[r2 - row][col] = temp;
            }
        }
    }
    static void q2_swap_rows(int [][] img) {
        // idea is 
        // swap(row_0, row_n-1)
        // swap(row_1, row_n-1 - i)

        for (int row = 0; row < img.length/2; row++) {    
            int temp[] = img[row];
            img[row] = img[img.length - 1 - row];
            img[img.length - 1 - row] = temp;
        }
    }

    static void q3_markTheBomb() {
        int[][] map = { { 0, 0, 9, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0 },
                        { 0, 0, 0, 0, 0, 0, 0, 9, 9, 9, 0, 0, 0 },
                        { 0, 9, 9, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0 },
                        { 0, 9, 0, 0, 9, 9, 0, 0, 9, 0, 9, 0, 0 },
                        { 0, 9, 0, 0, 9, 9, 0, 0, 9, 9, 9, 0, 0 }, 
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0 },
                        { 0, 0, 0, 0, 0, 0, 0, 9, 9, 9, 0, 0, 0 },
                        { 0, 0, 0, 0, 0, 0, 0, 9, 9, 0, 0, 0, 0 }
                    };
        int[][] map2 = new int[map.length][map[0].length];
        int row = 0;
        int col = 0;
        initialMap2(map, map2);
        markTheBomb(map2);
        for (row = 0; row < map2.length; row++) {
            System.out.println(Arrays.toString(map[row]) + "\t" + Arrays.toString(map2[row]));
        }
    }

    static void initialMap2(int[][] map, int[][] map2) {
        int row = 0;
        int col = 0;
        for (row = 0; row < map.length; row++) {
            for (col = 0; col < map[0].length; col++) {
                map2[row][col] = map[row][col];
            }
        }
    }

    static void markTheBomb(int[][] map2) {
        /* your code */
    }
}
