package day_03;

public class Reverse {
	
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Welcome to java";
		   String reverse=" ";
	     for(int i=0;i<a.length();i++) {
	   	  reverse=a.charAt(i)+reverse; 
	     }                                                        //reversedStr = 'w' + "" = "w "  i=0
	     System.out.println("A String Reverse is:"+reverse);     //reversedstr = 'e' + "w " = "ew " i=1
	}   

/*	for(int i=a.length()-1;i>=0;i--) {
		reverse= reverse + a.charAt(i) ;
		} 
	System.out.println(reverse);
	}  */
	

}
