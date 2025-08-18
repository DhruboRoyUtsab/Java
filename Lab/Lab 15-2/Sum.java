import java.util.Scanner;
public class Sum{
	private int a;
	private int b;

	public Sum(int a, int b){
		this.a = a;
		this.b = b;
	}
	public int add(){
		return a + b;
	}
	public void Display(){
		System.out.println("Sum : " + add());
	}
	
	public static void main(String[] args){
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int a = Input.nextInt();
		System.out.println("Enter another Number: ");
		int b = Input.nextInt();
		
		Sum S = new Sum(a,b);
		
		S.Display();
	}
}
		