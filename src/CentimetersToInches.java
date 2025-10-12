public class CentimetersToInches {
    public static double convertToCentimeters(int height) {
        // here we are going height inches only
        return (height * 2.54d);
    }

    public static double convertToCentimeters(int heightFoot, int heightInches) {

        return convertToCentimeters(heightInches + heightFoot * 12);
    }

    public static void main(String[] args) {
        double s = convertToCentimeters(42);
        System.out.println(s);
        double w = convertToCentimeters(6, 1);
        System.out.println(w + " in foot and inches as input we got");
    }
}
