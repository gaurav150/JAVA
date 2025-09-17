package dev.lpa.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


/*
*| Category         | Purpose                                                              | Example Interface(s)                 | Input      | Output  |
| ---------------- | -------------------------------------------------------------------- | ------------------------------------ | ---------- | ------- |
| **1. Supplier**  | Supplies a value **without taking any input**                        | `Supplier<T>`                        | none       | T       |
| **2. Consumer**  | Consumes a value (performs an action) **without returning anything** | `Consumer<T>`, `BiConsumer<T,U>`     | T (or T,U) | void    |
| **3. Predicate** | Tests a condition and returns a **boolean result**                   | `Predicate<T>`, `BiPredicate<T,U>`   | T (or T,U) | boolean |
| **4. Function**  | Transforms input to output (takes input and returns a result)        | `Function<T,R>`, `BiFunction<T,U,R>` | T (or T,U) | R       |

* */

public class LambdaFunctionalInterfacesImplementations {

    public static void main(String[] args) {
        // 1️⃣ Supplier: No input, returns a value
        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());

        // 2️⃣ Consumer: Takes input, performs action, returns nothing
        Consumer<String> consumer = (name) -> System.out.println("Hello " + name);
        consumer.accept("Rohit");

        // 3️⃣ Predicate: Takes input, returns boolean
        Predicate<Integer> isEven = (num) -> num % 2 == 0;
        System.out.println(isEven.test(37));
        System.out.println(isEven.test(38));

        // 4️⃣ Function: Takes input, returns transformed value
        Function<String, Integer> lengthFunction = str -> str.length();
        System.out.println(lengthFunction.apply("Java"));
    }
}
