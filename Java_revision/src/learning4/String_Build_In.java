package learning4;

public class String_Build_In {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		 String s =" Some String ";
         System.out.println(s.toUpperCase());
         System.out.println(s.toLowerCase());
         System.out.println(s.trim());
         System.out.println(s.startsWith(" So"));
         System.out.println(s.endsWith("g "));
         System.out.println(s.charAt(4));
         System.out.println(s.length());
         System.out.println(s.valueOf(1));      // print 1 bt it's a string not an integer
         System.out.println(s.intern());
         System.out.println(s.replace('o','a'));
         System.out.println(s);
	}

}
