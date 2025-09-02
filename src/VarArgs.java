public class VarArgs {
    public static void main(String... args) {
        System.out.println("Hello world Again");
        String[] splitStrings = "Hello world Again".split(" ");
        printText(splitStrings);
        System.out.println("_".repeat(20));
        printText("Hello");
        System.out.println("_".repeat(20));
        printText("Hello", "world", "again");
        System.out.println("_".repeat(20));
        printText();
        String[] sArray = {"first", "second", "third", "fourth"};
        System.out.println(String.join(",", sArray));
    }

    private static void printText(String... textList) {
        for (String t : textList) {
            System.out.println(t);
        }
    }
}
