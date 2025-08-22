public class Customer
{
	private String phnNumber;
	private Account1 account;
	
	public Customer()
	{
		System.out.println("Empty Customer");
	}
	public Customer(String phnNumber, Account1 account)
	{
		System.out.println("Para Customer");
		this.phnNumber = phnNumber;
		this.account = account;
	}
	public void setPhnNumber(String phnNumber)
	{
		this.phnNumber = phnNumber;
	}
	public void setAccount(Account1 account)
	{
		this.account = account;
	}
	public String getPhnNumber(){
		return phnNumber;
	}
	public Account1 getAccount(){
		return account;
	}
	
	public void showDetails()
	{
		System.out.println("Customer Phn Number: "+phnNumber);
		account.showDetails();
		
	}
}