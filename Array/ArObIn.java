import java.util.Scanner;

class Info{
    String Name[];
    int Id[];
    int [] Marks;
    public Info(String Name[], int Id[], int [] Marks){
        this.Name = Name;
        this.Id = Id;
        this.Marks = Marks;
    }
    public void Display(){
        for(int i= 0; i < Marks.length; i++){
            System.out.println("Name: ");
        System.out.println(Name[i]);
        System.out.println("ID: ");
        System.out.println( Id[i] );
        System.out.println("Marks: ");
            System.out.print(Marks[i] + " ");
        }
        System.out.println("\n");
    }
    
}
public class ArObIn {
    
    public static void main(String[] args) {
        int n;
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Student Number: ");
        n = Input.nextInt();

        Info Stu [] = new Info[n];
        for(int i = 0 ; i < n; i++){
            System.out.println("Enter Name: ");
            String name = Input.next();
            System.out.println("Enter ID: ");
            int id = Input.nextInt();
            System.out.println("Enter Marks (3 subjects, space separated): ");
            int[] marks = new int[3];
            for(int j = 0; j < 3; j++) {
                marks[j] = Input.nextInt();
            }
            Stu[i] = new Info(new String[]{name}, new int[]{id}, marks);
        }

        //Stu [0] = new Info("Utsab", 492, new int[]{95, 92, 90});
        //Stu [1] = new Info("Bishal", 478, new int[]{99,95, 92});
        
        for(int i= 0; i < Stu.length; i++){
        Stu[i].Display();
    }
    }
}