public class DayofWeek {
    public static void main(String[] args) {
        printDayofWeek(1);
        printDayofWeek(2);
        printDayofWeek(3);
        printDayofWeek(4);
        printDayofWeek(5);
        printDayofWeek(6);
        printDayofWeek(7);
        printDayofWeek(8);
    }
    public static void printDayofWeek(int day) {

    String DayofWeek = switch (day){
        case 1 -> {yield "Sunday"; }
        case 2 -> "Monday";
        case 3 -> "Tuesday";
        case 4 -> "Wednesday";
        case 5 -> "Thursday";
        case 6 -> "Friday";
        case 7 -> "Saturday";

        default -> "Invalid Day";   
    };
        System.out.println(day + " Stands for " + DayofWeek);
    }
}
