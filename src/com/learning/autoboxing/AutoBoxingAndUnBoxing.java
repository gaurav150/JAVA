package com.learning.autoboxing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AutoBoxingAndUnBoxing {

    public static void main(String[] args) {
        Integer boxedInt = Integer.valueOf(15);  //preferred but unnecessary
//        Integer depricatedBoxing  = new Integer(16);  //depricated after JDK 9
        int unBoxedInt = boxedInt.intValue();   // unNecessary

        // Automatic autoBoxing
        Integer autoBoxed = 1;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
//        System.out.println(autoUnboxed.getClass().getName());

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();
        System.out.println("result Boxed "+resultBoxed);
        System.out.println("result unBoxed "+resultUnboxed);

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 40;
        System.out.println("This is example of wrapper Array is "
                +Arrays.toString(wrapperArray));

        System.out.println("Warpping class name is "
                +wrapperArray[0].getClass().getName());

        Character[] characterArray = {'a','b','c','d'};
        System.out.println("Character Array is "+ Arrays.toString(characterArray));

        var ourList = getList(1,2,3,4,5);
        System.out.println("output of ourList is "+ourList);

        var newList = List.of(1,2,3,4,5,6);
        System.out.println("output of new List is "+newList);




    }

    private static ArrayList<Integer> getList(Integer ...varArgs){
        // in the parameter we may use int ...varArgs
        ArrayList<Integer> aList = new ArrayList<>();
        for (int i : varArgs){
            aList.add(i);
        }

        return aList;
    }


    private static Double getDoubleObject(){
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive(){
        return 10.0;
    }

    private static int returnAnInt(Integer i){
        return i;
    }

    private static Integer returnAnInteger(int i){
        return i;
    }
}
