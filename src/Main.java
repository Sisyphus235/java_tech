import syntax.OOP;
import syntax.bankOOP;
import syntax.parse;
import syntax.readingInput;


public class Main {

    public static void main(String[] args) {
        bankOOP account = new bankOOP(100);
        System.out.println("Balance is " + account.getBalance());
        System.out.println("Number is " + account.getNumber());
        System.out.println("Email is " + account.getEmail());
        System.out.println("Name is " + account.getName());
        System.out.println("Phone is " + account.getPhone());
        account.depositFunds(-20);
        account.depositFunds(20);
        System.out.println("Balance is " + account.getBalance());
        account.withdrawFunds(30);
        account.withdrawFunds(10);
        System.out.println("Balance is " + account.getBalance());


//        OOP obj = new OOP();
//        obj.setAttribute("Input Attribute");
//        System.out.println("Attribute is " + obj.getAttribute());

//        readingInput.minMaxInput();
//        readingInput.sumInput();
//        readingInput.userInput();
//        parse.intString();
//        parse.doubleString();
    }
}
