package curs5;

public class ArrayExample3 {
	
	
	int[] numbers  = {3, 4, 5, 8, 7, 9};
	
	/*
	 * 
	 * vreau sa aflam indexul unui nr
	 * Exemplu : index pentru element 8 este 3
	 * rezolvam cu FOR
	 * rezolvam cu FOR EACH
	 * rezolvam cu WHILE
	 * 
	 */
	

	public static void main(String[] args) {

		ArrayExample3 obj = new ArrayExample3();
		obj.rezolvareCuFor(9);
		obj.rezolvareCuForEach(9);
		
	}
	
	public void rezolvareCuFor( int element) {
		
		for(int i =0; i<numbers.length; i++) {
			
			if(numbers[i] == element) {
				System.out.println("index pentru " + element + " este " + i );
			}		
		}	
	}
	
	public void rezolvareCuForEach(int element) {
		int i = 0;
		for(int nr : numbers) {
			
			if(nr == element) {
				System.out.println("index pentru " + element +" este " + i );
			}
			i++;
		}
		
		
	}
	

}
