package com.cdac.assignment1;

public class evenodd {
    public static void main(String[] args) {

        find_even_odd(59);

    }
    public static void find_even_odd(int num) {
        if (num % 2 == 0) {
            System.out.println("given number " + num + " is Even");
        } else {
            System.out.println("given number " + num + " is Odd");
        }
    }

}
