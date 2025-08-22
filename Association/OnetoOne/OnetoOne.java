class Student {
    private String name;
    private int id;
    private char gender;
    private Address address;
 
    // Constructor
    public Student(String name, int id, char gender, Address address) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.address = address;
    }
 
    // Getters and setters for name
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    // Getters and setters for id
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    // Getters and setters for gender
    public char getGender() {
        return gender;
    }
 
    public void setGender(char gender) {
        this.gender = gender;
    }
 
    // Getter and setter for Address
    public Address getAddress() {
        return address;
    }
 
    public void setAddress(Address address) {
        this.address = address;
    }
     public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Gender: " + gender);
        System.out.println("Address:");
        address.display(); // Call display method of Address
    }
}
 
class Address {
    private String place;
    private int h_number;
    private String postoffice;
    private int gpo;
 
    // Constructor
    public Address(String place, int h_number, String postoffice, int gpo) {
        this.place = place;
        this.h_number = h_number;
        this.postoffice = postoffice;
        this.gpo = gpo;
    }
 
    // Getters and setters for place
    public String getplace() {
        return place;
    }
 
    public void setplace(String place) {
        this.place = place;
    }
 
    // Getters and setters for h_number
    public int getH_number() {
        return h_number;
    }
 
    public void setH_number(int h_number) {
        this.h_number = h_number;
    }
 
    // Getters and setters for postoffice
    public String getPostoffice() {
        return postoffice;
    }
 
    public void setPostoffice(String postoffice) {
        this.postoffice = postoffice;
    }
 
    // Getters and setters for gpo
    public int getGpo() {
        return gpo;
    }
 
    public void setGpo(int gpo) {
        this.gpo = gpo;
    }
    public void display() {
        System.out.println("Place: " + place);
        System.out.println("House Number: " + h_number);
        System.out.println("Post Office: " + postoffice);
        System.out.println("General Post Office: " + gpo);
    }
}
public class OnetoOne{
    public static void main(String[] args){
        Address ad = new Address("kuril", 129, "Vatara", 2000);
        Student s = new Student("Max", 87, 'M', ad);
        //System.out.print(s.getAddress().getGpo());
        s.display();
        System.out.println("------------------");
        //ad.display();
    }
}