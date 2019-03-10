import syntax.OOP;
import syntax.parse;
import syntax.readingInput;


public class Main {

    public static void main(String[] args) {
        OOP obj = new OOP();
        obj.setAttribute("Input Attribute");
        System.out.println("Attribute is " + obj.getAttribute());

//        readingInput.minMaxInput();
//        readingInput.sumInput();
//        readingInput.userInput();
//        parse.intString();
//        parse.doubleString();
    }
}
