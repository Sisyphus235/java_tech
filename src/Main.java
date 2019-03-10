import syntax.*;


public class Main {

    public static void main(String[] args) {
        vipOOP voidAccount = new vipOOP();
        vipOOP twoParamsAccount = new vipOOP("name", 1000);
        System.out.println(twoParamsAccount.getName() + twoParamsAccount.getCreditLimit() + twoParamsAccount.getEmail());
        vipOOP account = new vipOOP("all", 10000, "email");
        System.out.println(account.getName() + account.getCreditLimit() + account.getEmail());

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
