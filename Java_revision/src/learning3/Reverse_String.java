package learning3;

public class Reverse_String { 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Welcome to java";
       String reverse=" ";
          for(int i=0;i<a.length();i++) {
        	  reverse= a.charAt(i)+reverse ;                      //reversedStr = 'w' + "" = "w"  i=0
                                                                  //reversedstr = 'e' + "w" = "e" i=1
	}   
          System.out.println(reverse);
	/*	for(i=a.length()-1;i>=0;i--) {
			System.out.println(a.charAt(i));
		}  */
		
	}
	
	
}
