package BreakStatementAndLabels;

public class BreakStatementAndlabels {

    public static void main(String[] args) {

//        myLabel:
//        int[] myArray = {1, 2, 3};

        myLabel: {
            int[] myArray = {1, 2, 3};
        }

        String[] animals = {"dog", "cat", "lizard", "bird", "snake"};

        for (String animal : animals) {
            System.out.println(animal);
        }

        MY_LOOP :
        for (String animal : animals) {
            if (animal.equals("cat")) {
                break MY_LOOP;
            }
            System.out.println(animal);
        }

        animal:
        for (String animal : animals) {
            if (animal.equals("cat")) {
                break animal;
            }
            System.out.println(animal);
        }

        for (String animal : animals) {
            if (animal.equals("lizard")) {
                break;
            }
            System.out.println(animal);
        }

        int index = 0;
        while (index < animals.length) {
            String animal = animals[index];

            if (animal.equals("lizard")) {
                break;
            }
            System.out.println(animal);
            index++;
        }

        TEST_LABEL:{
            index = 0;
            while (index < animals.length) {
                String animal = animals[index];
                if (animal.equals("lizard")) {
                    break TEST_LABEL;
                }

                System.out.println(animal);
                index++;
            }
        }

    }
}
