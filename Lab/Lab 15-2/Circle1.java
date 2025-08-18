import java.util.Scanner;
public class Circle1{
	private int radius;
	private String color;
	
	
	Circle1(int radius, String color){
		this.radius = radius;
		this.color = color;
	}
	
	public double CalculateArea(){
		return 3.1416 * (radius * radius);
	}
	public String AreaColor(){
		return color;
	}
	
	public void Display(){
		System.out.println(" Area of the Circle: " + CalculateArea());
		System.out.println(" Color of the Circle: " + AreaColor());
	}
	
		public static void main(String[] args){
			Scanner Input = new Scanner(System.in);
			Scanner Input2 = new Scanner(System.in);
			System.out.println("Enter Area of the Circle: ");
			int radius = Input.nextInt();
			//Input.nextLine();
			System.out.println("Enter Color: ");
			String color = Input2.nextLine();
			
			Circle Area = new Circle(radius, color);
			Area.Display();
			
			
		
	
		}
}