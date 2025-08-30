public class Customer {
    private String name;
    private double creditLimit;
    private String emailId;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailId() {
        return emailId;
    }
    public Customer(){
        System.out.println("Default constructor called successfully");
    }
    public Customer(String name, double creditLimit, String emailId) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailId = emailId;
        System.out.println("Parameterized constructor called successfully");
    }

    public Customer(String name, String emailId) {
        this(name,10000,emailId);
        System.out.println("this is calling another constructor" );

    }
}
