package com.cdac.assignment1;

import java.util.*;

public class maxOutofthreenumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER THE FIRST NUMBER: ");
        int no1 = scanner.nextInt();
        System.out.println("ENTER THE SECOND NUMBER: ");
        int no2 = scanner.nextInt();
        System.out.println("ENTER THE THIRD NUMBER: ");
        int no3 = scanner.nextInt();

        scanner.close();



        maxmethod(no1, no2, no3);

    }

    public static void maxmethod(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {

            System.out.println("maximum out of three numbers given is: " + num1);

        } else if (num2 >= num3 && num2 >= num1) {
            System.out.println("maximum out of three numbers given is: " + num2);
        } else {
            System.out.println("maximum out of three numbers given is: " + num3);
        }


    }

}
