package day14;

public class ArothmeticExceptionExample {

	public static void main(String[] args) {
		int result = 0;
		
		try {
			result = 10 / 0;
		}catch (Exception e) {
			e.toString();
			System.out.println(e);
			System.out.println("0으로 나눌 수 없습니다.");
		} finally {
			System.out.println("프로그램 종료");
		}
	}

}
