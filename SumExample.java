package day13;

class Calculator {	// 외부 계산기 : 외부 클래스
	// private : 지역적인 접근 제한자
	
	private int val1;
	private int val2;	// 이항 연산자 : val1 + val2
	// static int val3;	// JDK17 이상 버전부터 가능하다!
	
	// 기본 생성자 : 초기값 대입해서 만들어준다.
	Calculator(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}
	
	class Calc {	// 내부 계산기 : 더하기 버튼 : 하나의 기능
		public int add() {
			return val1 + val2;
		}
	}
	
}


public class SumExample {

	public static void main(String[] args) {
		// 인스턴스 멤버 클래스를 활용한 계산기를 만든다.
		// 외부 클래스가 먼저 생성된다.
		Calculator c = new Calculator(10, 11);
		// 내부 클래스가 선언되면서 호출될 수 있다.
		Calculator.Calc c1 = c.new Calc();
		System.out.println("합 : " + c1.add());
	}

}
