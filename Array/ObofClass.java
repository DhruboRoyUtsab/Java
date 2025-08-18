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
public class ObofClass {
    public static void main(String[] args) {
        Bank Account1 = new Bank("Uu",645321l,984651l);
        Bank Account2 = new Bank("GG",64874655321l,98467846551l);
        
        Account1.Detalis();
        Account2.Detalis();


        
    }
    
}
