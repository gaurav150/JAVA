package com.cdac.assignment1;

import java.util.Scanner;

public class leap
{
    public static String check_leap(int year){
        if((year % 4 == 0 && year % 100!=0) || (year % 400 == 0))
        {
           return "Is a leap year";
        }
        else
        {
            return "Not a leap year";
        }

    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the year for which you want to check : ");
        int num1 = s.nextInt();
        String result = check_leap(num1);
        System.out.println(result);



    }
}
