import java.util.Scanner;
public class BirthdayCal {


    public static void main(String[] args) {
        

    int currentYear= 2024;
    System.out.println(getInputFromScanner(currentYear));
    }

   public static String getInputFromScanner(int currentYear) {
        Scanner input = new Scanner(System.in);  // Scanner variableName = new Scanner ();

        System.out.println("Hi,What's your Name?");
        String name = input.nextLine();
        System.out.println( "Hi " + name + " Welcome!" );


        boolean validDOB = false;
        int age = 0;
        do {

        System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and  <= "  + (currentYear));
        try{
            // Scanner input = new Scanner(System.in); 
            age = checkData(currentYear ,input.nextLine());
            validDOB = age < 0 ? false : true;
        }
        catch(NumberFormatException BadUserdata){
            System.out.println("Characters are not allowed! Please Enter Integer.");

        }
        
        } while (!validDOB);
        input.close();
                return "So you are "   + age + " years old";
        
    }
    
    public static int checkData (int currentYear, String dateOfBirth){
        int dob = Integer.parseInt( dateOfBirth) ;

        int minimumYear = currentYear - 125;
        if ((dob < minimumYear) ||(dob > currentYear)) {
        return -1;
        }
    return (currentYear - dob);
    }
}
