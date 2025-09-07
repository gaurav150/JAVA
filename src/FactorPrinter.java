public class FactorPrinter {
    // write code here
    public static void printFactors(int num) {
        if (num < 0) {
            System.out.println("Invalid Value");
            return;
        }
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        printFactors(1080);
        System.out.println();
        printFactors(289);
        System.out.println();
        printFactors(19);
    }
}