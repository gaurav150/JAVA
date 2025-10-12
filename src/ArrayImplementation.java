import java.util.Arrays;

public class ArrayImplementation {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;
        double[] myDoubleArray = new double[3];
        myDoubleArray[2] = 3.5d;
        System.out.println(myDoubleArray[2]);

        // array  intializers
        int[] mySecondArray = new int[]{1, 3, 4, 5, 6, 7, 8};
        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("First element " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("Array length is " + arrayLength);
        int[] newArray;
        newArray = new int[5];
//        int[] newArray = new int[] {1,3,5,7,8,9,0};
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
        System.out.println("Enhanced For Loop Implemented");
        for (int element : newArray) {
            System.out.print(element + " ");

        }
        System.out.println();

        System.out.println(Arrays.toString(newArray));

    }
}
