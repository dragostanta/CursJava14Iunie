package curs3;

import java.util.Scanner;

public class DiceGame {

	/*
	 * Facem un joc cu zaruri. Regulile sunt urmatoarele:
	 * daca userul da in total : 2, 6, 12 Pierde jocul.Jocul se termina
	 * daca userul da in total : 7, 11 Castiga. Jocul se termina
	 * daca userul da in total 3, 10 . Repeta aruncarea automat. Jocul continua
	 * 
	 * daca da oricare din combinatiile de zar care nu au fost scrise mai jus,
	 * il intrebam daca mai da o data. Raspunsul este un boolean (True /False)
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {

		
		//int dice1 = (int) (Math.random()*6+1);
		//int dice2 = (int) (Math.random()*6+1);
		//int sum =  dice1+dice2;
		
		boolean condition = true;
		
		while(condition) {
			
			int dice1 = (int) (Math.random()*6+1);
			int dice2 = (int) (Math.random()*6+1);
			int sum =  dice1+dice2;
			System.out.println("Ai dat :" + sum);
			
			// * daca userul da in total : 2, 6, 12 Pierde jocul.Jocul se termina
			if(sum == 2 || sum == 6 || sum ==12) {
				System.out.println("Imi pare rau. Ai dat :" + sum + " Ai pierdut!");
				break;
				// * daca userul da in total : 7, 11 Castiga. Jocul se termina
			}else if(sum == 7 || sum == 11) {
				System.out.println("Felicitari ! Ai dat :"+ sum + " Ai castigat!");
				break;
				// * daca userul da in total 3, 10 . Repeta aruncarea automat. Jocul continua	
			}else if(sum == 3 || sum == 10) {
				System.out.println("Ai dat :" + sum + " Automat mai dai o data!");
				
			}
			
			System.out.println("Mai vrei sa dai o data ?");
			Scanner scan = new Scanner(System.in);
			condition = scan.nextBoolean();
		}
		
		System.out.println("Game over ! ");
		
	}

}
