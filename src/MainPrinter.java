public class MainPrinter {
    public static void main(String[] args) {
        // Create a Printer with initial toner level = 50, duplex printing enabled
        Printer printer = new Printer(50, true);

        // Try adding toner
        System.out.println("Initial toner level: 50");
        int newToner = printer.addToner(30);
        if (newToner != -1) {
            System.out.println("Toner after adding 30: " + newToner);
        } else {
            System.out.println("Failed to add toner (would exceed 100).");
        }

        // Try adding too much toner
        int failedToner = printer.addToner(80);
        if (failedToner != -1) {
            System.out.println("Toner after adding 80: " + failedToner);
        } else {
            System.out.println("Failed to add toner (too much).");
        }

        // Print 5 pages in duplex mode
        int pagesPrinted = printer.printPages(5);
        System.out.println("Pages actually printed (duplex): " + pagesPrinted);
        System.out.println("Total pages printed so far: " + printer.getPagesPrinted());

        // Print 7 more pages
        pagesPrinted = printer.printPages(7);
        System.out.println("Pages actually printed (duplex): " + pagesPrinted);
        System.out.println("Total pages printed so far: " + printer.getPagesPrinted());
    }
}
