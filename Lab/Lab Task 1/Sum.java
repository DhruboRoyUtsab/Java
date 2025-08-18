import java.util.Scanner;
public class Sum{
	public static void main(String[] args){
	float a, b, c;
	
	System.out.println("Enter 3 Numbers: ");
	Scanner Input = new Scanner(System.in);
	a = Input.nextFloat();
	b = Input.nextFloat();
	c = Input.nextFloat();
	float Sum = a + b + c;
	
	System.out.println("Sum: " + (int)Sum);
	}
}