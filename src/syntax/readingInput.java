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

        scanner.close();

    }

    public static void sumInput() {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int total = 0;

        while (count <= 10) {
            System.out.println("Enter number #" + count);
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int inputNumber = scanner.nextInt();
                total += inputNumber;
                count++;
            } else {
                System.out.println("Invalid Number");
                boolean isNext = scanner.hasNext();
                if (isNext) {
                    scanner.nextLine();
                }
            }
        }

        scanner.close();
        System.out.println("The total of the input number is " + total);
    }

    public static void minMaxInput() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number.");
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int intInput = scanner.nextInt();
                if (intInput > max) {
                    max = intInput;
                }
                if (intInput < min) {
                    min = intInput;
                }
            } else {
                if (min != Integer.MAX_VALUE) {
                    System.out.println("The min number is " + min + ", and the max number is " + max + ".");
                } else {
                    System.out.println("No number entered");
                }

                break;
            }
            scanner.nextLine();
        }

        scanner.close();
    }
}
