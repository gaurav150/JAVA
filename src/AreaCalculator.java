public class AreaCalculator {
    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        System.out.println(Math.PI);
        return Math.PI * radius * radius;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }
        return x * y;
    }

    public static void main(String[] args) {
        System.out.println(area(-1.0));
        System.out.println(area(45.89d));
        System.out.println(area(45.66d, 67.85d));
        System.out.println(area(-1.2d, 56.90d));
    }
}
