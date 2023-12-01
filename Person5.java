package day19;

public class Person5 {
	
	public void ordering(Comparable cmp) {
		String a = "홍길동";
		String b = "김길동";
		
		int res = cmp.comp(a, b);
		
		if(res < 0) {
			System.out.println(a + "은 " + b + "보다 앞에 옵니다.");
		} else if (res == 0) {
			System.out.println(a + "와 " + b + "는 같습니다.");
		} else {
			System.out.println(a + "은 " + b + "보다 뒤에 옵니다.");
		}
	}
	
}
