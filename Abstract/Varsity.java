package Abstract;

abstract class Student{
   // private String Name;
    
 abstract public void Studentinfo();

}
class Faculty extends Student{
    String Name;
    int Id;
    public Faculty(){}
    
    public Faculty(String Name, int Id){
        this.Name = Name;
        this.Id = Id;
    }

    public void Studentinfo(){
        System.out.println(Name);
        System.out.println(Id);
    }
}

public class Varsity{
    public static void main(String[] args) {
        Faculty F1 = new Faculty("Utsab", 9846);
        F1.Studentinfo();
    }
}