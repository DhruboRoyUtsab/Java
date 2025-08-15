package Method;
public class score {
    public static void main(String[] args){
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        int finalscore = score;

        boolean Gameover = true;
        if (Gameover){
            finalscore += (levelCompleted * bonus);
            System.out.println("Finalscore is " + finalscore);

        }

        
        score = 500000;
        levelCompleted = 10;
        bonus = 250;
        finalscore = score;
        if (Gameover){
            finalscore += (levelCompleted * bonus);
            System.out.println("Finalscore is " + finalscore);

        }


    }

    
}
