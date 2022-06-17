package curs2;

import java.util.Scanner;

public class SwitchExample {
	
	/*
	 * Facem un program care intreaba un calificativ
	 * daca userul introduce A: printam Excelent
	 * daca userul introduce B: printam Foarte bine
	 * daca userul introduce C: printam Suficient
	 * daca userul introduce D: printam insuficient
	 * daca nu introduce niciuna din cele de mai sus , printam Calificativ invalid
	 *
	 */
	
	String nota;
	
	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu ce nota ai luat :");
		nota = scan.next();
		scan.close();
	}
	
	public void gradeStudent() {
		
		switch(nota.toUpperCase()) {
		
		case "A" :
			System.out.println("Excelent!");
			break;
		case "B" :
			System.out.println("Foarte bine!");
			break;
		case "C" :
			System.out.println("Suficient!");
			break;
		case "D" :
			System.out.println("Insuficient!");
			break;
		default:
			System.out.println("Calificativ invalid! Te rog introdu doar A, B, C sau D");
		}
	}
	
	

}
