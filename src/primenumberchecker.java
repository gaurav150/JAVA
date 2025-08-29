//9) Prime Number Checker: Write a program that takes an integer input from the user and checks if the number is a prime number.
//A prime number is a number greater than 1 that has no positive divisors other than 1 and itself. Print whether the number is prime or not.
//
import java.util.Scanner;


public class primenumberchecker {


    public static String primecheck(int num) {

        if (num <= 1) {
            return "Given number is not a prime number: ";
        } else {
            double a = Math.sqrt(num);
            for (int b = 2; b <= a; b++) {
                if (num % b == 0) {
                    return ("Given number is not a prime number: " + num);
                }

            }
            return ("Given number is  a prime number: " + num);
        }

    }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number which you want to check for prime number: ");
        int num1 = s.nextInt();
        String result = primecheck(num1);
        System.out.println(result);
    }

}
