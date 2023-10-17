import java.util.*;


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
		
		/*
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
			 
		*/
		
		// 자동 형 변환
		// char -> short -> int -> long
		/*
		int num1 = 14;
		double num2 = num1;
		System.out.println(num2);
		*/
		/*
		int num3 = 10;
		byte num4 = (byte) num3;
		System.out.println(num4); // 손실이 없다 -> byte 값의 범위 안에 있기 때문
		
		int num5 = 1000;
		byte num6 = (byte) num5;  // 8bit = 2^7 = 128-1 = 127
		System.out.println(num6); // 손실이 있다 -> byte 값의 범위 안에 없기 때문
		
		*/
		
		//자바 라이브러리 import
		//import java.util.Scanner;
		//Scanner 객체 선언
		//Scanner input = new Scanner(System.in);
		//값을 입력받기
		
		// byte input_num = input.nextByte();
		// 정수형 : byte nextByte() : 입력 받을 값을 byte형으로 변환
		// short int long도 위와 동일
		// 실수형 : float nextFloat() : 입력 받을 값을 float형으로 변환
		// double도 위와 동일
		// 문자형 : String nextLine() : 입력받은 전체의 문자열 타입을 엔터구분
		// String next() : 입력 받을 문자열 타입으로 (띄어쓰기)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 주소 나이 체중을 빈칸으로 구분해서 입력받고 출력하기\n");
		
	    String name, address;
	    int age;
	    double weight;
	    
	    name = sc.next();
	    address = sc.next();
	    age = sc.nextInt();
	    weight = sc.nextDouble();
	    
	    System.out.println("당신의 이름은 " + name + "입니다.");
	    System.out.println("당신의 주소는 " + address + "입니다.");
	    System.out.println("당신의 나이는 " + age + "입니다.");
	    System.out.println("당신의 체중은 " + weight + "입니다.");
	    
	    sc.close();
	}
}
