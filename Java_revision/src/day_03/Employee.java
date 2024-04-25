package day_03;

import java.util.Scanner;

public class Employee {
	
		  String n,id,gd,loc;
		  int pay;
  public void getData()
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Name:");
	  n=sc.nextLine();
	  System.out.println("Enter Id:");
	  id=sc.nextLine();
	  System.out.println("Enter Grade:");
	  gd=sc.nextLine();
	  System.out.println("Enter Location:");
	  loc=sc.nextLine();
	  System.out.println("Enter Pay:");
	  pay=sc.nextInt();
  }
  public void printData( ) {
	  
	    System.out.println("Enter Name:"+n);
	    System.out.println("Enter Id:"+id);
	    System.out.println("Enter Grade:"+gd);
	    System.out.println("Enter Pay:"+pay);
	    System.out.println("Enter Location:"+loc);

	}

}
