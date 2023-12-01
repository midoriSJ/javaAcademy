package day19;

public class BankThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank();
		
		Thread th1 = new Thread(new AddThread("1번 스레드", b));
		Thread th2 = new Thread(new AddThread("2번 스레드", b));
		th1.start();
		th2.start();
		
		
		
	}

}
