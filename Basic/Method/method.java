package Method;
public class method {
    public static void main(String[] args){
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        boolean Gameover = true;
        int finalscore = score;
        CalculateScore(score,bonus,levelCompleted,true);
        score = 500000;
        levelCompleted = 10;
        bonus = 250;
        finalscore = score;
        if (Gameover){
            finalscore += (levelCompleted * bonus);
            System.out.println("Finalscore is " + finalscore);

        }

    }

        public static void CalculateScore(int score, int levelCompleted, int bonus, boolean Gameover)
        {
        int finalscore = score;
        if (Gameover){
           finalscore += (levelCompleted * bonus);
            System.out.println("Finalscore is " + finalscore);

        }
        }


    }
