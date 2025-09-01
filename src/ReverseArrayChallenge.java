import java.util.Arrays;

public class ReverseArrayChallenge {

    public static void main(String[] args) {

    }
    private static void reverseArray(int[] array){
        int maxIndex = array.length - 1;
        int halfLength = array.length /2;


        for(int i = 0;i<halfLength;i++){
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
            System.out.println("---->"+ Arrays.toString(array));
        }
    }
}
