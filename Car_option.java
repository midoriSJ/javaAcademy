package day08;

public class Car_option {
	int wheel_gold = 4;
	
	Car_option(){
		System.out.println("기본 생성자 호출됩니다.");
		this.wheel_gold = 0;
	}
	
	void ride() {
		System.out.println("달립니다.");
	}
}
