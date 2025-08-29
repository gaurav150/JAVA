public class SecondsAndMinutesChallenge54 {
    public static String getDurationString(int seconds){
        int minutes = seconds / 60;
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;
//        String time = hours+"h "+remainingMinutes+"m "+remainingSeconds+"s";
        return hours+"h "+remainingMinutes+"m "+remainingSeconds+"s";
    }
    public static String getDurationString(int minutes,int seconds){
        int totalTimeSeconds = minutes * 60 + seconds;

        return getDurationString(totalTimeSeconds);
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(3904));
        System.out.println(getDurationString(45,3904));
    }
}
