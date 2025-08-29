import java.util.Scanner;

public class InputDataFromConsole {
    public static void main(String[] args) {
        int currentYear = 2025;
        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi , What Is your Name?");
        System.out.println("Hi " + name + ", Thanks for telling your Name.");
        String dateOfBirth = System.console().readLine("What Year were you born?");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "Your Age is " + age;
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("Hi " + name);
        System.out.println("what year were you born?");
        int dateOfBirth = sc.nextInt();
        int age = currentYear - dateOfBirth;
        sc.close();
        return "your age is : " + age;
    }
}


