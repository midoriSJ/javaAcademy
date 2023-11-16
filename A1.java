package day13;

public class A1 {	// 외부 클래스
	int filed;
	B filed2;
	
	class B {	// 내부 클래스
		
		B() {	// 내부 클래스 생성자
			
		}
		
		void method() {
			System.out.println("methodB() 실행");
		}
	}
	
	A1() {	// 외부 클래스 생성자
		B b = new B();
		b.method();
		
	}
	
	void methodA() {
		B b = new B();
		b.method();
	}
}
