package day_03;

public class Alternate_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int arr[]= {11,12,13,14,15};
    
          for(int i=1;i<arr.length;i+=2) {
        	  System.out.println(arr[i]);
          }
          System.out.println("*****");
          int z=1;
          for(int j=5;j<=50;j+=5) {
        	  System.out.println("5"+"*"+z+"="+j);
        	  z++;
          }
	}

	}

