package day_03;

public class Alternate_ReverseString {

       public static String reverse(String a)	 {
          
          String[] b=a.split(" ");
          int count=0;
          String rev=" ";
          for(int i=0;i<b.length;i++) {
        	  String f=b[i];
        	 if(count%2==1) {
        		 char[] ch=f.toCharArray();
        		 for(int j=ch.length-1;j>=0;j--) {
        			 char cha=ch[j];
        		 rev = rev+cha;
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
          public static  void main(String[] args) {
        	  String a="Selenium is a automation tool";
        	  System.out.println(reverse(a));
          }
	}

