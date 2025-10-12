public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        int lastDigit = number % 10;
        int original = number;
        int secondDigit = number % 10;

        if (number < 0) {
            return -1;

        }
        while (original > 0) {
            secondDigit = original % 10;
            original /= 10;
        }
        return lastDigit + secondDigit;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(2341));
    }
}
