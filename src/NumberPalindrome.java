public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;
        while (original != 0) {
            reverse = reverse * 10 + original % 10;
            original /= 10;

        }
        return reverse == number;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-122221));
    }

}
