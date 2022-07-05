package homework6;

import java.util.Scanner;

public class TestSavingsAccount {

	public static void main(String[] args) throws InsuficientFundsException {

		Customer customer = new Customer("Oana", "My Address", "my@mail.com" );
		SavingsAccount savings = new SavingsAccount(customer, 120.00, 100000);
		System.out.println("Hi " + customer.getName());
		System.out.println("Please enter the amount to witdraw: ");
		Scanner scan = new Scanner(System.in);
		double amount = scan.nextDouble();

		
		try {
			savings.withdraw(amount);	
			
		}catch (InsuficientFundsException e) {
			System.out.println("The amount you entered is greather than the available balance: " + savings.balance);

		}finally {
			
			System.out.println("Thank you for using our ATM!");
			
		}
		
		scan.close();
	}
	

}
