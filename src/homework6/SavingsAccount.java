package homework6;


public class SavingsAccount extends Account{

	public SavingsAccount(Customer accountOwner, double balance, int accountNumber) {
		super(accountNumber, balance, accountOwner);	
	}
	
	@Override
	public void withdraw(double amount) throws InsuficientFundsException {
				if(balance < amount) {
					throw new InsuficientFundsException();
					
				}else{
					balance = balance - amount;
					System.out.println("Please pick your money! \nYour new balance is: " + balance);

				}
	}
}
