package dev.lpa;

import java.util.LinkedList;

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

        removeElements(placesToVisit);
        System.out.println(placesToVisit);

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

}
