package curs4.polymorphism;

public class TestOverride {

	public static void main(String[] args) {

		Tester tester = new Tester();
		//tester.work; --> Angajat
		//tester.work; --> Tester
		tester.work(); 
		tester.scrieTeste();
		
		Angajat angajat =  new Angajat();
		angajat.work();
		
		Developer developer  = new Developer();
		developer.work();
		
		System.out.println("-------------------------");
		
		
		// Angajat angajat2 = new Angajat();
		// Angajat > DataType 
		// angajat2 >numeObiect
		// = > operatorDeAtribuire 
		// new > cuvant cheie care ne ajuta sa instantiem o clasa
		// Angajat() > constructorul clasei
		
		// String nume = "Dragos"
		
		// WebDriver browser =  new ChromeDriver();       // ChromeDriver ; FirefoxDriver
		
		
		Angajat angajat2 =  new Tester();
		angajat2.work();
		((Tester) angajat2).scrieTeste();
		
		Angajat angajat3 = new Tester();
		angajat3.work();
		
		angajat3 = new Developer();
		angajat3.work();
	}

}
