package day_03;

public class largest_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {14,7,8,34,25};
       int max=arr[0];
       for(int i=0;i<arr.length;i++) {
    	  if(arr[i]>max) {
    		  max=arr[i];
    		   }
    	   }
       System.out.println(max);
       }
	}


