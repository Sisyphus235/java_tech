package syntax;

import java.util.ArrayList;

public class array {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static void sortInteger(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void reverse(int[] array) {
        for (int i = 0; i < (int) (array.length / 2); i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    private ArrayList<String> myArray = new ArrayList<String>();

    public void addArrayList(String s) {
        myArray.add(s);
    }

    public void printArrayList() {
        System.out.println("The size of the array is " + myArray.size());
        for (int i = 0; i < myArray.size(); i++) {
            System.out.println("The element at " + (i + 1) + " is " + myArray.get(i));
        }
    }

    public void modifyArrayList(int position, String newItem) {
        myArray.set(position, newItem);
        System.out.println("New item " + (position + 1) + "has been updated.");
    }

    public void removeArrayList(int position) {
        String theItem = myArray.get(position);
        myArray.remove(position);
        System.out.println();
        System.out.println("The element " + theItem + "has been removed.");
    }

    public String findArrayList(String searchItem) {
//        boolean exists = myArray.contains(searchItem);
        int position = myArray.indexOf(searchItem);
        if (position >= 0) {
            return myArray.get(position);
        }
        return null;
    }
}
