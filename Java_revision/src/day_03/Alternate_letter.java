package day_03;

public class Alternate_letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="selenium testing";
 
		String [] a=str.split(" ");
		char[] a1=a[0].toCharArray();
		char[] a2=a[1].toCharArray();
		if(a1.length==a2.length) {
		for(int i=0;i<a1.length;i++) {
			System.out.print(a1[i]);
			for(int j=i;j<=i;j++) {
	            System.out.print(a2[j]);
			}
		 
		}
		}
		else {
		}
		}
		
		
	}


