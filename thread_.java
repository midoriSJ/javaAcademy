package day19;

class WhiteFlag implements Runnable{

	@Override
	public void run() {
		
		while (true) {
			System.out.println("백기 올려");
		}
		
	}
	
}

class MyTask extends Thread implements Runnable {
	public MyTask() {
		setName("my-Task-1");
	}
	
	public void run() {
		String threadname = Thread.currentThread().getName();
		while (true) {
			System.out.println(threadname);
		}
	}
	
}

public class thread_ {

	public static void main(String[] args) {
		
		Thread write = new Thread(new WhiteFlag());
		write.start();
		
		Runnable bf = () -> {
			while (true) {
				System.out.println("청기 올려");
			}
		};
		
		Thread wf = new Thread(bf);
		
		
		Thread mt = new Thread(new MyTask());
		mt.start();
	}

}
