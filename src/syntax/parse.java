package syntax;

public class parse {
    public static void intString() {
        String numberAsString = "2019";
        int number = Integer.parseInt(numberAsString);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString: " + numberAsString);
        System.out.println("number: " + number);
    }
    public static void doubleString(){
        String numberAsString = "2019.3";
        double number = Double.parseDouble(numberAsString);

        numberAsString += 0.1;
        number += 0.1;

        System.out.println("numberAsString: " + numberAsString);
        System.out.println("number: " + number);
    }


}
