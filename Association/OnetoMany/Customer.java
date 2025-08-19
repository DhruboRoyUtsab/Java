public class Customer {
    private String phnNumber;
    private Account account[];

    public Customer(){}

    public Customer(String phnNumber, int size){
        this.phnNumber = phnNumber;
        account = new Account[size];
    }
    public void setPhnNumber(String phnNumber){
        this.phnNumber = phnNumber;
    }
    public String getPhnNumber(){
        return phnNumber;
    }


    
    public void AddAccount(Account A){
        int add = 0;
        for(int i = 0; i<account.length; i++){
            if(account[i] == null){
                account[i] = A;
                add = 1;
                break;
           }
        }
        if(add ==1){
            System.out.println("Account has been added.");    
        }
        else{
            System.out.println("Can not added.");    
        }
    }
    public void DeleteAccount(Account A){
        int dlt = 0;
        for(int i = 0; i<account.length; i++){
            if(account[i] == A){
                account[i] = null;
                dlt = 1;
                break;
           }
        }
        if(dlt ==1){
            System.out.println("Account has been deleted successfully.");    
        }
        else{
            System.out.println("Can not deleted.");    
        }
    }
    public void EmptyAccount(){
        int count = 0;
        for(int i = 0; i<account.length; i++){
            if(account[i] == null){
                count++;
           }
        }
        if(count >0){
            System.out.println("Empty Account: " + count);    
        }
        else{
            System.out.println("NO account available.");    
        }
    }
    // public void Display(){
    //     for(int i = 0; i<account.length; i++){
    //         if(account[i] != null){
    //             System.out.println("Phone Number:  " + phnNumber);
    //             account[i].Display();
    //             System.out.println();
    //        }
    // }
    // }
    public void Display(){
        for(int i = 1; i<=account.length; i++){
            if(account[i] != null){
                System.out.println("Phone Number:  " + " " +  phnNumber);
                System.out.println("Account Number: " + i + " "+ account[i].getAccountNumber());
                System.out.println("Balance: " + i + " "+ account[i].getBalance());
                System.out.println("Account Holder Name: " + i + " "+ account[i].getAccountHolderName());
                    
                System.out.println();
           }
    }
    }
}
