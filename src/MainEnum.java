import java.util.Random;

public class MainEnum {
    public static void main(String[] args) {
        DayOfTheWeek day = DayOfTheWeek.FRI;

        System.out.printf("Name is  %s, Ordinal value =  %d%n",
                day.name(), day.ordinal());
        System.out.println("I Am outside the for loop");

        for (int i = 0; i < 10; i++) {
            day = getRandomDay();
//            System.out.printf("Name is  %s, Ordinal value =  %d%n",
//                    day.name(), day.ordinal());
//
//            if (day == DayOfTheWeek.FRI){
//                System.out.println("Found a Friday!!!!.");
//            }

            switchDayOfTheWeek(day);
        }

        for (Topping topping : Topping.values()) {
            System.out.println(topping.name() + " : " + topping.getPrice());
        }
    }

    public static void switchDayOfTheWeek(DayOfTheWeek weekDay) {
        int weekDayInteger = weekDay.ordinal() + 1;
        switch (weekDay) {
            case WED -> System.out.println("Wednesday is the " + weekDayInteger);
            case MON -> System.out.println("Monday is the " + weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0) +
                    weekDay.name().substring(1).toLowerCase() +
                    "day is Day " + weekDayInteger);
        }
    }

    public static DayOfTheWeek getRandomDay() {
        int randomInteger = new Random().nextInt(7); // 0 to 6
        var allDays = DayOfTheWeek.values();
        return allDays[randomInteger];
    }
}
