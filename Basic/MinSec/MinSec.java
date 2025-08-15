package MinSec;
public class MinSec {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945)); // This is first test case
        System.out.println(getDurationString(-65, 45)); // This is 2nd test case
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
    }
    public static String getDurationString(int seconds){
    //two step approach to get hours
    if(seconds< 0){
        return "Invaild data for seconds(" + seconds + "),must be a positive value";
    }
    else{
    return getDurationString(seconds /60, seconds % 60);
    }

    }
    public static String getDurationString(int minutes, int seconds){

        if(minutes< 0){
            return "Invaild data for minutes(" + minutes + "),must be a positive value";
        }
        if(seconds< 0 || seconds >59){
        return "Invaild data for seconds(" + seconds + "),must be between 0 to 59";
        }

    int hours = minutes / 60;


    int remainingMinutes = minutes % 60;

    int remainingSeconds = seconds %60;

    
    return hours +"h " + remainingMinutes + "m " + remainingSeconds + "s";


    }
    
}
