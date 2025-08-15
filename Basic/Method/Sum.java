package Method;
public class Sum {
    public static void main(String[] args) {
        double x = 20.00;
        double y = 80.00;
        double Sum = x + y;
        System.out.println("Sum: " + Sum);
        double Multiply = Sum  * 100;
        System.out.println("Multiply: " + Multiply);
        double Remainder = Multiply % 40.00d;
        System.out.println("Remainder: " + Remainder);

       boolean NoRemainder = (Remainder == 0) ? true : false;
           System.out.println(NoRemainder);

       if (!NoRemainder )
       {
       System.out.println("Got Some Remainder");
       }
       else{
        System.out.println("No Remainder");
       }
    }
}

