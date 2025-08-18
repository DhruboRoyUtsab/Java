import java.util.Scanner;
public class Rectangle{
	private int length;
	private int width;
	
	
	Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	
	public double CalculateArea(){
		return length * width;
	}

	public void Display(){
		System.out.println("Area of the Retangle: " + CalculateArea());
	}
	
		public static void main(String[] args){
			Scanner Input = new Scanner(System.in);
			System.out.println("Enter Length of the Rectangle: ");
			int length = Input.nextInt();
			System.out.println("Enter Width of the Rectangle: ");
			int width = Input.nextInt();
			
			
			Rectangle Area = new Rectangle(length,width);
			
			Area.Display();
			
			
		
	
		}
}

	