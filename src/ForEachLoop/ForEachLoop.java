package ForEachLoop;

public class ForEachLoop {

    public static void main(String[] args) {

        String[] names = {"seb", "kathia", "arthur", "sophie"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("name = " + names[i]);
        }

        for (String name : names) {
            System.out.println("name = "+name);
        }

        for (String name : names) {
            name = name + " " + name;
        }

        for (String name : names) {
            System.out.println("name = " + name);
        }

        StringBuilder[] builders = {
                new StringBuilder("For"),
                new StringBuilder("Loop")
        };

        for (StringBuilder builder : builders) {
            System.out.println(builder);
        }

        for (StringBuilder builder : builders) {
            builder.append("123");
        }

        for (StringBuilder builder : builders) {
            System.out.println(builder);
        }

        String pets = "Parrot";

        for (char c : pets.toCharArray()) {
            System.out.println(c);
        }

    }
}
