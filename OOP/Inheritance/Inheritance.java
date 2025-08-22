class School{
    private int roll;
    private String name;
    public School(){
        //default 
    }
    public School(int roll, String name){
        this.roll = roll;
        this.name = name;
    }
    public void setRoll(int roll){
        this.roll = roll;
    }
    public int getRoll(){
        return roll;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void display(){
        System.out.print("Name : " +name);
        System.out.print(" Roll : " +roll);
    }
}
class Student extends School{
    private double marks;
    private int attendance;
    public Student(){
    }
    public Student(int roll, String name, double marks, int attendance){
        super(roll, name);
        this.marks = marks;
        this.attendance = attendance;
    }
    public void setMarks(double marks){
        this.marks = marks;
    }
    public double getMarks(){
        return marks;
    }
    public void setAttendance(int attendance){
        this.attendance = attendance;
    }
    public int getAttendance(){
        return attendance;
    }
    public void display(){
        super.display();
        System.out.print(" Mark is: "+marks);
        System.out.print(" Attendance is: "+attendance);
    }
    public double cal(){
        return marks*attendance;
    }
}
public class Inheritance{
    public static void main(String[] args){
        Student str1 = new Student(10,"Shakib",90, 87);
        Student str2 = new Student(15,"Tamim",86, 78);
        str1.display();
        System.out.println();
        str2.display();
        System.out.println();
        System.out.println(str1.cal());
        System.out.println(str2.cal());

    }
}