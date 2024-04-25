package revision;

import java.util.Scanner;

public class Day2_Traffic_signal {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Colour:");
		String colour=sc.next();
		switch(colour)
		{
		case"red":
			System.out.println("Stop");
			break;
		case"orange":
			System.out.println("Ready to Go");
			break;
		case"green":
			System.out.println("Go");
			break;
		}
	}
}
