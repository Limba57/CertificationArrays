package NestedLoop;

import java.util.Arrays;

public class NestedLoop {

    public static void main(String[] args) {

        for (int hours = 1; hours <= 6; hours++) {
            for (int minutes = 0; minutes < 60; minutes++) {
                if (minutes < 10) {
                    System.out.println(hours + ":0" + minutes);
                } else {
                    System.out.println(hours+":"+minutes);
                }

            }
        }
        System.out.println("----");

        int[][] myArray = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(myArray);
        System.out.println(Arrays.toString(myArray));
        System.out.println();
        Outer:
        for (int[] rowArray : myArray) {
            Inner:
            for (int i = 0; i < rowArray.length; i++) {
                System.out.print(rowArray[i]+" ");
            }
            System.out.println();
        }
        System.out.println("----");

        Outer:
        for (int[] rowArray : myArray) {
            Inner:
            for (int i = 0; i < rowArray.length; i++) {
                if (rowArray[i] % 2 == 0) {
                    break Inner;
                }
                System.out.print(rowArray[i]+" ");
            }
            System.out.println();
        }
        System.out.println("----");

        Outer:
        for (int[] rowArray : myArray) {
            Inner:
            for (int i = 0; i < rowArray.length; i++) {
                if (rowArray[i] % 2 == 0) {
                    break Outer;
                }
                System.out.print(rowArray[i]+" ");
            }
            System.out.println();
        }
        System.out.println("\n----");

        Outer:
        for (int[] rowArray : myArray) {
            Inner:
            for (int i = 0; i < rowArray.length; i++) {
                if (rowArray[i] % 2 == 0) {
                    continue Inner;
                }
                System.out.print(rowArray[i]+" ");
            }
            System.out.println();
        }
        System.out.println("----");

        Outer:
        for (int[] rowArray : myArray) {
            Inner:
            for (int i = 0; i < rowArray.length; i++) {
                if (rowArray[i] % 2 == 0) {
                    continue Outer;
                }
                System.out.print(rowArray[i]+" ");
            }
            System.out.println();
        }
        System.out.println("\n----");

        int x = 10;
        while (x > 0) {
            do {
                x -= 1;
            } while (x>5);
            x--;
            System.out.println(x);
        }

        int num = 120;
        switch (num) {
            default:
                System.out.println("defaut");
            case 0:
                System.out.println("case 1");
            case 10:
                System.out.println("case 2");
                break;
        }

    }
}
