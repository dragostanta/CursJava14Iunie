package curs5;

public class StringComparison {

	public static void main(String[] args) {

		String firstString =  "Java";
		String secondString = "automation";
		String thridString = "Java";
		String fourthString = new String("Java");
		
		System.out.println(" == ");
		System.out.println(firstString == secondString);
		System.out.println("equals ");
		System.out.println(firstString.equals(secondString));
		
		System.out.println("--------------------------------");
		
		System.out.println(" == ");
		System.out.println(firstString == thridString);
		System.out.println("equals ");
		System.out.println(firstString.equals(thridString));
		
		System.out.println("--------------------------------");
		
		System.out.println(" == ");
		System.out.println(firstString == fourthString);
		System.out.println("equals ");
		System.out.println(firstString.equals(fourthString));
		
		System.out.println("--------------------------------");
		
	}

}
