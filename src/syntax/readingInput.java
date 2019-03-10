package syntax;

import java.util.Scanner;

public class readingInput {
    public static void userInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your birth of year: ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int birthYear = scanner.nextInt();
            int age = 2019 - birthYear;

            if (age >= 0 && age <= 100) {
                // handles next line character ("\n", or "\r\n")
                // if not, it will stop reading input from the console
                scanner.nextLine();

                System.out.println("Please enter your name: ");
                String name = scanner.nextLine();

                System.out.println("Hello " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid input of birth year");
            }

        } else {
            System.out.println("Unable to parse birth year");
        }

    }
}
