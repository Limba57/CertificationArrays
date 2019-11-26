package VariableArgument;

import java.util.Arrays;

public class VariableArgument {

     public static void main(String... args) {

         System.out.println(args.length);
         System.out.println(Arrays.toString(args));
         System.out.println();

         print(args);
         print("java");
         print("this", "is", "my", "string", "array");
         print(new String[]{"another", "string", "array"});
         System.out.println();

//         printArray("test", "array"); // no compilation: this is not a array
//         printArray({"test", "array"}); // no compilation
         String[] stringArray;
//         printArray(stringArray); // no compilation: pas d'initialisation
         stringArray = new String[]{"test", "array"};
         printArray(stringArray);
         String[] otherStringArray = {"other", "array"};
         printArray(otherStringArray);
    }

    private static void print(String... myArgument) {
        System.out.println(Arrays.toString(myArgument));
    }

    private static void printArray(String[] myArguments) {
        System.out.println(Arrays.toString(myArguments));
    }
}
