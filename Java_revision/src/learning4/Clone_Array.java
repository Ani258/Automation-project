package learning4;

public class Clone_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={33,3,4,5};  
		System.out.println("Printing original array:");  
		for(int i:arr)  
		System.out.println(i);  
		  
		System.out.println("Printing clone of the array:");  
		int carr[]=arr.clone();  
		for(int i:carr)  
		System.out.println(i);  
		  
		System.out.println("Are both equal?");  
		System.out.println(arr==carr);  
		  
		} 

	}

