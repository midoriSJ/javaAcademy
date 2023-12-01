package day19;

public class LamdaExample{

	public static void main(String[] args) {
		
		/*
		action((x, y) -> {
			int res = x + y;
			System.out.println("result >>> " + res);
		});
		
		action((x, y) -> {
			int res = x - y;
			System.out.println("result >>> " + res);
		});
		*/
		
		Person3 p3 = new Person3();
		p3.action(() -> {
			System.out.println("출근을 합니다.");
			System.out.println("프로그래밍을 합니다.");
		});
		
		p3.action(() -> {
			System.out.println("퇴근을 합니다.");
		});
		
		Person4 p4 = new Person4();
		p4.action((x, y) -> {
			double res = x + y;
			return res; 
		});
		
		p4.action((x, y) -> (x + y));
		
		p4.action((x, y) -> sum(x, y));
		
		p4.action((x, y) -> Computer2.staticMethod(x, y));
		
		Computer2 com2 = new Computer2();
		p4.action((x, y) -> com2.instanceMethod(x, y));
		p4.action(com2::instanceMethod);
		
		
	}
	
	public static void action(Calculable cal) {
		
		int x = 10;
		int y = 4;
		
		cal.calculate(x, y);
		
	}
	
	public static double sum(double x, double y) {
		return (x + y);
	}
	
}
