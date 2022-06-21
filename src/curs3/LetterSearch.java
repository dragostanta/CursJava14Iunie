package curs3;

import java.util.Scanner;

public class LetterSearch {

	//masina --> masina.charAt(4)
	//012345
	//

	//litera A exista in text
	
	public static void main(String[] args) {
		
		System.out.println("Te rog introdu un cuvant :");
		Scanner scan  =  new Scanner(System.in);
		String text =  scan.next();
		
		System.out.println(text.length());
		
		
		for(int i =0; i<text.length(); i++) {
			
			char currentLetter = text.charAt(i);
			if(currentLetter == 'a' || currentLetter == 'A') {
				System.out.println("Litera A exista in text! la index : " + i);
				break;
			}
		}

	}

}
