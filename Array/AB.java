class Bank {
    String Name;
    long AccNumber;    
    long Balance;

    Bank(){
    }
    Bank(String Name, long AccNumber, long Balance){
        this.Name = Name;
        this.AccNumber = AccNumber;
        this.Balance = Balance;
    }   
    public void Detalis(){
        System.out.println("Name = " + Name);
        System.out.println("Account Number = " + AccNumber);
        System.out.println("Balance = " +Balance);
    }
}
public class AB {
    public static void main(String[] args) {
        Bank Account [] = new Bank[2];

        Account[0] = new Bank("Utsab", 46435438464555l, 99996999545l);
        Account [1] = new Bank("Dhrubo" ,892467654741l,794613974741l);
        
        for(int i= 0 ; i<Account.length; i++){
            Account[i].Detalis();
        }
    }
    
}
