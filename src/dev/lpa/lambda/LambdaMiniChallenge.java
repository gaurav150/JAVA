package dev.lpa.lambda;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class LambdaMiniChallenge {

    public static void main(String[] args) {
        Consumer<String> printWordsConcise = sentence ->
            Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));


        Consumer<String> printWordsLambda = sentence -> {
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(s -> System.out.println(s));
        };

        printWordsLambda.accept("Lets split arrays into words.");
        System.out.println("_".repeat(5));
        printWordsConcise.accept("Lets split arrays into words.");
        System.out.println("+".repeat(30));

        Function<String,String> everySecondChar = source -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i = 0;i< source.length();i++){
                if(i % 2 == 0){
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();

        };

        UnaryOperator<String> everySecondCharUnary = source -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i = 0;i< source.length();i++){
                if(i % 2 == 0){
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();

        };



    }


}
