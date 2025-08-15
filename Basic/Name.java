import java.util.Scanner;
public class Name{
	public static void main(String[] args){
	System.out.println("Enter your Name");
	
	Scanner Input = new Scanner(System.in);
	String name = Input.nextLine();
	System.out.println("Your name is: " + name);
	}
}