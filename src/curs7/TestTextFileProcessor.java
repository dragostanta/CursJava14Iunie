package curs7;

public class TestTextFileProcessor {

	public static void main(String[] args) {

		TextFileProcessor obj = new TextFileProcessor();
		obj.writeTxtFile("Textul meu din fisier!\n");
		obj.addToTxtFile("Noul meu text!\n");
		obj.addToTxtFile("Alt text!");
		obj.readTxtFile();
		obj.deleteTxtFile();

		
		
	}

}
