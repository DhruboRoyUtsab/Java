public class Student {
    private String Name;
    private int Id;
    private char gender;
    private Address address;
    public Student(){}

    public Student(String Name, int Id, char gender, Address address){
        this.Name = Name;
        this.Id = Id;
        this.gender = gender;
        this.address = address;
    }

    public void setName(String Name){
        this.Name = Name;
    }
    public void setId(int Id){
        this.Id = Id;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public void setAdress(Address address){
        this.address = address;
    }

    public String getName(){
        return Name;
    }
    public int getId(){
        return Id;
    }
    public char getGender(){
        return gender;
    }
    public Address getAddress(){
        return address;
    }
    public void Display(){
        System.out.println("Name: " + Name);
        System.out.println("Id: " + Id);
        System.out.println("Gender: " + gender);
        System.out.println("----------------");
        System.out.println("Address: ");
        address.Display();
    }
}
