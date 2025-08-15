import java.util.Scanner;
public class StringType{
	public static void main(String[] args){
	String Name;
	
	Scanner Input = new Scanner(System.in);
	System.out.println("Enter Subject1 Mark: ");
	Name = Input.nextLine();
	System.out.println(Name.toUpperCase());
	System.out.println(Name.toLowerCase());
	System.out.println(Name.length());
	}
}