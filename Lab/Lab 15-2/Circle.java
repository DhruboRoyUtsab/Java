public class Circle{
	private int radius;
	private String color;
	
	
	Circle(int radius, String color){
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
			Circle Area = new Circle(5, "Blue");
			Area.Display();
			
			
		
	
		}
}