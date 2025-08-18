import java.util.Scanner;
public class Average{
	public static void main(String[] args){
	int a, b, c;
	
	System.out.println("Enter 3 Numbers: ");
	Scanner Input = new Scanner(System.in);
	a = Input.nextInt();
	b = Input.nextInt();
	c = Input.nextInt();
	float Sum = a + b + c;
	float Avg = Sum / 3;
	System.out.println("Average is : " + Avg);
	}
}