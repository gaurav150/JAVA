import java.util.Arrays;
import java.util.Scanner;

public class ElementMinimumChallenge {
    private static int[] readIntegers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter alist of integers , comma separated");
        String input = sc.nextLine();
        String[] splits = input.split(",");
        int[] values = new int[splits.length];
        for(int i =0;i<splits.length;i++){
            values[i] = Integer.parseInt(splits[i].trim());

        }
        sc.close();
        return values;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for(int el: array){
            if(el < min){
                min = el;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[]  returnedArray = readIntegers();
        System.out.println("Entered array is "+Arrays.toString(returnedArray));

//        int returnedMin = findMin(returnedArray);
//        System.out.println("Min value is "+returnedMin);
        int[] reversedCopy = reverseCopy(returnedArray);
        System.out.println("After reversing : "+Arrays.toString(reversedCopy));
    }
    private static int[] reverseCopy(int[] array){
        int[] reversedArray = new int[array.length];
        int maxIndex = array.length -1;
        for (int el:array){
            reversedArray[maxIndex--] =el;
        }
        return reversedArray;
    }
}
