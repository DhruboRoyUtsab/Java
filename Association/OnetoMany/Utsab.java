public class Utsab {
    public static void main(String[] args) {
        Account A1 = new Account("Utsab", 798465,98658974);
        Account A2 = new Account("Arthur", 353354,35434534);
        Account A3 = new Account("Noctis", 4528945,9845613);
        Customer C1 = new Customer("01858172598",4);
 
        C1.AddAccount(A1);
        System.out.println();
        C1.AddAccount(A2);
        System.out.println();
        C1.AddAccount(A3);
        System.out.println();
        C1.Display();
        
        C1.DeleteAccount(A3);
        System.out.println();
        C1.DeleteAccount(A3);
        System.out.println();
        C1.Display();

    }
}

