package day16;

public class Car_string {
	
	private String carName;
	private String company;
	
	public Car_string(String carName, String company) {
		this.carName = carName;
		this.company = company;
	}
	
	public String toString() {
		return "�����̸� : " + this.carName + " // ������ : " + this.company;
	}
	
}
