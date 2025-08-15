import java.util.Scanner;

public class Dowhile {
    public static void main (String[] args){
        
        Scanner Input = new Scanner(System.in);
        
        int i = 1;
        double Sum = 0;
        do{
        System.out.println("Enter Number #" + i + ": ");
            String Num = Input.nextLine();
        
            try{
        double Number = Double.parseDouble(Num);
        i++;
        Sum += Number;
        
        }
        catch(NumberFormatException BadUserdata){
            System.out.println("Invalid Number.");

        }
        }while(i<=5);
        Input.close();
        System.out.println("The Sum of 5 Numbers is: " + Sum);

    }
}
