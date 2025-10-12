import java.util.Scanner;

public class simpleBankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float balance = 30000.0f;

        while (true) {

            System.out.println("enter the choice");
            int ch = scanner.nextInt();

            switch (ch) {
                case 1:
                    float deposit = scanner.nextFloat();
                    balance = bankingdepositsystm(deposit, balance);
                    break;

                case 2:
                    float withdraw = scanner.nextFloat();
                    if (withdraw > balance) {
                        System.out.println("invalid withdrawl. please input valid withdrawl amount.");
                        break;
                    } else {
                        balance = bankingwithdrawsystm(withdraw, balance);

                    }
                    break;

                case 3:
                    System.out.println("Your balance is" + balance);
                    break;

                case 4:
                    System.out.println("End of process.");
                    System.exit(0);


                default:
                    System.out.println("Invalid choice....");
                    System.out.println("Thank you banking with us.");
            }

        }


    }

    public static float bankingdepositsystm(float deposit, float balance) {


        balance += deposit;
        System.out.println("Your current balance is: " + balance);
        return balance;

    }

    public static float bankingwithdrawsystm(float withdraw_amount, float balance) {


        balance -= withdraw_amount;
        System.out.println("Your current balance is: " + balance);
        return balance;

    }


}
//Simple Banking System: Implement a simple banking system that allows a user to deposit, withdraw, and check their balance.
//Use conditional statements to check for sufficient funds during withdrawal.