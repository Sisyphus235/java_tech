package syntax;

import java.util.Scanner;

public class readingInput {
    public static void userInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your birth of year: ");
        int birthYear = scanner.nextInt();
        int age = 2019 - birthYear;
        // handles next line character ("\n", or "\r\n")
        // if not, it will stop reading input from the console
        scanner.nextLine();

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name + ", and you are " + age + " years old.");
    }
}
