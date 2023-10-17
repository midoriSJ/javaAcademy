
public class java_20231017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		double marathon = 42.195;
		float halfmarathon = (float) (marathon/2);
		
		System.out.printf("마라톤은 %.3fkm을 달립니다.\n", marathon);
		System.out.printf("하프마라톤은 %.4fkm을 달립니다.", halfmarathon);
		*/
		/*
		double marathon = 42.195;
		float halfmarathon = 21.0975f;
		
		System.out.println("마라톤은 " + marathon + "km 달립니다");
		System.out.println("하프마라톤은 " + halfmarathon + "km 달립니다");
		*/
		/*
		double piDouble = 3.141592653589793;
		float piFloat = 3.141592653589793f;
		
		System.out.println(piDouble);
		System.out.println(piFloat);
		*/
		
		// char = 'A';(캐릭터 한글자만 표현)
		
		int alphabetA = 'A';
		int alphabetB = 'B';
		char alphabetC = 'C';
		char alphabetD = 'D';
		
		System.out.println(alphabetA);
		System.out.println(alphabetB);
		System.out.println(alphabetC);
		System.out.println(alphabetD);
		
		//기본논리형 boolean = 1byte = true/false
		
		boolean student = true;
		
		if(student == true) {
			System.out.println("학생이 맞습니다");
			// student = true일 시 학생이 맞음 출력
		}
		else {
			System.out.println("학생이 아닙니다");
			// student = false일 시 학생이 아님 출력
		}
	}

}
