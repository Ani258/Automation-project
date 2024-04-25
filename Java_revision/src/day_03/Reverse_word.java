package day_03;

public class Reverse_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="selenium java program";
		String b[]=a.split(" ");
		String s=" ";
		for(int i=0;i<b.length;i++) {
			s=b[i]+s;
		}
		System.out.println(s);  
	}
}
