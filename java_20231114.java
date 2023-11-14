package day12;

public class java_20231114 {

	public static void main(String[] args) {
		
		/*
		Buyer buyer = new Buyer();
		buyer.buy(new Video());
		buyer.buy(new Audio());
		*/
		
		/*
		Fighter f = new Fighter();
		f.move(100, 200);
		
		Unit2 f2 = new Fighter();
		// f2.attack();
		Fightable f3 = new Fighter();
		f3.attack(new Fighter());
		// f3.x;
		Fightable nf = f.getFightable();
		*/
		
		/*
		BluetoothMic b = new BluetoothMic();
		b.music();
		b.sing();
		*/
		
		TJmic t = new TJmic();
		t.connect();
		t.music();
		t.sing();
		
	}

}



interface Microphone {
	abstract void sing();
}

interface Speaker {
	abstract void music();
}


interface BluetoothMIC extends Microphone, Speaker {
	abstract void connect();
}

class TJmic implements BluetoothMIC {
	
	public void sing() {
		System.out.println("마이크에 대고 노래를 부릅니다.");
	}
	
	public void music() {
		System.out.println("마이크에 장착된 스피커로 반주가 나옵니다.");
	}
	
	public void connect() {
		System.out.println("마이크를 연결합니다.");
	}
}


class BluetoothMic implements Microphone, Speaker {
	
	public void sing() {
		System.out.println("마이크에 대고 노래를 부릅니다.");
	}
	
	public void music() {
		System.out.println("마이크에 장착된 스피커로 반주가 나옵니다.");
	}
}

abstract class Unit2 {
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("멈춥니다.");
	}
}

interface Fightable {
	public void move(int x, int y);
	public void attack(Fightable f);
}

class Fighter extends Unit2 implements Fightable {
	
	public void move(int x, int y) {
		System.out.println("[" + x + "," + y + "]로 이동");
	}
	
	public void attack(Fightable f) {
		System.out.println(f + "를 공격");
	}
	
	// Fightable f = new Fighter();
	Fightable getFightable() {
		Fighter f = new Fighter();
		return f;
		
	}
}


class Buyer {
	void buy(Product p) {
		System.out.println(p);
	}
}


class Product {
	
	Product(){
		
	}
}

class Video extends Product {
	
	public String toString() {
		return "Video";
	}
	
}

class Audio extends Product {
	
	public String toString() {
		return "Audio";
	}
}
