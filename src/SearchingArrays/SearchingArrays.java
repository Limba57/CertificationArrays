package SearchingArrays;

import com.sun.jdi.ArrayReference;

import java.util.Arrays;

public class SearchingArrays {

    public static void main(String[] args) {

        int[] numbers = {1, 3, 5, 6, 7};
        // index         0  1  2  3  4
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 5));
        System.out.println(Arrays.binarySearch(numbers, 7));
        System.out.println(Arrays.binarySearch(numbers, 1));
        System.out.println(Arrays.binarySearch(numbers, 3));
        System.out.println(Arrays.binarySearch(numbers, 6));
        System.out.println(Arrays.binarySearch(numbers, 4));
        System.out.println();

        int[] notSorted = {5, 6, 10, 8, 4};
        System.out.println(Arrays.toString(notSorted));
        // index           0  1  2   3  4
        System.out.println(Arrays.binarySearch(notSorted,5));
        System.out.println(Arrays.binarySearch(notSorted,6));
        System.out.println(Arrays.binarySearch(notSorted, 8));
        Arrays.sort(notSorted);
        // value sorted    4  5  6  8  10
        // index           0  1  2  3  4
        System.out.println(Arrays.toString(notSorted));
        System.out.println(Arrays.binarySearch(notSorted,5));
        System.out.println(Arrays.binarySearch(notSorted,6));
        System.out.println(Arrays.binarySearch(notSorted, 8));
    }
}
