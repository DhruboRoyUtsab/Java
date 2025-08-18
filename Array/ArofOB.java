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
public class ArofOB {
    public static void main(String[] args) {
        Bank Acc1 = new Bank();
        Acc1.Name = "Utsab";
        Acc1.AccNumber = 798465231l;
        Acc1.Balance = 78465231l;

        Bank Acc2 = new Bank();
        Acc2.Name = "Dhrubo";
        Acc2.AccNumber = 87465123l;
        Acc2.Balance = 798465231l;

        Bank [] Info = new Bank[2];
        Info [0] = Acc1;
        Info [1] = Acc2;

        for(int i = 0; i<Info.length;i++){
            Info[i].Detalis();
        }


    }
    
}
