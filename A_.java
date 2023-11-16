package day13;

public class A_ {

	public static void main(String[] args) {
		
		/*
		// 외부 객체 선언
		A1 a = new A1();
		a.filed = 10;
		
		// 내부 객체 선언
		A1.B b = a.new B();
		
		// 외부 클래스에서 메서드를 활용 -> B 클래스의 methodB를 호출
		a.methodA();	// B 클래스의 메서드 호출
		b.method();
		
		// 독립적으로 가능하다.
		A2.B2 b2 = new A2.B2();	// 객체를 생성하지 않아도 B 객체를 생성 가능
		
		// A 객체를 생성하지 않아도 B 객체를 생성 가능하다
		
		A3.B3 b3 = new A3.B3();
		b3.methodB();	// 독립적이라서 직접 객체를 생성하고 메서드를 호출할 수 있다.
		*/
		
		
		/*
		//PrintOut 외부 클래스 안의 Out 내부 클래스를 직접적으로 호출한다.
		String str = "정적 내부 클래스 테스트";
		
		// 외부 객체 선언하고 인스턴스를 활용해서 메서드를 호출한다.
		PrintOut.Out po = new PrintOut.Out();
		po.println(str);	// 내부 클래스 메서드를 직접적으로 호출할 수 있었다.
		*/
		
		/*
		A4 a = new A4();
		a.UseB(3);
		*/
		
		/*
		A5 a = new A5();
		a.method1();
		*/
		
		PermitExample pe = new PermitExample();
		pe.getInClass();
		// pe.ic.print();
	}

}

class PrintOut {	// 외부 클래스
	
	// 정적 내부 클래스 선언
	static class Out {
		
		// 메서드 활용
		void println(String str) {	// str 매개변수 받아서 출력한다.
			System.out.println(str);
		}
	}
}

// 2. 멤버 클래스 접근 제한자(private)
// 내부 클래스 private 써서 외부 클래스의 메서드를 통해서 클래스 접근할 수 있게 만든다.

class PermitExample {	// 외부 클래스
	
	// public > default > protected > private
	private class InClass {	// private : 내부 클래스를 통해서 접근 가능
		public void print() {
			System.out.println("접근을 private로 제한합니다.");
		}
	}
	
	// 외부 클래스에 public 이라는 method를 만들어서 InClass.print() 메서드를 접근한다.
	public InClass getInClass() {	// InClass 리턴값 = 객체(다형성)
		return new InClass();
	}
	InClass ic = new InClass();
	
}










