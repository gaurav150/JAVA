package dev.lpa.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressions {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of(
                "alpha", "bravo", "charlie", "delta"
        ));

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("=".repeat(30));

        System.out.println("_".repeat(30));
        list.forEach((myString) -> System.out.println(myString));

        System.out.println("_".repeat(6));
        String prefix = "nato";
        list.forEach((var myString) -> {
            char first = myString.charAt(0);
            System.out.println(prefix + " " + myString + " means " + first);
        });
    }
}
