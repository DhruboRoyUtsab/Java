import java.util.Scanner;
public class Car{
	private String Brand;
	private String Model;
	private int year;
	
	public Car(String Brand, String Model, int year){
		this.Brand = Brand;
		this.Model = Model;
		this.year = year;
	}
	
	
	public void Detalis(){
				System.out.println("Brand: " + Brand + " Model: " + Model + " Year:" + year);
	}
	
		public static void main(String[] args){
			
			Scanner Input = new Scanner(System.in);
			System.out.println("Enter Brand: ");
			String Brand = Input.nextLine();
			System.out.println("Enter Model: ");
			String Model = Input.nextLine();
			System.out.println("Enter year: ");
			int year = Input.nextInt();
			
			
			Car Result = new Car(Brand, Model, year);
			
			Result.Detalis();
			
			
		
	
		}
}