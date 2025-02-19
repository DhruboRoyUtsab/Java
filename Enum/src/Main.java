import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DayOfTheWeek weekDay = DayOfTheWeek.THURS;
        System.out.println(weekDay);
        for (int i = 0; i < 10; i++) {
            weekDay = getRandomDays();

//            System.out.printf("Name is %s, Original value = %d%n",
//                    weekDay.name(), weekDay.ordinal());
//
//            if (weekDay == DayOfTheWeek.FRI) {
//                System.out.println("Found Friday!!");
//            }
            switchDaysOfWeek(weekDay);
        }
    }

    public static void switchDaysOfWeek(DayOfTheWeek weekDay) {
        int weekDayInteger = weekDay.ordinal() + 1;
        switch (weekDay) {
            case WED -> System.out.println("Wednesday is Day" + weekDayInteger);
            case SAT -> System.out.println("Saturday is Day" + weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0) +
                    weekDay.name().substring(1).toLowerCase() +
                    "day is Day " + weekDayInteger);
        }
    }

    public static DayOfTheWeek getRandomDays() {
        int randomIntegers = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();
        return allDays[randomIntegers];
    }
}