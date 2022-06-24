package curs4.inheritance;

public class TestMostenire {

	public static void main(String[] args) {

		//Angajat --> Tester --> TesterAutomat
		
		TesterAutomat  tester =  new TesterAutomat();
		
		tester.setLimbajProgramare("Java"); // --> Clasa TesterAutomat
		tester.setSenioritate("Junior");// --> clasa Tester
		tester.setDepartament("QA"); //--> Clasa Tester
		tester.setNume("Matei");// --> clasa Angajat
		tester.setEmail("matei@matei.com");// --> clasa Angajat
		
		System.out.println("Numele testerului este :" + tester.getNume() 
		+ ", face parte din "
				+ "departamentul " + tester.getDepartament() 
				+ " este de nivel senioritate " +
				tester.getSenioritate() + " si scrie teste automate folosind " 
				+ tester.getLimbajProgramare()  );
		
		
	}

}
