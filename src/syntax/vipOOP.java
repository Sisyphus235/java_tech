package syntax;

public class vipOOP {
    private String name;
    private double creditLimit;
    private String email;

    public vipOOP() {
        this("deault name", 100, "default email");
        System.out.println("void constructor called");
    }

    public vipOOP(String name, double creditLimit) {
        this(name, creditLimit, "default email");
    }

    public vipOOP(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
