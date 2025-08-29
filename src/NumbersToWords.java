public class NumbersToWords {

    public static String numberToLetter(int number) {
        switch (number) {
            case 0: return "Zero";
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            default: return "Invalid Input";
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reversedNumber = reverse(number);
        int leadingZeros = getDigitCount(number) - getDigitCount(reversedNumber);

        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        while (reversedNumber != 0) {
            int lastDigit = reversedNumber % 10;
            System.out.print(numberToLetter(lastDigit) + " ");
            reversedNumber /= 10;
        }

        for (int i = 0; i < leadingZeros; i++) {
            System.out.print("Zero ");
        }

        System.out.println(); // final newline
    }

    public static void main(String[] args) {
        NumbersToWords.numberToWords(123);   // One Two Three
        NumbersToWords.numberToWords(1010);  // One Zero One Zero
        NumbersToWords.numberToWords(1000);  // One Zero Zero Zero
        NumbersToWords.numberToWords(0);     // Zero
        NumbersToWords.numberToWords(-12);
    }
}
