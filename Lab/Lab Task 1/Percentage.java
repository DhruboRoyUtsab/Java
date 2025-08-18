import java.util.Scanner;
public class Percentage{
	public static void main(String[] args){
	int Math, Phyx, Eng, Java;
	
	Scanner Input = new Scanner(System.in);
	System.out.println("Enter Subject1 Mark: ");
	Math = Input.nextInt();
	System.out.println("Enter Subject1 Mark: ");
	Phyx = Input.nextInt();
	System.out.println("Enter Subject1 Mark: ");
	Eng = Input.nextInt();
	System.out.println("Enter Subject1 Mark: ");
	Java = Input.nextInt();
	float Sum = Math + Phyx + Eng + Java;
	double Percentage = (Sum / 400)*100;
	System.out.println("Percentage: " + Percentage + "%");
	}
}