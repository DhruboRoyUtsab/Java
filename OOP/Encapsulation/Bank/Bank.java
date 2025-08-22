import java.util.Scanner;

public class Bank{
public static void main(String[] args) {

    Bankaccount Utsab = new Bankaccount(202024, 99999,"Utsab");
    Utsab.Display();
    System.out.println();
    Scanner Input = new Scanner(System.in);

    Bankaccount User = new Bankaccount(0, 0, null);
    System.out.println("Enter the account Number:");
    int ac = Input.nextInt();
    System.out.println("Enter the Balance:");
    int b = Input.nextInt();
    Input.nextLine();
    
    System.out.println("Enter the accountant Name:");
    String name = Input.nextLine();


    User.setAccountNumber(ac);
    User.setBalance(b);
    User.setOwnerName(name);

	User.Display();
    }
	}