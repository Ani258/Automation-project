package day_03;

public class Magic_Number {
	public static void main(String[] args) {
	int n=143;
	int sum=0;
	while(n>0||sum>9) {
		if(n==0) {
			n=sum;
			sum=0;
		}else {
			sum+=n%10;                 //n%10 t o find last digit
			n=n/10;	                   //to remove last digit
		}
	}
	if(sum==1) {
		System.out.println("magic number is"+sum);                     
	}else {
	 System.out.println("n is not magic"+" "+sum);
	}
}
}
