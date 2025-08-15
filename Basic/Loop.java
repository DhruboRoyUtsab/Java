public class Loop {
    public static void main(String[] args) {
        int countOfMatches = 0;
        int sumOfMathces = 0;
        for (int LoopNumber = 1; LoopNumber < 1000; LoopNumber++) {
            if (LoopNumber % 3 == 0 && LoopNumber % 5 == 0) {
                countOfMatches++;
                sumOfMathces += LoopNumber;
                System.out.println("Found a match = " + LoopNumber);
            }
            if (countOfMatches == 5) {
                break;

            }
        }
        System.out.println("Sum: " + sumOfMathces);

        int k = 1;
        boolean IsReady = true;
        while (IsReady) {
            if (k > 5) {
                break;
            }
            System.out.println(k);
            k++;
        }

        int number = 0;
        while (number < 50) { // While Loop
            number += 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.print(number + "_");
        }

        int j = 1;
        boolean isReady = false;
        do { // Do-While loop
            if (j > 5) {
                break;
            }

            System.out.println(j);
            j++;
            isReady = (j > 0);
        } while (isReady);

    }

}
