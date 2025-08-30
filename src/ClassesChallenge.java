public class ClassesChallenge {
    private long accountNumber = 7987889477869937584l;
    private double accountBalance = 10000.00d;
    private String customerName = "Mohan";
    private String emailId = "mohan@gmail.com";
    private long phoneNumber = 7865943723l;
    public ClassesChallenge(){

        System.out.println("Constructor called successfully");
    }

    public ClassesChallenge(long accountNumber,double accountBalance,String customerName,String emailId,long phoneNumber){
        System.out.println("Constructor With parameters called successfully");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
        this.customerName = customerName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void amountDeposit(int amount) {
        if (amount < 0) {
            System.out.println("Enter valid amount to deposit in your account");
        }
        this.accountBalance += amount;
        System.out.println("Amount deposited Successfully");

    }

    public void amountWithdraw(int amount) {
        if (amount < 0 || amount > this.accountBalance) {
            System.out.println("Enter valid amount to withdraw from your account");
        } else {
            this.accountBalance -= amount;
            System.out.println("Amount Withdrawn Successfully");
        }
    }


}
