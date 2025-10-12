package dev.lpa.lambda;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

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

        var coords = Arrays.asList(
                new double[]{47.216,-87.9876},
                new double[]{34.67,-67.21}
        );

        coords.forEach(s -> System.out.println(Arrays.toString(s)));

        BiConsumer<Double,Double> p1 = (lat,lng) ->
                System.out.printf("[lat:%.3f lon: %.3f]%n", lat,lng);


        var firstPoint = coords.get(0);
        processPoint(firstPoint[0],firstPoint[1],p1);

        System.out.println("_".repeat(40));
        coords.forEach(s -> processPoint(s[0],s[1],p1));

        List<String> list = new ArrayList<>(List.of("Alpha","Bravo","Charlie","delta"));
        list.removeIf(s -> s.equalsIgnoreCase("bravo"));

        list.addAll(List.of("easy","echo","ease"));
        list.forEach(s -> System.out.println(s));

        System.out.println("_".repeat(30));

        list.removeIf(s -> s.startsWith("ea"));
        list.forEach(s -> System.out.println(s));

        list.replaceAll(s -> s.charAt(0)+" - "+s.toUpperCase());
        System.out.println("_".repeat(30));
        list.forEach(s -> System.out.println(s));

        String[] emptyStrings = new String[10];
        System.out.println(Arrays.toString(emptyStrings));

        Arrays.fill(emptyStrings,"");
        System.out.println(Arrays.toString(emptyStrings));

        Arrays.setAll(emptyStrings,(i) -> ""+ (i+1) +". ");
        System.out.println(Arrays.toString(emptyStrings));

        Arrays.setAll(emptyStrings,(i) -> ""+ (i+1) +". "
        + switch (i){
            case 0 -> "One";
            case 1 -> "Two";
            case 2 -> "Three";
            case 3 -> "Four";
            case 4 -> "Five";
            default -> "";
        });
        System.out.println(Arrays.toString(emptyStrings));

        String[] names = {"Ann","Bob","Carol","David","Ed","Fred"};
        String[] randomList = randomlySelectedValues(15,names,
                ()-> new Random().nextInt(0, names.length));
        System.out.println(Arrays.toString(randomList));

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

    public static <T> void processPoint(T t1, T t2, BiConsumer<T,T> consumer){
        consumer.accept(t1,t2);

    }

    public static String[] randomlySelectedValues(int count, String[] values,
                                                  Supplier<Integer> s){
        String[] selectedValues = new String[count];
        for(int i = 0; i < count ; i++){
            selectedValues[i] = values[s.get()];

        }
        return selectedValues;
    }
}
