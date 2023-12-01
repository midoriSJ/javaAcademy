package day19;
import javax.swing.JOptionPane;

public class IOBlocking {

	public static void main(String[] args) {
		/*
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.getMessage();
			}
		}
		*/
		
		ThreadEx1 th1 = new ThreadEx1();
		ThreadEx2 th2 = new ThreadEx2();
		
		/*
		th1.setPriority(1);
		th2.setPriority(9);
		
		System.out.println("Priority of th1(-) >>> " + th1.getPriority());
		System.out.println("Priority of th2(|) >>> " + th2.getPriority());
		*/
		th1.start();
		th2.start();
		
		try {
			th1.sleep(2000);
		} catch (Exception e) {
			e.getMessage();
		}
		
		System.out.println("메인 스레드 종료");
	}

}

class ThreadEx1 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("-");
		}
		System.out.println("th1 종료");
	}
}

class ThreadEx2 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("|");
		}
		System.out.println("th2 종료");
	}
}