import java.util.*;

class Game{
    private String name;
    private int id;
    private int score;

    public Game(){

    }
    public Game(String name, int id, int score){
        this.name = name;
        this.id = id;
        this.score = score;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setScore(int score){
        this.score = score;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getScore(){
        return score;
    }

    public void Display(){
        System.out.println("Name: " +name);
        System.out.println("ID: " +id);
        System.out.println("Score: " +score);

    }
}

class Football extends Game{
    private String Stadium;

    public Football(){

    }
    public Football(String name, int id, int score, String Stadium){
        super(name, id, score);
        this.Stadium = Stadium;
    }
    public void setStadium(String Stadium){
        this.Stadium = Stadium;
        
    }
    public String getStadium(){
        return Stadium;
    }


    public void Display(){
        super.Display();
        System.out.println("Stadium name: " +Stadium);
    }
}

public class MainofGame{
    public static void main(String[] Utsab){
        
        Scanner Input = new Scanner(System.in);
        
        System.out.println("Enter Name: ");
        String Name = Input.nextLine();
        System.out.println("Enter Stadium Name: ");
        String Sname = Input.nextLine();
        System.out.println("Enter ID: ");
        int ID = Input.nextInt();
        System.out.println("Enter Score: ");
        int S = Input.nextInt();
        
        Football A = new Football();
        Football B = new Football(Name,ID,S,Sname);
        
        Input.nextLine();
        System.out.println("Enter Name: ");
        A.setName(Input.nextLine());
        System.out.println("Enter ID: ");
        A.setId(Input.nextInt());
        System.out.println("Enter Score: ");
        A.setScore(Input.nextInt());
        Input.nextLine();
        System.out.println("Enter Stadium Name: ");
        A.setStadium(Input.nextLine());

        B.Display();
        System.out.println();
        A.Display();
    }
}
