package day14;

public class Tire {
	public void roll() {
		System.out.println("일반 타이어가 굴러갑니다.");
	}
}

class Car {
	
	private Tire t1 = new Tire();
	
	private Tire t2 = new Tire() {
		public void roll() {
			System.out.println("익명 자식 객체1이 굴러갑니다.");
		}
	};
	
	public void run1() {
		t1.roll();
		t2.roll();
	}
	
	public void run2() {
		Tire t = new Tire() {
			public void roll() {
				System.out.println("익명 자식 객체2가 굴러갑니다.");
			}
		};
		
		t.roll();
	}
	
	public void run3(Tire t) {
		t.roll();
	}
	
}