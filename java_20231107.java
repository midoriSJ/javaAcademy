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
		System.out.println("컴퓨터 이름 : " + c.getName());
		Mouse_ m = new Mouse_();
		Mouse m2 = new Mouse();
		m2.getName();
		*/
		
		/*
		Comic c = new Comic("주머니 괴물", "미상", true);
		c.info_title();
		c.info_author();
		c.info_color();
		*/
		
		/*
		DeskCalendar dc = new DeskCalendar("보라색", 6);
		dc.info();
		dc.hanging();
		dc.onTheDesk();
		
		System.out.println();
		
		Calendar c = new DeskCalendar("보라색", 6);
		c.info();
		c.hanging();
		// c.onTheDesk(); -> 선언 시 오류 발생
		*/
		
		Car c1 = new SchoolBus(); // 가능
		
		Bus b1 = new Bus(); // 가능
		Bus b2 = new SchoolBus(); // 가능
		
		Car c2 = new OpenCar(); // 가능
		OpenCar oc = new SportsCar(); // 가능
		// Bus b3 = new OpenCar(); -> 불가능
		// Bus b4 = new SportsCar(); -> 불가능
		
		// 조상이 같더라도 부모가 다르면 자동 형변환이 되지 않는다.
		
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
		System.out.println("드라이브 중입니다.");
	}
	void stop() {
		System.out.println("멈춥니다.");
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
		System.out.println(color + " 달력은 " + month + "월까지 있습니다.");
	}
	
	void hanging() {
		System.out.println(color + " 달력은 벽에 걸 수 있습니다. ");
	}
}

class DeskCalendar extends Calendar{
	DeskCalendar(String color,int month){
		super(color, month);
	}
	
	@Override
	void hanging() {
		System.out.println(color + " 달력은 벽에 걸기 위해 고리가 추가로 필요합니다.");
	}
	
	void onTheDesk() {
		System.out.println(color + " 달력은 책상에 세울 수 있습니다.");
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
		System.out.print("책의 제목은 ");
		System.out.println(title + "입니다");
	}
	
	void info_author() {
		System.out.print("책의 저자는 ");
		System.out.println(author + "입니다");
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
		System.out.print("이 만화책의 저자는 ");
		System.out.println(author + "입니다");
	}
	
	void info_color() {
		if(isColor) {
			System.out.println("이 만화책은 컬러입니다.");
		}
		else {
			System.out.println("이 만화책은 흑백입니다.");
		}
	}
}


class Computer{
	private String comname = "한성";
	void powerOn() {
		System.out.println("전원이 켜졌습니다.");
	}
	String getName() {
		this.comname = "부모컴퓨터";
		return this.comname;
	}
	void powerOff() {
		System.out.println("전원이 꺼졌습니다.");
	}
	
}

class Samsung extends Computer{
	
	@Override
	void powerOn() {
		System.out.println("I love Samsung" + " 전원이 켜졌습니다.");
	}
	
}