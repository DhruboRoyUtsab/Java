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
        System.out.println("Name : " +name);
        System.out.println("Roll : " +roll);
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
        System.out.println("Mark: "+marks);
        System.out.println("Attendance: "+attendance);
    }
    public double cal(){
        return (marks*attendance)/100;
    }
}
public class ID{
    public static void main(String[] args){
        Student Utsab = new Student();
        Student Shakib = new Student(53467,"Shakib", 4,80);

        Utsab.setName("Utsab");
        Utsab.setMarks(4);
        Utsab.setRoll(53492);
        Utsab.setAttendance(100);
        Utsab.display();
        System.out.println("Bonus: " +Utsab.cal());
        System.out.println();
        
        Shakib.display();
        System.out.println("Bonus: " +Shakib.cal());
        

    }
}