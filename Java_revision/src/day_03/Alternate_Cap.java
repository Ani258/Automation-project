package day_03;

public class Alternate_Cap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="welcome";
		char[] ch=a.toCharArray();
		for(int i=0;i<ch.length;i++) {
			char cha=ch[i];
			if(i%2==0) {
			   System.out.print(Character.toUpperCase(cha));
			}
			else {
				System.out.print(Character.toLowerCase(cha));
			}
		}

	}

}
