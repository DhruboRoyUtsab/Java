package Example;

public class Main{
	public static void main(String[] args){
		Employee ep = new Employee("Shaikat",25);
		
		//System.out.print("Name :" +ep.getName());
		//System.out.println("\nId :" +ep.getId());
		
		ep.display();
		
		ep.setName("Das"); // using setter
		ep.setId(100);
		
		//System.out.print("Name :" +ep.getName());
		//System.out.println("\nId :" +ep.getId());
		
		
		//ep.name = "das"; //.. Previous approcah 
		//ep.id = 10;
		
		System.out.println();
		ep.display();
	}
}
		