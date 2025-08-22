public class Bankaccount {
    private int AccountNumber;
    private double Balance;
	private String OwnerName;


    public Bankaccount(int AccountNumber, double Balance, String OwnerName) {
        this.AccountNumber =  AccountNumber;
		this.Balance = Balance;
		this.OwnerName = OwnerName;
    }

    public void setAccountNumber(int AccountNumber) {
        this.AccountNumber = AccountNumber;
    }
	public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }
	
	public double getBalance() {
        return Balance;
    }

    public String getOwnerName() {
        return OwnerName;
    }


    public void Display() {
        
        System.out.println("AccountNumber: " + AccountNumber);
		System.out.println("Balance: " + Balance);
		System.out.println("Owner Name: " + OwnerName);
	}

}
