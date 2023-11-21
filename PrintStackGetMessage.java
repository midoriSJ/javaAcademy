package day15;

public class PrintStackGetMessage {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		System.out.println(3);
		
		
		try {
			System.out.println(0/0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("예외 메세지 : " + e.getMessage());
		}
		
		System.out.println(6);
		
	}

}
