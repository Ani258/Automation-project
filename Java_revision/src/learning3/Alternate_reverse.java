package learning3;

public class Alternate_reverse {
	
	public static String reverse(String s)
	{
		String [] b=s.split(" ");
		int count=0;
		String rev=" ";
		
		for(String f:b ){

			if(count%2==1) {
				char[] ch=f.toCharArray();
				for (int i = f.length() - 1; i >= 0; i--) {
					char cha = ch[i];
				rev=rev+cha;
			   }
			
				rev=rev+" ";
			}
			else {
			   rev=rev+f+" ";
			} 
		    count++;
		}
return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="welcome to java platform";
		     System.out.println(reverse(a));
         
		}
	}


