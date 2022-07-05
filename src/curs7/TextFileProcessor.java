package curs7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileProcessor {
	
	
		public void writeTxtFile(String text) {
			
			try {
				FileWriter myWriter = new FileWriter("filename.txt");
				myWriter.write(text);
				myWriter.close();
				System.out.println("Am scris in fisier!");
				
			} catch (IOException e) {
				System.out.println("Nu am putut scrie in fisier!");

				e.printStackTrace();
			}
			
		}
		
		public void addToTxtFile(String text) {
			
			try {
				FileWriter myWriter = new FileWriter("filename.txt", true);
				myWriter.write(text);
				myWriter.close();
				System.out.println("Am scris in fisier!");
				
			} catch (IOException e) {
				System.out.println("Nu am putut scrie in fisier!");

				e.printStackTrace();
			}
		}

		
		public void readTxtFile() {
			
			File file = new File("filename.txt");
			
			try {
				Scanner scan  = new Scanner(file);
				while(scan.hasNextLine()) {
					System.out.println(scan.nextLine());
				}
				scan.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		public void deleteTxtFile() {
			
			File myFile =  new File("filename.txt");
			myFile.delete();
			System.out.println("Deleted my file :" + myFile.getName());
		}
		
		

		
		
}
