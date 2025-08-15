package Method;
public class methodchallenge {
    public static void main(String[] args) {
        int HighScorePosition = CalculateHighScoreposition(1500);
       DisplayhighScorePosition("UTSAB", HighScorePosition); 
    }
    public static void DisplayhighScorePosition(String playerName, int Position){

         
        System.out.println(playerName + " managed to get into position " + Position + " on the high score list");


    }
    public static int CalculateHighScoreposition(int playerScore){
        if(playerScore >=1000){
            return 1;

        }
        else if(playerScore>= 500 && playerScore <1000){
            return 2;
        }
        else if(playerScore >=100 && playerScore <500){
            return 3;
        }
        else{
            return 4;
        }
    }

    
}
