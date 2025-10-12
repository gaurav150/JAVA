package dev.lpa;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPractice {


    public static void main(String[] args) {

//        LinkedList<String> placeToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();
//        both above are same only difference of assigning datatype of LinkedList
        placesToVisit.add("Sydney");
        placesToVisit.add(0, "USA");
        System.out.println(placesToVisit);

        addMore(placesToVisit);
        System.out.println(placesToVisit);

//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);

//        gettingElements(placesToVisit);
//        printIternary(placesToVisit);

//        printIternarySecond(placesToVisit);
//        printIternaryThird(placesToVisit);
        testIterator(placesToVisit);
    }

    public static void addMore(LinkedList<String> list) {
        list.addFirst("Darwin");
        list.addLast("Hobart");
        // Queue Methods
        list.offer("Melbourne");
        list.offerFirst("BrisBane");
        list.offerLast("TooWoomba");
        // Stack Methods
        list.push("Alice Spring's");
    }

    public static void removeElements(LinkedList<String> list) {

        list.remove(4);
        list.remove("BrisBane");

        System.out.printf("Before removing %s list is printing", list);
        System.out.println();
        String s1 = list.remove(); //removes first element
        System.out.printf("%s was removed %n", s1);

        String s2 = list.removeFirst(); //removes first element
        System.out.printf("%s was removed %n", s2);

        String s3 = list.removeLast(); //removes last element
        System.out.printf("%s was removed %n", s3);

        //Dqueue/queue polls methods
        String p1 = list.poll(); // removes first element
        System.out.printf("%s was removed %n", p1);

        String p2 = list.pollFirst(); // removes first element
        System.out.printf("%s was removed %n", p2);

        String p3 = list.pollLast(); // removes last element
        System.out.printf("%s was removed %n", p3);

        list.push("Sydney");
        list.push("BrisBane");
        list.push("canberra");
        System.out.printf("Updated list is %s %n", list);

        // set Methods
        String p4 = list.pop();
        System.out.printf("%s was removed i.e first element removed %n", p4);

    }

    private static void gettingElements(LinkedList<String> list) {
        System.out.printf("Retrieved Element = %s %n", list.get(4));

        System.out.printf("Get first element = %s %n", list.getFirst());
        System.out.printf("Get last element = %s %n", list.getLast());

        System.out.printf("Get index of Darwin = %s %n", list.indexOf("Darwin"));
        System.out.printf("Melbourne is at position = %s %n", list.lastIndexOf("Melbourne"));

        // Queue Retrieval Method
        // in the below  code first element will print as  in queue follows FIFO
        System.out.printf("Element from element() = %s %n", list.element());

        // stack retrieval methods
        System.out.printf("Peek element from list =  %s %n", list.peek());
        System.out.printf("Peek element from first = %s %n", list.peekFirst());
        System.out.printf("Peek element from last = %s %n", list.peekLast());

    }

    public static void printIternary(LinkedList<String> list) {
        System.out.printf("Trip starts at %s %n", list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));

        }
        System.out.printf("Trip ends at %s %n", list.getLast());
    }

    public static void printIternarySecond(LinkedList<String> list) {
        System.out.printf("Trip starts at %s %n", list.getFirst());
        String previousTown = list.getFirst();
        for (String town : list) {
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.printf("Trip ends at %s %n", list.getLast());
    }

    public static void printIternaryThird(LinkedList<String> list) {
        System.out.printf("Trip starts at %s %n", list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);

        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.printf("Trip ends at %s %n", list.getLast());
    }

    private static void testIterator(LinkedList<String> list) {
//        var iterator = list.iterator();
        var iterator = list.listIterator();
        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
            if (iterator.next().equalsIgnoreCase("Brisbane")) {
//                iterator.remove();
                iterator.add("Lake Wivenhoe");
            }
        }
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        var iterator2 = list.listIterator(3);
//        System.out.println(iterator2.next());
        System.out.println(iterator2.previous());

    }

}
