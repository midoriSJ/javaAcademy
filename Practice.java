package practice;

public class Practice {

	public static void main(String[] args) {
		Speaker s1 = new RedSpeaker();
		Person p1 = new Person(s1);
		p1.turnOn();
		
		Speaker s2 = new BlueSpeaker();
		Person p2 = new Person(s2);
		p2.turnOn();

	}

}

class Person {
	Speaker speaker;
	Person(Speaker speaker){
		this.speaker = speaker;
	}
	
	void turnOn() {
		System.out.println(speaker.getName() + " is turned on.");
	}
}

class Speaker {
	String speaker;
	Speaker(){
		
	}
	Speaker(String speaker){
		this.speaker = speaker;
	}
	String getName() {
		return speaker;
	}
}

class RedSpeaker extends Speaker{

	public String getName() {
		return "Red Speaker";
	}
	
	RedSpeaker(){
		
	}
	RedSpeaker(String speaker) {
		super(speaker);
		// TODO Auto-generated constructor stub
	}	
}

class BlueSpeaker extends Speaker{
	
	public String getName() {
		return "Blue Speaker";
	}
	
	BlueSpeaker(){
		
	}
	BlueSpeaker(String speaker) {
		super(speaker);
		// TODO Auto-generated constructor stub
	}
	
}