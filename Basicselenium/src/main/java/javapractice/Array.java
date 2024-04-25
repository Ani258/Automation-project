package javapractice;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String[][] names= { {"mr" ,"Mrs" ,"Ms" }, {"Smith","jones"} };
       System.out.println(names[0][2] + names[1][1]);
        
       String s1="abc";
       String s2=new String("abc");
       if(s1==s2) {
    	   System.out.println("1");
       }
       else if(s1.equals(s2)){
    	   System.out.println("2");
       }
       else {
    	   System.out.println("3");
       }

	}

}
