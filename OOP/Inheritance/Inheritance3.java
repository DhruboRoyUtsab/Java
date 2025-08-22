class Student {
    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public void input() {
        System.out.println("Enter roll and Name: ");
    }
}

class Shakib extends Student {
    public Shakib(int roll, String name) {
        super(roll, name); // invoking superclass constructor using super() with parameters
    }

    public void display() {
        System.out.println(roll + " " + name);
    }
}

public class Inheritance3 {
    public static void main(String[] args) {
        Shakib sk = new Shakib(1, "Shakib");
        sk.input();
        sk.display();
    }
}
