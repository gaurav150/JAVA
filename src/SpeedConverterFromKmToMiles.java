public class SpeedConverterFromKmToMiles {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {

            return Math.round(kilometersPerHour / 1.609);
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long result = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour +
                    " km/h = " +
                    result +
                    " mi/h");
        }

    }

    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(-6.8);
        printConversion(34.789);
    }
}
