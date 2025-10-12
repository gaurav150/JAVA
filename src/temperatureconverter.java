//3) Temperature Converter: Develop a program that converts temperature from Celsius to Fahrenheit. The formula is F = C * 9/5 + 32.
//Take user input for Celsius and display the result in Fahrenheit.
public class temperatureconverter {
    public static void main(String[] args) {
        tempconversion(32.6f);

    }

    public static void tempconversion(float tmp) {
        float F;
        F = tmp * 9 / 5 + 32;
        System.out.println("temperature in fahreinheit is: " + F);
    }
}
