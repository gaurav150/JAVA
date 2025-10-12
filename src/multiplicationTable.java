//7) Multiplication Table: Write a program that generates and prints the multiplication table for a number entered by the user (1 to 10).

import java.util.Scanner;

public class multiplicationTable {
    public static void mul_list(int num) {

        for (int i = 1; i <= 10; i++) {
            int mul = num * i;
            System.out.println(mul);

        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number for which you want to do multiplication");
        int num1 = s.nextInt();
        mul_list(num1);


    }
}