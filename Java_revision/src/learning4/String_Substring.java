package learning4;

import java.util.Arrays;

public class String_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This class is too boring";
		System.out.println(s.substring(5));    //using startindex
		System.out.println(s.substring(14,21));  //startindex,endindex
		
		String s1="Hi;How Are You;Are You Okay";  //using split method
		String[] sen=s1.split(";");
		System.out.println(Arrays.toString(sen));  //print string in array
		

	}

}
 