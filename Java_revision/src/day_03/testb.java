package day_03;

public class testb extends testa {
	public void start() {
		System.out.println("testb");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ((testa)new testb()).start();
	}

}
