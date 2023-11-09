package day11;

public class java_20231109 {

	public static void main(String[] args) {
		/*
		// 클래스의 강제 타입 변환
		
		// 자식 클래스 < 부모 클래스 : 자동 형변환 -> 부모를 맞춰야 하다보니 손실 발생
		// 강제타입 타입 : 내타입 (자식형)
		
		FireEngine f = new FireEngine(); // 자식 객체
		Car c = new Car();
		Car c2 = f;
		Car c_ = null;	// 부모형 타입 객체는 생성하지 않았다.
		
		c_ = f;	// 부모의 형 타입이고 자식의 객체를 생성한 경우
		f = (FireEngine) c_;	// 자식의 객체로 형 변환 가능
		f.drive();
		f.water();
		*/
		
		/*
		Buyer b = new Buyer();
		Audio a = new Audio(100);
		Tv tv = new Tv(100);
		Computer c = new Computer(200);
		Nintendo n = new Nintendo(50);
		b.buy(c);
		b.buy(tv);
		*/
		
		/*
		// 추상 클래스 : abstract
		// Receipe r = new Receipe("백종원");	// 미완성 클래스는 객체 생성 허용 x
		
		PastaReceipe pr = new PastaReceipe("백종원");
		pr.info();
		pr.makeSauce();
		pr.cookingPlay();
		*/
		
		AudioPlayer ap = new AudioPlayer();
		ap.play(10);
		ap.stop();
	}

}

abstract class Player {
	
	abstract void play(int pos);
	abstract void stop();
}

class AudioPlayer extends Player {
	@Override
	void play(int pos) {
		System.out.println(pos + "번 트랙을 재생합니다.");
	}
	
	@Override
	void stop() {
		System.out.println("오디오를 정지합니다.");
	}
	
}

class PastaReceipe extends Receipe{
	PastaReceipe(String chef){
		super(chef);
	}
	
	void makeSauce() {
		System.out.println("파스타 소스를 직접 만든다.");
	}
	@Override
	void cookingPlay() {
		System.out.println("파스타 요리를 진행합니다.");
	}
}

class SteakReceipe extends Receipe{
	SteakReceipe(String chef){
		super(chef);
	}
	@Override
	void cookingPlay() {
		System.out.println("스테이크 요리를 진행합니다.");
	}
}

abstract class Receipe {	// 추상 클래스
	String chef;	// 인스턴스 변수
	Receipe(String chef){
		this.chef = chef;
	}
	
	void info() {	// 인스턴스 메서드
		System.out.println("이 레시피는 " + chef + " 셰프님의 레시피입니다.");
	}
	
	abstract void cookingPlay();	// 추상 메서드
}

class Product {
	int price;
	int bonusPoint;
	Product(int price){
		this.price = price;
		this.bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product {
	Tv(int price){
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer(int price){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio(int price){
		super(100);
	}
	public String toString() {
		return "Audio";
	}
}

class Nintendo extends Product {
	Nintendo(int price){
		super(50);
	}
	public String toString() {
		return "Nintendo";
	}
}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔고가 부족합니다!");
		}
		else {
			money -= p.price;
			bonusPoint += p.bonusPoint;
			System.out.println(p.toString() + " 구매 완료했습니다!");
			System.out.println(money + "만 원 남았습니다.");
			System.out.println("포인트 " + bonusPoint + "만 점 적립되었습니다.");
		}
	}
}

class Car { // 부모 클래스
	String color;
	int door;
	void drive() {
		System.out.println("드라이브 중입니다.");
	}
}

// 자식 클래스 : 소방차
class FireEngine extends Car {
	void water() {
		System.out.println("water");
	}
}

// 자식 클래스 : 엠뷸런스
class Ambulance extends Car {
	
}
