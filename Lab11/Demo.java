import java.util.Arrays;

public class Demo {
    public static void main(String[] args){
        // demo1();
        // q1();
        // q2_flip();
        q3_scoreboard();
    }
    // q3
    static void q3_scoreboard(){
        int [] team_id = {22,11,33};
        int [] points = {88,99,77};
        q3_sub1(team_id, points);
    }

    static void q3_sub1(int [] teams, int[] score){
        int iter = 0;
        int maxIdx = iter;
        for (int i = iter + 1; i < teams.length; i++){
            if (score[maxIdx] < score[i]){
                maxIdx = i;
            }
        }
        int tmp = score[iter];
        score[iter] = score[maxIdx];
        score[maxIdx] = tmp;

        tmp = teams[iter];
        teams[iter] = teams[maxIdx];
        teams[maxIdx] = tmp;
        // System.out.println("iter max = " + score[iter]);
        System.out.println(Arrays.toString(score));
        System.out.println(Arrays.toString(teams));
    }

    // flip
    static void q2_flip(){
        int [][] data = {
            {11,12,13,14},
            {15,16,17,18},
            {19,20,21,22}
        };
        // int [][] hori = q2_flip1(data); // choose position
        // for swap method
        q2_flip3(data); // method 3
        for (int[] row : data){ // change to hori for first method
            System.out.println(Arrays.toString(row));
        }
    }
    // pick position
    static int [][] q2_flip1(int [][] input){
        int [][] output = new int[input.length][input[0].length];
        int lastRow = input.length - 1;
        int row = 0;
        for (row = 0; row < input.length; row++)
            for (int col = 0; col < input[0].length; col++){
                output[lastRow - row][col] = input[row][col];
            }
        return output;
    }
    // filp swap solution
    static int [][] q2_flip2(int [][] input){
        int row = 0;
        for (row = 0; row < input.length / 2; row++)
            for (int col = 0; col < input[0].length; col++){
                int tmp = input[row][col];
                input[row][col] = input[input.length - 1 - row][col];
                input[input.length - 1 - row][col] = tmp;
            }
        return new int[0][0];
    }
    // flip method 3
    static void  q2_flip3(int [][] input){
        int iter;
        for (iter = 0; iter < input.length / 2; iter++){
            int [] tmp = input[iter];
            input[iter] = input[input.length - 1 - iter];
            input[input.length - 1 - iter] = tmp;
        }
    }

    // transpose
    static void q1(){
        int [][] data = {
            {11,12,13,14}, 
            {15,16,17,18}
        };
        int [][] transpose = q1_sub(data);
        for (int [] row : transpose){
            System.out.println(Arrays.toString(row));
        }
    }

    static int [][] q1_sub(int [][] input){
        int [][] t = new int [input[0].length][input.length];
        int row = 0;
        for (row = 0; row < input.length; row++)
            for (int col = 0; col < input[0].length; col++){
                t[col][row] = input[row][col];
            }
        return t;
    }

    // learn about method parameter
    static void demo1(){
        int [] a = {1, 2, 3};
        sub_demo(a);
        System.out.println(Arrays.toString(a));
    }

    static int[] sub_demo1(int [] b){
        int [] c = new int [b.length];
        for (int i = 0; i < b.length; i++){
            c[i] = 2 * b[i];
        }
        b = c;
        return c;
    } 

    static void sub_demo(int [] b){
        int [] c = new int [b.length];
        for (int i = 0; i < b.length; i++){
            b[i] = 2 * b[i];
        }
        b = c;
    } 
}