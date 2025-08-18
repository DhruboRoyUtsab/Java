public class Employee{
	private String Name;
	private long ID;
	private double Salary;
	
	Employee(String Name, long ID, double Salary){
	this.Name = Name;
	this.ID = ID;
	this.Salary = Salary;
	}
	
	public void Display(){
		System.out.println("Name: " + Name + " ID: " + ID + " Salary: $" + Salary);
		}
		
			public static void main(String[] args){
			Employee Output = new Employee("John Doe", 12345, 50000);
			Output.Display();
			
		
	
		}
}