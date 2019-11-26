package UnderstandingArrays;

import java.util.Arrays;

public class UnderstandingArrays {

    public static void main(String[] args) {

        int[] myIntArray = new int[3];
        System.out.println(myIntArray[1]);

        boolean[] myBoolArray = new boolean[3];
        System.out.println(myBoolArray[1]);

        String[] myStringArray = new String[3];
        System.out.println(myStringArray[1]);

        int[] intTest = new int[]{10,11};

        int[] one = new int[3];
        int[] two = new int[]{10, 11, 12};
//        double a = new double[2.55]; // no compilation: must be a int in the initialization
        double[] b = new double[4 * 5 / 2]; // create array whith 10 elements

        int x = 4;
        int y = 4;
        double[] c = new double[x + y]; // create empty array of double of 8 elements

        int[] three = {10, 11, 12}; // anonymous array

        int[] a1; // one way to declare array
        int a3[]; // another way to declare array (idem)

        int[] ids, types; // create two arrays
        int ids2[], types2; // create one arrays and one int variable

        String[] animals = {"Parrot", "Dogs", "Cat"};
        String[] myAnimals = animals;
        String[] otherAnimals = {"Parrot", "Dogs", "Cat"};
        System.out.println(animals.equals(myAnimals));    // compare references
        System.out.println(animals == myAnimals);         // compare references
        System.out.println(animals.equals(otherAnimals)); // compare references
        System.out.println(animals == otherAnimals);      // compare references
        System.out.println(Arrays.equals(animals,myAnimals));    // compare elements
        System.out.println(Arrays.equals(animals,otherAnimals)); // compare elements

        System.out.println(animals);
        System.out.println(animals.toString());
        System.out.println(Arrays.toString(animals));

    }
}
