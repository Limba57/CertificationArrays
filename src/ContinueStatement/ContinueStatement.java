package ContinueStatement;

public class ContinueStatement {

    public static void main(String[] args) {

        String[] animals = {"Dog", "cat", "lizard", "bird", "snake"};

        for (String animal : animals) {
            System.out.println(animal);
        }

        System.out.println();

        MY_LOOP:
        for (String animal : animals) {
            if (animal.equals("cat")) {
                continue MY_LOOP;
            }
            System.out.println(animal);
        }

        System.out.println();

        animal:
        for (String animal : animals) {
            if (animal.equals("cat")) {
                continue animal;
            }
            System.out.println(animal);
        }

        System.out.println();

        for (String animal : animals) {
            if (animal.equals("lizard") || animal.equals("cat")) {
                continue;
            }
            System.out.println(animal);
        }

        System.out.println();

        int index = 0;
        while (index < animals.length) {
            // index ++; create out of bound exeption
            String animal = animals[index];
            index++;
            if (animal.equals("Dog")) {
                continue;
            }
            System.out.println(animal);
            // index++; create a infinity loop
        }

    }
}
