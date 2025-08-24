import java.lang.*;

public interface IAccountOperations
{
	public abstract void addAccount(Account a); // By default abstract
	void removeAccount(Account a); // By default abstract
	Account getAccount(int accountNumber); // By default abstract
	void showAllAccounts(); // By default abstract
}