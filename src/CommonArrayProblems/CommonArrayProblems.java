package CommonArrayProblems;

public class CommonArrayProblems {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 1; i < numbers.length; i++) {
            System.out.println(i + " = " + numbers[i]);

        }

        for (int i = 1; i <= numbers.length-1; i++) {
            System.out.println(i + " = " + numbers[i]);
        }

//        int[20] nums; // no compilation
        int[] nums = new int[20]; // size only on right side at initialization

//        int size = numbers.length(); // no compilation: lenght is not a methode
        int size = numbers.length;

//        numbers.length = 10; // no compilation: lenght is final

    }
}
