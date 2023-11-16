package day13;

// 외부 클래스 static method 안에서 내부 클래스 객체 생성하기

public class A3 {
	// 정적 멤버 클래스
	private int val;	// 인스턴스 변수
	private static int cnt = 1;	// 정적 변수
	
	
	// A 객체와 상관 있으며 static을 사용하면 안된다.
	
	static class B3 {
		// int val2 = val;	// 인스턴스 멤버 변수는 정적 내부 클래스가 사용 불가
		int cnt2 = cnt;	// 정적 변수 사용 가능
		void methodB() {
			System.out.println("methodB() 실행");
		}
	}
	
	// 인스턴스 필드 값으로 B 객체 대입
	B3 field1 = new B3();
	// 정적 필드 값으로 B 객체 대입
	static B3 field2 = new B3();
	
	// 생성자 가능
	A3() {
		B3 field1 = new B3();
	}
	
	// 인스턴스 메서드 가능
	void method1() {
		B3 field1 = new B3();	// 외부 클래스 A3를 통해서 정적 메서드를 활용한 B3 내부 클래스 접근 가능
	}
	
	// 정적 메서드 가능
	static void method2() {
		B3 field1 = new B3();	// 외부 클래스 A3를 통해서 정적 메서드를 활용한 B3 내부 클래스 접근 가능
	}
	
	
}
