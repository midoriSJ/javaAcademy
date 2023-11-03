package day09;

public class java_20231103 {

	public static void main(String[] args) {
		
		// getter / setter : 캡슐화 관련 -> 멤버필드 : private
		// private : 클래스 내부에서만 접근하는 제어자
		
		/*
		Person lee = new Person();
		
		lee.setAge(22);
		lee.getAge();
		System.out.printf("나이는 %d살입니다.\n", lee.getAge());
		*/
		
		/*
		Book b1 = new Book();
		System.out.print("b1.title : ");
		System.out.println(b1.title);
		System.out.print("b1.series : ");
		System.out.println(b1.series);
		System.out.print("b1.page : ");
		System.out.println(b1.page);
		
		Book b2 = new Book(1, "멘토시리즈");
		System.out.print("b2.title : ");
		System.out.println(b2.title);
		System.out.print("b2.series : ");
		System.out.println(b2.series);
		System.out.print("b2.page : ");
		System.out.println(b2.page);
		
		Book b3 = new Book("신데렐라", 170);
		System.out.print("b3.title : ");
		System.out.println(b3.title);
		System.out.print("b3.series : ");
		System.out.println(b3.series);
		System.out.print("b3.page : ");
		System.out.println(b3.page);
		
		Book b4 = new Book(5, "노인과 바다");
		System.out.print("b4.title : ");
		System.out.println(b4.title);
		System.out.print("b4.series : ");
		System.out.println(b4.series);
		System.out.print("b4.page : ");
		System.out.println(b4.page);
		*/
		
		/*
		Car car = new Car();
		Car car2 = new Car(car);
		*/
		
		/*
		SmartTv stv = new SmartTv();
		stv.channel = 10;
		stv.channelUp();
		System.out.printf("지금 채널은 %d번입니다.\n", stv.channel);
		stv.captionOnOff();
		System.out.println(stv.caption);
		stv.displayCaption("마스크걸");
		*/
		
		Customer c1 = new Customer("박자바", 25, 1111);
		c1.enter();
		Customer c2 = new Customer("송코딩", 20, 2222);
		c2.enter();
	}
	
}

class Person1{
	String name;
	int age;
	
	Person1(String name, int age){
		this.name = name;
		this.age = age;
	}
}

class Customer extends Person1 {
	int memberID;
	Customer(String name, int age, int memberID){
		super(name, age);
		this.memberID = memberID;
	}
	
	void enter() {
		System.out.printf("회원번호 : %d\n", memberID);
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d\n", age);
		
	}
}




class Tv{
	int channel;
	int volume;
	boolean power;
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
	void volumeUp() {
		++volume;
	}
	void volumeDown() {
		--volume;
	}
}

class SmartTv extends Tv{
	boolean caption;
	void displayCaption(String txt) {
		if(caption) {
			System.out.printf("지금은 %s을 시청중입니다.", txt);
		}
	}
	void captionOnOff() {
		if(caption == true) {
			caption = false;
		}
		else {
			caption = true;
		}
	}
}


class Car{
	
	String color;
	String gearType;
	int door;
	
	Car(){
		this("하얀색", "자동", 4);
	}
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	
	Car(Car c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
}




class Person {
	private int age;	// 사람의 나이를 캡슐화
	
	void setAge(int num) {
		if(num <= 0) {
			System.out.println("잘못된 숫자를 입력했습니다. 1 이상으로 입력해주세요");
		}
		age = num;
	}
	int getAge() {
		return age;
	}
	
}

class Book {
	
	String brand;
	String title = "";
	int series = 1;
	String color;
	int page = 100;
	static int width = 200;
	static int height = 500;
	
	Book(){
		
	}
	
	Book(String t){
		title = t;
	}
	
	Book(String t, int p){
		title = t;
		page = p;
	}
	
	Book(int s, String t){
		series = s;
		title = t;
	}
	
	Book(int s){
		series = s;
	}
}