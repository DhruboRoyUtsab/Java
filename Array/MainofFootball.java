class Football{
	int jersey;
	int goals;
	String name;
}
public class MainofFootball{
	public static void main(String[] args){
		Football f1 = new Football();
		f1.name = "Messi";
		f1.goals = 100;
		f1.jersey = 10;
		Football f2 = new Football();
		f2.name = "Ronaldo";
		f2.goals = 90;
		f2.jersey = 7;
		Football f3 = new Football();
		f3.name = "Neymar";
		f3.goals = 80;
		f3.jersey = 11;
		Football [] ft = new Football[3]; // creating object array
		ft[0] = f1;
		ft[1] = f2;
		ft[2] = f3;
		for(int i=0; i<ft.length; i++){
			System.out.print("Player name is "+ft[i].name+ " and Jersey number is "+ft[i].jersey+ " with " +ft[i].goals+" goals");
			System.out.println();
		}
	}
}