public class Cricket {
	private String Player;
	private int Score;
	
	
	Cricket(String Player, int Score){
		this.Player = Player;
		this.Score = Score;
	}
	
	// public double CalculateArea(){
	// 	return length * width;
	// }

	public void PlayerDetails(){
		System.out.println("Player: " + Player);
        System.out.println("Score: " + Score);
    }
    
		public static void main(String[] args){

	        Cricket Shakib = new Cricket("Shakib", 158);
            Shakib.PlayerDetails();
            Cricket Tamim = new Cricket("Tamim", 178);
            Tamim.PlayerDetails();
            Cricket Liton = new Cricket("Liton", 188);
            Liton.PlayerDetails();
	}
}

