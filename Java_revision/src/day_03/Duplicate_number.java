package day_03;

public class Duplicate_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 7, 3, 18, 10, 15, 7, 18 };
		for (int i = 0; i < a.length; i++) {
			for (int j =i+1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);
				}

			}
		}
	}

}
