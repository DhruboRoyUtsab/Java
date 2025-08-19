public class Account {
    private String AccountHolderName;
    private int AccountNumber;
    private int Balance;
    
    public Account(){}

    public Account(String AccountHolderName, int AccountNumber,int Balance){
        this.AccountHolderName = AccountHolderName;
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    
    }

    public void setAccountHolderName(String AccountHolderName){
        this.AccountHolderName = AccountHolderName;
    }   
    public void setAccountNumber(int AccountNumber){
        this.AccountNumber = AccountNumber;
    }
    public void setBalance(int Balance){
        this.Balance = Balance;
    }
    public String getAccountHolderName(){
        return AccountHolderName;
    }
    public int getAccountNumber(){
        return AccountNumber;
    }
    public int getBalance(){
        return Balance;
    }

    // public void Display(){
    //     System.out.println("Account Holder Name: " + i + AccountHolderName);
    //     System.out.println("Account Number: " + i + AccountNumber);
    //     System.out.println("Balance: " + i + Balance);
    // }
    
}
