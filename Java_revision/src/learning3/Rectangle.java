package learning3;

public class Rectangle {

	public static void main(word_letter[] args) {
		
		Rectangle_Pair rec1 = new Rectangle_Pair(),rec2=new Rectangle_Pair();
		double l1,l2,w1,w2;
		System.out.println("Enter the first rectangle dimensions :");
		l1=rec1.sc.nextDouble();
		w1=rec1.sc.nextDouble();
		System.out.println("Enter the second rectangle dimensions :");
		l2=rec1.sc.nextDouble();
		w2=rec1.sc.nextDouble();
		rec2.insertValue(l2, w2);
		rec1.insertValue(l1, w1);
		System.out.println(rec1.calulate());
		System.out.println(rec2.calulate());

	}

}
