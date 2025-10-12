package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

class PlainOld {
    private static int last_id = 1;

    private int id;

    public PlainOld() {
        id = PlainOld.last_id++;
        System.out.println("Creating a PlainOld Object: id = " + id);
    }
}

public class MethodReferencesInLambda {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Anna", "Bob", "Chuck", "Dave"));
        list.forEach(System.out::println); // is called Method Reference.
        /*
         * above code is equivalent to
         * list.forEach(s -> System.out.println(s))
         */

        calculator(Integer::sum, 10, 25);
        calculator(Float::sum, 2.75f, 3.67f);
//        calculator((a,b)-> a+b,3.13f,4.76f); instead of that we can use Method reference
        calculator(Double::sum, 2.5, 5.7);

        Supplier<PlainOld> reference1 = PlainOld::new;
        PlainOld newPoJo = reference1.get();

        System.out.println(reference1.get());
        System.out.println("Getting Array");
        PlainOld[] pojo1 = seedArray(PlainOld::new, 10);

        calculator((a, b) -> a + b, "Hello", " World");
        calculator((a, b) -> a.concat(b), "Hello", " World");
        calculator(String::concat, "Hello", " World");

        BinaryOperator<String> b1 = String::concat;
        BiFunction<String, String, String> b2 = String::concat;
        UnaryOperator<String> u1 = String::toUpperCase;
        String result =  "Hello".transform(u1);
        System.out.println("Transformed to Uppercase  of String "+result);
        result  =  result.transform(String::toLowerCase);
        System.out.println("Result = "+result);
        System.out.println("Binary Operator applied -> "+b1.apply("Hello"," World"));
        System.out.println("BiFunction Applied -> "+b2.apply("Hello"," Java"));
        System.out.println("Unary Operator Applied  -> "+u1.apply("pRoGrAmMiNg"));

        Function<String,Boolean> f0 = String::isEmpty;
        boolean resultBoolean =  result.transform(f0);
        System.out.println("Result of the resultBoolean is  "+resultBoolean);




    }

    private static <T> void calculator(BinaryOperator<T> function, T value1, T value2) {
        T result = function.apply(value1, value2);
        System.out.println("Result of Operation: " + result);
    }

    private static PlainOld[] seedArray(Supplier<PlainOld> reference, int count) {
        PlainOld[] arrays = new PlainOld[count];
        Arrays.setAll(arrays, i -> reference.get());
        return arrays;
    }

}
