package day10;
// import day09.Mouse;

public class java_20231107 {

	public static void main(String[] args) {
		/*
		Samsung s = new Samsung();
		Computer c = new Computer();
		s.powerOn();
		s.powerOff();
		c.powerOn();
		c.powerOff();
		System.out.println("��ǻ�� �̸� : " + c.getName());
		Mouse_ m = new Mouse_();
		Mouse m2 = new Mouse();
		m2.getName();
		*/
		
		/*
		Comic c = new Comic("�ָӴ� ����", "�̻�", true);
		c.info_title();
		c.info_author();
		c.info_color();
		*/
		
		/*
		DeskCalendar dc = new DeskCalendar("�����", 6);
		dc.info();
		dc.hanging();
		dc.onTheDesk();
		
		System.out.println();
		
		Calendar c = new DeskCalendar("�����", 6);
		c.info();
		c.hanging();
		// c.onTheDesk(); -> ���� �� ���� �߻�
		*/
		
		Car c1 = new SchoolBus(); // ����
		
		Bus b1 = new Bus(); // ����
		Bus b2 = new SchoolBus(); // ����
		
		Car c2 = new OpenCar(); // ����
		OpenCar oc = new SportsCar(); // ����
		// Bus b3 = new OpenCar(); -> �Ұ���
		// Bus b4 = new SportsCar(); -> �Ұ���
		
		// ������ ������ �θ� �ٸ��� �ڵ� ����ȯ�� ���� �ʴ´�.
		
		FireEngine f = new FireEngine();
		Car nc = new Car();
		Car nc2 = null;
		FireEngine f2 = (FireEngine) nc;
		Car nc3 = (Car) f;
	}

}

class Car{
	String color;
	int door;
	void drive() {
		System.out.println("����̺� ���Դϴ�.");
	}
	void stop() {
		System.out.println("����ϴ�.");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("water");
	}
}

class Bus extends Car{
	
}

class SchoolBus extends Bus{
	
}

class OpenCar extends Car{
	
}

class SportsCar extends OpenCar{
	
}



class Calendar{
	String color;
	int month;
	Calendar(String color, int month){
		this.color = color;
		this.month = month;
	}
	
	void info() {
		System.out.println(color + " �޷��� " + month + "������ �ֽ��ϴ�.");
	}
	
	void hanging() {
		System.out.println(color + " �޷��� ���� �� �� �ֽ��ϴ�. ");
	}
}

class DeskCalendar extends Calendar{
	DeskCalendar(String color,int month){
		super(color, month);
	}
	
	@Override
	void hanging() {
		System.out.println(color + " �޷��� ���� �ɱ� ���� ���� �߰��� �ʿ��մϴ�.");
	}
	
	void onTheDesk() {
		System.out.println(color + " �޷��� å�� ���� �� �ֽ��ϴ�.");
	}
}










class Book{
	String title;
	String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	final void info_title() {
		System.out.print("å�� ������ ");
		System.out.println(title + "�Դϴ�");
	}
	
	void info_author() {
		System.out.print("å�� ���ڴ� ");
		System.out.println(author + "�Դϴ�");
	}
}

class Comic extends Book{
	boolean isColor;
	Comic(String title, String author ,boolean isColor){
		super(title, author);
		this.isColor = isColor;
	}
	
	@Override
	void info_author() {
		System.out.print("�� ��ȭå�� ���ڴ� ");
		System.out.println(author + "�Դϴ�");
	}
	
	void info_color() {
		if(isColor) {
			System.out.println("�� ��ȭå�� �÷��Դϴ�.");
		}
		else {
			System.out.println("�� ��ȭå�� ����Դϴ�.");
		}
	}
}


class Computer{
	private String comname = "�Ѽ�";
	void powerOn() {
		System.out.println("������ �������ϴ�.");
	}
	String getName() {
		this.comname = "�θ���ǻ��";
		return this.comname;
	}
	void powerOff() {
		System.out.println("������ �������ϴ�.");
	}
	
}

class Samsung extends Computer{
	
	@Override
	void powerOn() {
		System.out.println("I love Samsung" + " ������ �������ϴ�.");
	}
	
}