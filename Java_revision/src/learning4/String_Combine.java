package learning4;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class String_Combine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="string";
	    String s2="addition";
	    
	    System.out.println(s1+" "+s2);   //using + operator
	    
	    System.out.println(s1.concat(" "+s2));   //concat method
	    
	    System.out.println(String.format("%s %s",s1,s2));     //format method
	    
	    System.out.println(String.join(",",s1,s2));    //join method
	    
	    StringBuilder str1=new StringBuilder("string");
	    StringBuilder str2=new StringBuilder("addition");   
	    System.out.println(str1.append(" "+str2));         //stringbuilder class
	    
	    StringJoiner sj1=new StringJoiner(" ");
	    System.out.println(sj1.add("java").add("class"));   //stringjoiner class
	    
	    List<String> lst=Arrays.asList("java","calss","string");
	    System.out.println(lst.stream().collect(Collectors.joining(" ")));   //collectors.joining method

	}

}
