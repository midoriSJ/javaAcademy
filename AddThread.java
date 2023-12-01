package day19;

public class AddThread implements Runnable {

	private Bank b = new Bank();
	private String name;
	public AddThread(String name, Bank b) {
		this.name = name;
		this.b = b;
	}
	
	@Override
	public void run() {
		synchronized(b){
			try {
				for(int i = 0; i < 10; i++) {
					Thread.sleep(1000);
					b.addMoney(1000);
					System.out.println(this.name + " 통장 잔고 >>> " + b.getMoney());
				}
			} catch (Exception e) {
				e.getMessage();
			}
		}
	}
	
}
