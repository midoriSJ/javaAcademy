package day19;

public interface Calculable {
	double calculate(int x, int y);
}

interface Workable {
	void work();
}

class Person3 {

	public void action(Workable w) {
		w.work();
	}
	
}

class Person4 {
	
	public void action(Calculable c) {
		
		double res = c.calculate(10, 4);
		
		System.out.println(res);
		
	}

	
	
}

class Computer2 {
	
	// 인스턴스 메서드
	public double instanceMethod(double x, double y) {
		return x + y;
	}
	
	// class 메서드
	public static double staticMethod(double x, double y) {
		return x + y;
	}
	
}