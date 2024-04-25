package day_03;

public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=67542;                        //n=12               n=1
		int reverse=0;                      //rem=12%10=2        rem=1%10=1
		while(n!=0) {                       //rev=0*10+2=2       rev=2*10+1=21
		int remainder=n%10;                 //n=12/10=1          n=1/10 =0
		reverse=reverse*10+remainder;
		n=n/10;
		}
		System.out.println(reverse);
	}
	
	}


