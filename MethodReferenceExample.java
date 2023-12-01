package day19;

public class MethodReferenceExample {

	public static void main(String[] args) {
		
		Person5 p5 = new Person5();
		
		p5.ordering((a, b) -> {
			return a.compareToIgnoreCase(b);
		});
		
		p5.ordering((a, b) -> a.compareToIgnoreCase(b));
		
		p5.ordering(String::compareToIgnoreCase);
		
		CompareNumber cn = 
				(n1, n2) -> {return n1 > n2 ? 1 : n1 < n2 ? -1 : 0;};
		
		int n1 = 10;
		int n2 = 20;
		int res = cn.cmptoInt(n1, n2);
		if(res > 0) {
			System.out.println(n1 + "은 " + n2 + "보다 크다.");
		} else if (res < 0) {
			System.out.println(n1 + "은 " + n2 + "보다 작다.");
		} else {
			System.out.println(n1 + "은 " + n2 + "과 같다.");
		}

	}

}
