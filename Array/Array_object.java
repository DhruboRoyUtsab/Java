class Football{
    int jersey;
    String name;
    int goal;
 
	public Football(){	
	}
public Football(int jersey, String name, int goal){
	this.jersey = jersey;
	this.name = name;
	this.goal = goal;
}
}
public class Array_object{
    public static void main(String[] args){
        Football f1 = new Football(10, "Messi", 98);
        //f1.jersey = 10;
        //f1.name = "Messi";
        //f1.goal = 98;
        Football f2 = new Football();
        f2.jersey = 7;
        f2.name = "Ronaldo";
        f2.goal = 87;
        Football f3 = new Football();
        f3.jersey = 10;
        f3.name = "Neymar";
        f3.goal = 78;
        Football ft[] = new Football[3]; // Array of Object 
        ft[0] = f1;
        ft[1] = f2;
        ft[2] = f3;
        // System.out.print(f1.name+ ", Jersey number is "+ f1.jersey+ ", Goals: "+f1.goal);
        for(int i=0; i< ft.length; i++){
            System.out.println(ft[i].name+ ", Jersey number is "+ ft[i].jersey+ ", Goals: "+ft[i].goal);
        }
    }
}

