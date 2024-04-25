package revision;

import java.util.Scanner;

public class Day5_BinarySearch {
		 
		  public static void main(String[] args) {
		 
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the size of an array");
		    int n = sc.nextInt();
		 
		    int[] arr = new int[n];
		    System.out.println("Enter the values in a sorted order");
		   
		    for (int i = 0; i < n; i++) {
		        arr[i] = sc.nextInt();
		    }
		 
		    System.out.println("Enter value to be searched");
		    int num = sc.nextInt();
		 
		    int low = 0;
		    int high = n - 1;
		    int mid = 0;
		 
		     while (low <= high) {
		
		        mid = (low + high) / 2; 
		       if (arr[mid] == num) { 
		          System.out.print("Value found at the index " + mid); 
		          break; 
		 
		       } else if (arr[mid] > num) {
		          high = mid - 1;
		 
		       } else if (num > arr[mid]) {
		         low = mid + 1; 
		       }
		   }
		  if (low > high) {
		      System.out.println("Value is not found in an array ");
		   }
     }
   }


