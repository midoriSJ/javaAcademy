package day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class java_20231121 {
	
	public static void method1(Scanner s1) throws InputMismatchException {
		System.out.println("1. 사람과 어울리는 것이 좋다 // 2. 혼자 있는 것이 좋다.");
		System.out.println("선택 >>> ");
		int check = s1.nextInt();
		
		if(check == 1) {
			System.out.println("당신은 ENFP입니다.");
		}
		else {
			System.out.println("당신은 ISFP입니다.");
		}
		method2(s1);
	}
	public static void method2(Scanner s2) throws InputMismatchException{
		method3(s2);
	}
	public static void method3(Scanner s3) throws InputMismatchException{
		
	}
	

	public static void main(String[] args) throws Exception {
		
		/*
		try {
			Exception e = new Exception("고의 발생");
			throw e;
		} catch (Exception e) {
			System.out.println("에러 메세지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었습니다.");
		*/
		
		Scanner mbti = new Scanner(System.in);
		System.out.println("성격 유형 검사를 시작합니다.");
		
		try {
			java_20231121.method1(mbti);
		} catch(InputMismatchException ime) {
			System.out.println("키보드 입력이 잘못되었습니다.");
		} finally {
			if(mbti != null) {
				mbti.close();
			}
		}
		
		System.out.println("프로그램 종료");
		
	}
	
}
