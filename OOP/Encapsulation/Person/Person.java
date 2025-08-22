public class Person {
    
	private String Name;
	private int Age;
	private String Gender;


    public Person(String Name, int Age, String Gender) {
		this.Name = Name;
		this.Age =  Age;
		this.Gender = Gender;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
	public void setName(String Name) {
        this.Name = Name;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public int getAge() {
        return Age;
    }
	
	public String getName() {
        return Name;
    }

    public String getGender() {
        return Gender;
    }


    public void Display() {
        
        
		System.out.println("Name: " + Name);
		System.out.println("Age: " + Age);
		System.out.println("Gender: " + Gender);
	}

}
