package MultidimentionalArray;

import java.util.Arrays;

public class MultidimentionalArray {

    public static void main(String[] args) {

        // 1d array
        int[] myArray = {0, 1};

        // 2d array
        int[][] array = new int[2][4];       // 2 rows, 4 columns
        int anotherArray[][] = new int[2][4];// idem
        int[] myIntArray[] = new int[2][4];  // idem but confusing

        String[][] my2dArray = new String[][]{
                {"one","two"},                  // first row 2 columns
                {"three","four","five"},        // second row 3 columns
                {"six","seven", "eight", "nine"},// third 4 columns
                null
        };
        for (String[] s : my2dArray) {
            System.out.println(Arrays.toString(s));
        }

        int[][] numberTable = new int[2][3];
        numberTable[0][0] = 1;
        numberTable[0][1] = 2;
        numberTable[0][2] = 3;
//        numberTable[0][3] = 4; out of bound

        // 3d array
        // pages, rows, column
        int[][][] threeArray = new int[3][3][3];
        int oneMoreThreeArray[][][] = new int[3][3][3];//idem
        int[] anotherThreeArray[][]= new int[3][3][3]; //idem
        int[][] lastThreeArray[]= new int[3][3][3];    //idem

        int[][][] threeDArray = {
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
                {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}
        };
        System.out.println(threeDArray[1][2][1]); //17
        System.out.println(threeDArray[2][1][0]); //22
    }
}
