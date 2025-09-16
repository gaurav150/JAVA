package dev.lpa.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class LambdaIntro {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(Arrays.asList(
                new LambdaIntro.Person("Lucy", "karl"),
                new Person("Sally", "Brown"),
                new Person("Linus", "Van pelt"),
                new Person("pepperMint", "Patty"),
                new Person("Charlie", "Brown")
        ));


        // Comparator using Anonymous class
        var comparatorLastName = new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName().compareTo(o2.lastName());
            }
        };

        people.sort(comparatorLastName);
        System.out.println("With full code " + people);

        people.sort((o1, o2) -> o1.lastName().compareTo(o2.lastName()));
        System.out.println("With lambda " + people);


        interface EnhancedComparator<T> extends Comparator<T>{
            int secondLevel(T o1,T o2);
        }

        var comparatorMixed = new EnhancedComparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.lastName().compareTo(o2.lastName());
                return (result == 0 ? secondLevel(o1,o2):result);
            }

            @Override
            public int secondLevel(Person o1, Person o2) {
                return o1.firstName().compareTo(o2.firstName());
            }
        };

        people.sort(comparatorMixed);
        System.out.println("After Mixed Comparator implementation "+people);

        int result = calculator((a,b) ->
                a + b,5,2);

        var result2  = calculator((a,b)
                -> a /b,10.0,3.4);

        var result3  = calculator((a,b) ->
                        a.toUpperCase()+" "+b.toUpperCase(),
                "Raplph","Kramden");

    }

    record Person(String firstName, String lastName) {
        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }

    public static <T> T calculator(BinaryOperator<T> function, T value1, T value2) {
        T result = function.apply(value1, value2);
        System.out.println("Result of the of operation " + result);
        return result;
    }
}
