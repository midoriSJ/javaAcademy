package day08;


// 실행용 클래스 : main 메서드를 포함한 클래스
// 파일을 생성하면 만들어진다.
// 프로그램 실행을 맡고 있는 클래스이다.
public class java_20231102 {

	public static void main(String[] args) {
		
		// 클래스 선언
		/*
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		Tree t1 = new Tree();
		t1.leaf = "red";
		Tree t2 = new Tree();
		*/
		
		/*
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		
		tv1.channel = 7;
		tv1.channelDown();
		System.out.print("Tv1 현재 채널은 ");
		System.out.println(tv1.channel + "입니다.");
		System.out.print("Tv2 현재 채널은 ");
		System.out.println(tv2.channel + "입니다.");
		
		tv2 = tv1;
		System.out.println(tv2.channel);
		
		// 외부파일 class 설계도를 이용한 객체 생성
		Car_option cop = new Car_option();
		cop.ride();
		cop.ride();
		cop.ride();
		cop.ride();
		cop.ride();
		*/
		
		/*
		System.out.print("Card.width = ");
		System.out.println(Card.width);
		System.out.print("Card.height = ");
		System.out.println(Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.printf("c1 shape : %s, c1 number : %d, c1 area = %d, %d\n", c1.kind, c1.number, c1.width, c1.height);
		System.out.printf("c2 shape : %s, c2 number : %d, c2 area = %d, %d\n", c2.kind, c2.number, c2.width, c2.height);
		c1.width = 50;
		c1.height = 80;
		System.out.printf("c1 shape : %s, c1 number : %d, c1 area = %d, %d\n", c1.kind, c1.number, c1.width, c1.height);
		
		
		printHello();	// 객체도 아니고 함수(클래스가 호출될 때 데이터 영역에 들어간다)
		*/
		
		Jogger jg = new Jogger();
		
		jg.name = "SeoJun";
		jg.run();
		jg.sayName();
		jg.printGB();
		
		int money = 10000;
		Bus bus = new Bus();
		bus.take(money);
	}
	
	
	static void printHello() {	// 정적 메서드 (클래스가 실행될 때 메모리에 메서드가 올라간다.)
		System.out.println("Hello World!");
	}
}

// 라이브러리 클래스 : 실행용 클래스는 항상 1개이면서 별도로 만들어진 클래스

class Bus{
	void take(int m) {
		while(true) {
			if(m < 3000) {
				System.out.println("교통카드를 충전하러 갑니다.");
				return;
			}
			System.out.println("버스를 탑니다.");
			m -= 1250;
		}
	}
}


class Jogger{
	String name;
	void run() {
		System.out.println("I'm running!");
	}
	void sayName() {
		System.out.print("My name is ");
		System.out.println(name);
	}
	
	static void printGB() {
		System.out.println("Good Bye!");
	}
}

class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}



class Car {
	
}

class Tree {
	String leaf = "green";
}

class Tv {
	String color;
	boolean power;
	int channel;
	int volume;
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}