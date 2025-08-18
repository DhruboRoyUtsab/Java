class Hello {
    int id;
    int[] marks;
    String name;
 
    public Hello(String name, int id, int[] marks) {
        this.id = id;
        this.marks = marks;
        this.name = name;
    }
 
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.print("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
 
public class AOB2 {
    public static void main(String[] args) {
 
        // Creating array of object
        System.out.println("Display using Array of object: ");
        Hello[] hel = new Hello[2];
 
        hel[0] = new Hello("Jamal", 12, new int[]{12, 23, 34});
        hel[1] = new Hello("Kamal", 23, new int[]{3, 4, 5});
 
        for (int i = 0; i < hel.length; i++) {
            hel[i].display();
        }
 
        // Creating object of  class
        System.out.println("Display using object of Class: ");
        Hello hh1 = new Hello("Jamal", 12, new int[]{12, 23, 34});
        Hello hh2 = new Hello("Kamal", 23, new int[]{3, 4, 5});
 
        hh1.display();
        hh2.display();  
    }
}