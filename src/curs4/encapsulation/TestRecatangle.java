package curs4.encapsulation;

public class TestRecatangle {

	public static void main(String[] args) {
		
		Rectangle obj = new Rectangle(5, 5);
		
		Rectangle obj2 = new Rectangle(0, 0);
		
		//obj.length = 5;
		//obj.width = 0;
		
		//obj.setLength(5);
		//obj.setWidth(3);
		
		
		System.out.println(obj.calculateArea());
		
	}

}
