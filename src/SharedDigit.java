public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        boolean firstValid = num1 > 9 && num1 < 100;
        boolean secondValid = num2 > 9 && num2 < 100;

        if (!firstValid || !secondValid) {
            return false;
        }

        int num1Tens = num1 / 10;
        int num1Ones = num1 % 10;
        int num2Tens = num2 / 10;
        int num2Ones = num2 % 10;

        return (num1Tens == num2Tens ||
                num1Tens == num2Ones ||
                num1Ones == num2Tens ||
                num1Ones == num2Ones);
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(23,94));
    }
}
