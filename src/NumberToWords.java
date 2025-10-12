public class NumberToWords {

    public static int reverse(int number) {

        int reverse = 0;
        while (number != 0) {
            // multiply by 10 then and add last digit (number % 10)
            reverse = reverse * 10 + number % 10;
            number /= 10; // discard last digit
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
        // start from 1 and multiply by 10 each step so i goes 1, 10, 100, 1000
        // count how many times it was multiplied, and that's the digit count
        for (int i = 1; i <= number; i *= 10) {
            count++;
        }
        return count;
    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        // get reversed number
        int reverse = reverse(number);

        // subtract numberDigits and reverseDigits to get leading zeroes
        int leadingZeroes = getDigitCount(number) - getDigitCount(reverse);

        if (number == 0) {
            System.out.print("Zero ");
            return;
        }

        // use loop to print words
        while (reverse != 0) {
            int lastDigit = reverse % 10;
            switch (lastDigit) {
                case 0 -> System.out.print("Zero ");
                case 1 -> System.out.print("One ");
                case 2 -> System.out.print("Two  ");
                case 3 -> System.out.print("Three ");
                case 4 -> System.out.print("Four ");
                case 5 -> System.out.print("Five ");
                case 6 -> System.out.print("Six ");
                case 7 -> System.out.print("Seven ");
                case 8 -> System.out.print("Eight ");
                case 9 -> System.out.print("Nine ");
            }
            reverse /= 10;
        }

        // print zeroes if there are any leading zeroes in reversed number
        for (int i = 0; i < leadingZeroes; i++) {
            System.out.println("Zero");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        NumberToWords.numberToWords(123);   // One Two Three
        NumberToWords.numberToWords(1010);  // One Zero One Zero
        NumberToWords.numberToWords(1000);  // One Zero Zero Zero
        NumberToWords.numberToWords(0);     // Zero
        NumberToWords.numberToWords(-12);   // Invalid Value

    }
}
