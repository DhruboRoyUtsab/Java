import java.util.Scanner;
public class Name{
	public static void main(String[] args){
	
	System.out.println("Enter your Name: ");
	Scanner Input = new Scanner(System.in);
	String n = Input.nextLine();
	
	System.out.println("Hello " + n + "! Welcome here.");
	}
}