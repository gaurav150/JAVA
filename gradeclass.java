package com.cdac.assignment1;

public class gradeclass {

    public static void main(String[] args) {
        gradecal(8);

    }
    public static void gradecal(int score) {
        if (score >= 90) {
            System.out.println('A');
        } else if (score >= 80) {
            System.out.println('B');
        } else if (score >= 70) {
            System.out.println('C');
        } else if (score >= 60) {
            System.out.println('D');
        } else {
            System.out.println('F');

        }
    }


}
