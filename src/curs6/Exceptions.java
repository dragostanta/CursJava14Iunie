package curs6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {

		//Thread.sleep(4000);
		
		try {
				Scanner scan = new Scanner(System.in);
				System.out.println("Te rog introdu un numar :");
				int num1 = scan.nextInt();
				System.out.println("Te rog introdu alt numar :");
				int num2 = scan.nextInt();
				num2 =  (Integer) null;
				
				System.out.println("Rezultatul impartirii :" + num1/num2);
				
			}catch(ArithmeticException e) {
				
				System.out.println("Nu mai imparti la zero!");
				
			}catch (InputMismatchException e) {
				
				System.out.println("Te rog introdu doar integer");
			
			}catch(Exception e) {
				System.out.println("Something went wrong");
			}
		
		System.out.println("Multumim ca ati folosit programul nostru!");
		
		
		//NosuchElementException
		//StaleElementException
		//InterupedExcetion
		
		
	}

}
