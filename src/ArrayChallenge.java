import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {
    public static void main(String[] args) {
        int[] unsortedArray = getRandom(5);
        System.out.print(Arrays.toString(unsortedArray));
        System.out.println();
        int[] sortedArrays = sortIntegers(new int[]{1, 2, 3, 4});
        System.out.println("--------[" + Arrays.toString(sortedArrays));
    }

    public static int[] getRandom(int len) {
        Random random = new Random();
        int[] randomArray = new int[len];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(1000);

        }
        return randomArray;
    }

    private static int[] sortIntegers(int[] array) {
        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println("---> " + Arrays.toString(sortedArray));
                }
            }
            System.out.println("---> " + Arrays.toString(sortedArray));
        }
        return sortedArray;
    }
}
