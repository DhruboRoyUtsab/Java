class Account
{
	private int accountNumber;
	private String accountHolderName;
	private double balance;
//	public Account()
//	{
//	}
	public Account(int accountNumber, String accountHolderName,double balance)
	{
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public int getAccountNumber(){
		return accountNumber;
	}
	public String getAccountHolderName(){
		return accountHolderName;
	}
	public double getBalance(){
		return balance;
	}

	public void show()
	{
		System.out.println("----Account Number----"+accountNumber);
		System.out.println("----Account HolderName----"+accountHolderName);
		System.out.println("----Account Balance----"+balance);
	}
}
 
 
class Customers
{
	private String phnNumber;
	Account accounts[];
	public Customers()
	{
	}
	public Customers(String phnNumber, int sizeOfArray)
	{
		this.phnNumber = phnNumber;
		accounts = new Account[sizeOfArray];
	}
 
	
	public void setPhnNumber(String phnNumber)
	{
		this.phnNumber = phnNumber;
	}
	public String getPhnNumber(){return phnNumber;}

	public void showAllAccounts() // Function to show all accounts 
	{
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] != null)
			{
				System.out.println("Phone Number"+phnNumber);
				accounts[i].show();
			}
		}
	}	

	public void insertAccount(Account acc) //function to insert 
	{
		int flag=0;
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == null)
			{
				accounts[i] = acc;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("----Inserted----");}
		else {System.out.println("----CanNot Insert----");}
	}

	public void removeAccount(Account a) // function to remove accounts
	{
		int flag = 0;
		for(int i=0;i<accounts.length;i++)
		{
			if(accounts[i] == a)
			{
				accounts[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("----Removed----");}
		else {System.out.println("----CanNot Remove----");}
	}
}
 
public class OnetoMany
{
	public static void main(String args[])
	{
     	Account a1 = new Account(325,"Kamal",20000);
		Account a2 = new Account(4276,"Jamal",39778);
		Account a3 = new Account(3788,"Moni",55555);
		Account a4 = new Account(111,"Mukta",35556.66666);
 
        Customers c1 = new Customers("+880123456678", 4);
 
		c1.insertAccount(a1);
		c1.insertAccount(a2);
		c1.insertAccount(a3);
		c1.insertAccount(a4);

		c1.showAllAccounts();

		c1.removeAccount(a2);
		c1.showAllAccounts();
		c1.removeAccount(a2);

	}
}
