import syntax.*;

import java.util.Scanner;


public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static array myArray = new array();

    public static void main(String[] args) {
        boolean quit = false;
        printInstructions();
        int choice = 0;
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    myArray.printArrayList();
                    break;
                case 2:
                    System.out.print("Please enter the item: ");
                    myArray.addArrayList(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Enter item number: ");
                    int itemNo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter replacement item: ");
                    String newItem = scanner.nextLine();
                    myArray.modifyArrayList(itemNo - 1, newItem);
                    break;
                case 4:
                    System.out.println("Enter the position to remove: ");
                    int position = scanner.nextInt();
                    scanner.nextLine();
                    myArray.removeArrayList(position);
                    break;
                case 5:
                    System.out.println("Enter the item to search: ");
                    String item = scanner.nextLine();
                    String result = myArray.findArrayList(item);
                    System.out.println("The item is " + result);
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

//        int[] myArray = {4, 2, 5, 3, 78, 21, 65};
//        int[] copyArray = Arrays.copyOf(myArray, myArray.length);
//        array.printArray(myArray);
//        array.sortInteger(myArray);
//        array.printArray(myArray);
//        System.out.println(Arrays.toString(copyArray));
//        array.reverse(copyArray);
//        System.out.println(Arrays.toString(copyArray));

//        OOPinheritance obj = new OOPinheritance("attr", "subattr");
//        obj.printAttribute();

//        vipOOP voidAccount = new vipOOP();
//        vipOOP twoParamsAccount = new vipOOP("name", 1000);
//        System.out.println(twoParamsAccount.getName() + twoParamsAccount.getCreditLimit() + twoParamsAccount.getEmail());
//        vipOOP account = new vipOOP("all", 10000, "email");
//        System.out.println(account.getName() + account.getCreditLimit() + account.getEmail());

//        bankOOP account = new bankOOP(100);
//        System.out.println("Balance is " + account.getBalance());
//        System.out.println("Number is " + account.getNumber());
//        System.out.println("Email is " + account.getEmail());
//        System.out.println("Name is " + account.getName());
//        System.out.println("Phone is " + account.getPhone());
//        account.depositFunds(-20);
//        account.depositFunds(20);
//        System.out.println("Balance is " + account.getBalance());
//        account.withdrawFunds(30);
//        account.withdrawFunds(90);
//        System.out.println("Balance is " + account.getBalance());


//        OOPComposition composition = new OOPComposition("name", 10);
//        OOP obj = new OOP("attribute", composition);
//        obj.setAttribute("Input Attribute");
//        System.out.println("Attribute is " + obj.getAttribute());
//        obj.loadComposition();

//        readingInput.minMaxInput();
//        readingInput.sumInput();
//        readingInput.userInput();
//        parse.intString();
//        parse.doubleString();
    }

    public static void printInstructions() {
        System.out.println("\n Press ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    ;
}
