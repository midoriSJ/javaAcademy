package day08;


// ����� Ŭ���� : main �޼��带 ������ Ŭ����
// ������ �����ϸ� ���������.
// ���α׷� ������ �ð� �ִ� Ŭ�����̴�.
public class java_20231102 {

	public static void main(String[] args) {
		
		// Ŭ���� ����
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
		System.out.print("Tv1 ���� ä���� ");
		System.out.println(tv1.channel + "�Դϴ�.");
		System.out.print("Tv2 ���� ä���� ");
		System.out.println(tv2.channel + "�Դϴ�.");
		
		tv2 = tv1;
		System.out.println(tv2.channel);
		
		// �ܺ����� class ���赵�� �̿��� ��ü ����
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
		
		
		printHello();	// ��ü�� �ƴϰ� �Լ�(Ŭ������ ȣ��� �� ������ ������ ����)
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
	
	
	static void printHello() {	// ���� �޼��� (Ŭ������ ����� �� �޸𸮿� �޼��尡 �ö󰣴�.)
		System.out.println("Hello World!");
	}
}

// ���̺귯�� Ŭ���� : ����� Ŭ������ �׻� 1���̸鼭 ������ ������� Ŭ����

class Bus{
	void take(int m) {
		while(true) {
			if(m < 3000) {
				System.out.println("����ī�带 �����Ϸ� ���ϴ�.");
				return;
			}
			System.out.println("������ ž�ϴ�.");
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