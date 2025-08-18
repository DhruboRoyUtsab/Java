import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = Input.nextInt();
        int [] Num = new int[size];

        //Input
        System.out.println("Enter the Element of the Array: ");
        for(int i = 0; i<size; i++){
            Num[i] = Input.nextInt();    
        }

        //Output
        System.out.println("Element of the Array: ");
        for(int i = 0; i<size;i++){
        System.out.print(Num[i] + " ");
        }
        System.out.println();

        //Largest
        System.out.print("Largest: ");
        int Largest = Num[0];
        for(int i= 0; i<size; i++)
        if(Num[i]>Largest){
        Largest = Num[i];
        }
        System.out.println(Largest);

        //Lowest
        System.out.print("Lowest: ");
        int Lowest = Num[0];
        for(int i= 0; i<size; i++)
        if(Lowest>Num[i]){
        Lowest = Num[i];
        }
        System.out.println(Lowest);

        //Reverse
        System.out.println("Reverse: ");
        for(int i = size - 1; i>=0; i--)
        {
        System.out.print(Num[i] + " ");
        }
        System.out.println();

        //Ascending order Sorting
        System.out.println("Ascending Order: ");
        for(int i=0;i <size;i++){
            for(int j=i+1; j <size;j++){
                if(Num[i]> Num[j]){
                    int temp = Num[i];
                    Num[i] = Num[j];
                    Num[j] = temp;
                }
            }
        }
        for(int i = 0; i<size; i++){
            System.out.print(Num[i] + " ");
        }

        System.out.println();

        //Descending order Sorting
        System.out.println("Descending Order: ");
        for(int i=0;i <size;i++){
            for(int j=i+1; j <size;j++){
                if(Num[i]< Num[j]){
                    int temp = Num[i];
                    Num[i] = Num[j];
                    Num[j] = temp;
                }
            }
        }
        for(int i = 0; i<size; i++){
            System.out.print(Num[i] + " ");
        }



    }
}
