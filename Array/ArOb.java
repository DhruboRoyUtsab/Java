class Info{
    String Name;
    int Id;
    int [] Marks;
    public Info(String Name, int Id, int [] Marks){
        this.Name = Name;
        this.Id = Id;
        this.Marks = Marks;
    }
    public void Display(){
        System.out.println("Name: " + Name);
        System.out.println("ID: " + Id);
        System.out.println("Marks: ");
        for(int i= 0; i < Marks.length; i++){
            System.out.print(Marks[i] + " ");
        }
        System.out.println("\n");
    }
    
}
public class ArOb {
    
    public static void main(String[] args) {
        Info Stu [] =new Info[2];
        Stu [0] = new Info("Utsab", 492, new int[]{95, 92, 90});
        Stu [1] = new Info("Shakib", 467, new int[]{99,95, 92});
        
        for(int i= 0; i < Stu.length; i++){
        Stu[i].Display();
    }
    }
}