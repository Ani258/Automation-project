package day_03;

public class Vowel_Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="anitha";
		char c[]=a.toCharArray();
		for(int i=0;i<c.length;i++) {
		if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u') 
		{
			c[i]='*';
		}
		}
		System.out.println(c);
	}

}

/*	char[] ch = { 'a', 'e', 'i', 'o', 'u' };
for (int i = 0; i <= c.length; i++) {
	for (int j = 0; j <= ch.length; j++) {
		if (i == j) {
			System.out.println(a.replace(c,'*'));
		}

	} */