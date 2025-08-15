package MinSec;
public class MinSec1{
    public static void main(String[] args) {
        System.out.println(getDurationString(3945)); // This is first test case
        System.out.println(getDurationString(65, 45)); // This is 2nd test case
    }
    public static String getDurationString(int seconds){
    //two step approach to get hours
    int minutes = seconds / 60;
    // int hours = minutes / 60;
    //System.out.println("Hours: " + hours);

    // int remainingMinutes = minutes % 60;
    //System.out.println("Minutes" + minutes);
    //System.out.println("Remaining Minutes: " + remainingMinutes);

    // int remainingSeconds = seconds %60;
    //System.out.println("Remaining Seconds: " + remainingSeconds);
    
    // return hours +"h" + remainingMinutes + "m" + remainingSeconds + "s";
    return getDurationString(minutes, seconds);

    }
    public static String getDurationString(int minutes, int seconds){

    int hours = minutes / 60;


    int remainingMinutes = minutes % 60;

    int remainingSeconds = seconds %60;

    
    return hours +"h" + remainingMinutes + "m" + remainingSeconds + "s";


    }
    
}

