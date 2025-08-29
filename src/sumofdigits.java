

//6) Sum of Digits: Create a program that calculates the sum of the digits of a given integer.
//For example, if the input is 123, the output should be 6.

public class sumofdigits {

    public  static int sumdigits (int num){
        int sum = 0;
        boolean is_statement =true;
        while(is_statement){
            if(num>0){
        int digit = num % 10;
        sum += digit;
        num = num / 10;}
            else {
            is_statement =false;
            }
        }
        return sum;


    }
    public static void main(String[] args) {
        int num1 = 356;
        int total = sumdigits(num1);
        System.out.println(total);


    }
}

