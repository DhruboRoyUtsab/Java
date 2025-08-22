class Zoo{
	private String place;
	private double ticket;

	public Zoo(){
	}
	public Zoo(String place, double ticket){
	this.place = place;
	this.ticket = ticket;
	}

public void setPlace(String place) {
        this.place = place;
    }

    public void setTicket(double ticket) {
        this.ticket = ticket;
    }
	public String getplace() {
        return place;
	}

    public double getTicket() {
        return ticket;
    }
	
	public void Display(){
	System.out.println("Place: " + place + "\nTicket: " + ticket);
	}
}

class Animal extends Zoo{
	private String Name;
	private int Number;
	private double ageInMonth;

	public Animal(){
	}
	public Animal(String place, double ticket, String Name, int Number,double ageInMonth){
	super(place, ticket);
	this.Name = Name;
	this.Number = Number;
	this.ageInMonth =  ageInMonth;
	}

public void setName(String Name) {
        this.Name = Name;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }
	public void setAgeInMonth(double ageInMonth) {
        this.ageInMonth = ageInMonth;
    }
	public String getName() {
        return Name;
	}

    public double getNumber() {
        return Number;
    }
	public double getAgeInMonth() {
        return ageInMonth;
    }
	public void Display(){
	super.Display();
	System.out.println("Name: " + Name + "\nNumber: " + Number);
	}
	
	public double CalAgeInYear(){
	return ageInMonth /12;

	}
	}
	public class ZooMain{
	public static void main(String[] args){
	
	Animal Dog = new Animal("Dhaka", 5, "Vector", 120, 100);
	Dog.Display();
	System.out.println("Age in Year: " + Dog.CalAgeInYear()+"\n");

	
	Animal Elephant =  new Animal();
	Elephant.setPlace("Africa");
	Elephant.setName("Elephant");
	Elephant.setTicket(10);
	Elephant.setNumber(50);
	Elephant.setAgeInMonth(500);
	Elephant.Display();
	System.out.println("Age in Year: " + Elephant.CalAgeInYear());
	
}
}

	