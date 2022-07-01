package curs6;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		
		List<String> lista =  new ArrayList<>();
	  //ArrayList<String> lista =  new ArrayList<>();
		
		
		//marimea listei
		System.out.println(lista.size());
		//array[0] = valoare
		lista.add("Oana");
		lista.add("Ion");
		lista.add("Maria");
		lista.add("Ioana");
		lista.add("George");
		System.out.println(lista.size());

		for(String nume : lista) {
			System.out.println(nume);
		}
		
		System.out.println("------------------------");
		
		for(String nume : lista) {
			
			System.out.println(lista.indexOf(nume) + " : "+ nume);
		}
		//array[1] = valoare_noua --> in cazul array o suprascrie daca exista
	
		lista.add(0, "Alina");
	System.out.println("------------------------");
		
		for(String nume : lista) {
			
			System.out.println(lista.indexOf(nume) + " : "+ nume);
		}
		
		//update value
		lista.set(0, "Bogdan");
	System.out.println("------------------------");
		
		for(String nume : lista) {
			
			System.out.println(lista.indexOf(nume) + " : "+ nume);
		}
		
		//remove by index
		lista.remove(0);
		//remove by value
		lista.remove("Ion");
	System.out.println("------------------------");
		
		for(String nume : lista) {
			
			System.out.println(lista.indexOf(nume) + " : "+ nume);
		}
		System.out.println("------------------------");
		//remove all objects from list
		lista.clear();
		for(String nume : lista) {
			
			System.out.println(lista.indexOf(nume) + " : "+ nume);
		}
	}

}
