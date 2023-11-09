package day11;

public class java_20231109 {

	public static void main(String[] args) {
		/*
		// Ŭ������ ���� Ÿ�� ��ȯ
		
		// �ڽ� Ŭ���� < �θ� Ŭ���� : �ڵ� ����ȯ -> �θ� ����� �ϴٺ��� �ս� �߻�
		// ����Ÿ�� Ÿ�� : ��Ÿ�� (�ڽ���)
		
		FireEngine f = new FireEngine(); // �ڽ� ��ü
		Car c = new Car();
		Car c2 = f;
		Car c_ = null;	// �θ��� Ÿ�� ��ü�� �������� �ʾҴ�.
		
		c_ = f;	// �θ��� �� Ÿ���̰� �ڽ��� ��ü�� ������ ���
		f = (FireEngine) c_;	// �ڽ��� ��ü�� �� ��ȯ ����
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
		// �߻� Ŭ���� : abstract
		// Receipe r = new Receipe("������");	// �̿ϼ� Ŭ������ ��ü ���� ��� x
		
		PastaReceipe pr = new PastaReceipe("������");
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
		System.out.println(pos + "�� Ʈ���� ����մϴ�.");
	}
	
	@Override
	void stop() {
		System.out.println("������� �����մϴ�.");
	}
	
}

class PastaReceipe extends Receipe{
	PastaReceipe(String chef){
		super(chef);
	}
	
	void makeSauce() {
		System.out.println("�Ľ�Ÿ �ҽ��� ���� �����.");
	}
	@Override
	void cookingPlay() {
		System.out.println("�Ľ�Ÿ �丮�� �����մϴ�.");
	}
}

class SteakReceipe extends Receipe{
	SteakReceipe(String chef){
		super(chef);
	}
	@Override
	void cookingPlay() {
		System.out.println("������ũ �丮�� �����մϴ�.");
	}
}

abstract class Receipe {	// �߻� Ŭ����
	String chef;	// �ν��Ͻ� ����
	Receipe(String chef){
		this.chef = chef;
	}
	
	void info() {	// �ν��Ͻ� �޼���
		System.out.println("�� �����Ǵ� " + chef + " �������� �������Դϴ�.");
	}
	
	abstract void cookingPlay();	// �߻� �޼���
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
			System.out.println("�ܰ� �����մϴ�!");
		}
		else {
			money -= p.price;
			bonusPoint += p.bonusPoint;
			System.out.println(p.toString() + " ���� �Ϸ��߽��ϴ�!");
			System.out.println(money + "�� �� ���ҽ��ϴ�.");
			System.out.println("����Ʈ " + bonusPoint + "�� �� �����Ǿ����ϴ�.");
		}
	}
}

class Car { // �θ� Ŭ����
	String color;
	int door;
	void drive() {
		System.out.println("����̺� ���Դϴ�.");
	}
}

// �ڽ� Ŭ���� : �ҹ���
class FireEngine extends Car {
	void water() {
		System.out.println("water");
	}
}

// �ڽ� Ŭ���� : ���深��
class Ambulance extends Car {
	
}
