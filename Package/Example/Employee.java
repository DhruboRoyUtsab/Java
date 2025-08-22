package Example;
public class Employee{
	private int id;
	private String name;
	
	public Employee(String name, int id){
		this.name = name;
		this.id =id;
	}
	public void display(){
		System.out.println(id + " " + name);
	}
	// Getter and Setter
	
	public void setName(String name){
		this.name = name;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getName(){
		return name;
	}
	public int getId(){
		return id;
	}
	
	
}
	