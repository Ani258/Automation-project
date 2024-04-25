package learning3;

import java.util.Scanner;

public class ClassExample {
	
	int id=109876;
	String name="anitha";
	Scanner sc=new Scanner(System.in);

	public static void main(word_letter[] args) {
		// creating an object
		ClassExample s=new ClassExample();
		System.out.println(s.id);
		System.out.println(s.name);
		// access non-static to static
		int i=s.sc.nextInt();
		System.out.println(i);
		
	}

}
