package syntax;

public class bankOOP {
    private String number;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public bankOOP() {
        this("default number", 0.0, "default name", "default email", "default phone");
    }

    public bankOOP(double balance) {
        this.balance = balance;
    }

    public bankOOP(String number, double balance, String name, String email, String phone) {
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNumber() {
        return this.number;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void depositFunds(double funds) {
        if (funds > 0) {
            this.balance += funds;
        } else {
            System.out.println("invalid funds");
        }
    }

    public void withdrawFunds(double funds) {
        if (funds > 0 && this.balance >= funds) {
            this.balance -= funds;
        } else {
            System.out.println("invalid funds");
        }
    }
}
