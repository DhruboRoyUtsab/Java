import java.util.Scanner;

public class Add{

    int a,b;

    void Getdata(){
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        a = Input.nextInt();
        System.out.println("Enter another Number: ");
        b = Input.nextInt();
    }

    void Putdata(){
        System.out.println("Addition " + (a + b));
    }
    public static void main(String[] args) {
    
        Add op = new Add();
        op.Getdata();
        op.Putdata();
    }
}
