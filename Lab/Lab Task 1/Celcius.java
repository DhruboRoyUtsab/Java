import java.util.Scanner;
public class Celcius{
	public static void main(String[] args){
	float F;
	
	System.out.println("Enter Farenhit: ");
	Scanner Input = new Scanner(System.in);
	F = Input.nextFloat();
	float C =(F - 32) *5/9;
	System.out.println("Celcius is : " + C + " Degree");
	}
}