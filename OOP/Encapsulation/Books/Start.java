package Books;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        
        Book Java = new Book();
        
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter Book Code: ");
        String isbn = Input.nextLine();
        System.out.println("Enter Book Title: ");
        String Booktitle = Input.nextLine();
        System.out.println("Enter Book Author name: ");
        String authorName = Input.nextLine();
        System.out.println("Enter Book Sell Quantity:");
        int Q = Input.nextInt();
        System.out.println("Enter Book Add Quantity:");
        int A = Input.nextInt();


        Java.setisbn(isbn);
        Java.setBooktitle(Booktitle);
        Java.setauthorName(authorName);
        Java.setprice(50);
        Java.setavailableQuantity(100);
        Java.sellQuantity(Q);
        Java.addQuantity(A);
        Java.showDetails();

    }

}
