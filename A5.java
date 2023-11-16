package day13;

public class A5 {
	
	// 문제 1 : 외부 클래스의 멤버 접근 제한 : 정적 / 인스턴스 비교
	// 인스턴스 필드 메서드
	int field1;
	void method1() {
		System.out.println("method1() 호출");
	}
	// 정적 필드 메서드
	static int field2;
	static void method2() {
		System.out.println("method2() 호출");
	}
	
	class B {	// 인스턴스 멤버 클래스 : 인스턴스 정적 필드와 메서드 모두 허용 (R / W)
		
		// 메서드 호출
		void method() {
			// A5 인스턴스 필드 메서드
			field1 = 10;
			method1();
			// A5 정적 필드 메서드
			field2 = 20;
			method2();
		}
	}
	
	static class C {	// 정적 멤버 클래스
		
		// 메서드 호출
		void method() {
			// A5 인스턴스 필드 메서드 허용하지 않는다.
			// field1 = 10;
			// method1();
			// A5 정적 필드 메서드
			field2 = 20;
			method2();
			
			
		}
	}
}
