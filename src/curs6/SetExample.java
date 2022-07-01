package curs6;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {

		Set<String> set =  new HashSet<>();
		
		System.out.println(set.size());
		
		set.add("rosu");
		System.out.println(set.isEmpty());
		
		set.add("alb");
		set.add("negru");
		set.add("galben");

		for(String culoare : set) {
			
			System.out.println(culoare);
		}
		System.out.println("---------------------");
		set.add("maro");

		for(String culoare : set) {
			
			System.out.println(culoare);
	}
		System.out.println("---------------------");
		System.out.println("---------------------");

		set.remove("maro");
		for(String culoare : set) {
			
			System.out.println(culoare);
	}
		System.out.println("---------------------");
		System.out.println("---------------------");
		
		
		System.out.println(set.contains("negru"));
		
		System.out.println("---------------------");
		set.clear();
		for(String culoare : set) {
			
			System.out.println(culoare);
	}
	}
}
