package day04;

import java.util.Scanner;

public class java_20231020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// if문
		
		/*
		int score = 60;
		
		if(score >= 60) {
			System.out.println("합격입니다.");
		}
		*/
		
		//스캐너이용 : input
		//나이를 입력하세요라고 출력하고 입력합니다.
		//나이가 19보다 클 경우에는
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요.");
		int x = sc.nextInt();
		
		if (x > 19) {
			System.out.println("성인입니다. 입장하세요");
		}
		else {
			System.out.println("미성년자입니다. 나이 더 먹고 오세요");
		}
		*/
		//2)if-else : 조건식에 따라 무조건 실행해야 하는 명령문이다.
		/*
		int num = 5;
		
		if(num > 4) {
			System.out.println(num + "는 4보다 크다");
		}
		else {
			System.out.println(num + "는 4보다 작다");
		}
		*/
		
		//a와 b를 비교해서 큰 값일 경우 max 안에 변수로 정의한다.
		//마지막에 max 값에 들어가있는 변수와 max 최대값을 출력한다.
		//if-else 처리해서 결과를 만들어보자
		
		/*
		int a = 4;
		int b = 10;
		int max = 0;
		
		if(a > b) {
			max = a;
		}
		else {
			max = b;
		}
		System.out.println("a : " + a + "와 b : " + b + "중에서 큰 수는 " + max + "입니다.");
		*/
		
		//else-if : 조건식을 여러 개 만들 경우 사용한다.
		//문제 1 : 좋아하는 숫자를 선택한다. = 변수에 넣는다(scanner)
		// 좋아하는 숫자가 5보다 클 경우 "좋아하는 숫자가 5보다 큽니다" 출력
		// 좋아하는 숫자가 7일 경우에만 "좋아하는 숫자는 7입니다." 출력
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("좋아하는 숫자를 입력해주세요 : ");
		// int num = sc.nextInt();
		/*
		if(num > 5) {
			System.out.println("좋아하는 숫자가 5보다 큽니다.");
		}
		else if(num == 7) {
			System.out.println("좋아하는 숫자는 7입니다.");
		}
		*/
		
		/*
		if(num == 7) {
			System.out.println("좋아하는 숫자는 7입니다.");
		}
		else if(num > 5) {
			System.out.println("좋아하는 숫자가 5보다 큽니다.");
		}
		else {
			System.out.println("좋아하는 숫자는 " + num + "입니다.");
		}
		
		*/
		
		//문제 2 : 점수를 입력한다 -> 90보다 크거나 같으면 "A" 출력
		//80보다 크거나 같으면 "B" 출력
		//70보다 크거나 같으면 "C" 출력
		//나머지는 "D" 출력
		
		/*
		
		System.out.println("점수를 입력해주세요");
		int score = sc.nextInt();
		
		if(score > 95) {
			System.out.println("A+");
		}
		else if (score >= 90) {
			
			if(score < 95) {
				System.out.println("A-");
			}
			else {
				System.out.println("A");
			}
			
		}
		else if(score > 85) {
			System.out.println("B+");
		}
		else if(score >= 80) {
			if (score < 85) {
				System.out.println("B-");
			}
			else {
				System.out.println("B");
			}
		}
		else if(score > 75) {
			System.out.println("C+");
		}
		else if(score >= 70) {
			if(score < 75) {
				System.out.println("C-");
			}
			else {
				System.out.println("C");
			}
		}
		else{
			if(score > 65) {
				System.out.println("D+");
			}
			else if(score < 65) {
				System.out.println("D-");
			}
			else {
				System.out.println("D");
			}
		}
		*/
		
		//switch문 : if문은 판단(t/f)에 따라 실행문이 결정되었다면
		//switch문은 변수의 값에 따라 실행문이 결정된다.
		
		
		/*
		System.out.println("숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		switch(num) {
			case 1:
				System.out.println("1입니다.");
				break;
			case 7:
				System.out.println("7입니다.");
				break;
			default:
				System.out.println("둘 다 아닙니다.");
		}
		
		*/
		
		/*
		System.out.println("몇월인지 입력해주세요 : ");
		int month = sc.nextInt();
		switch(month) {
			case 3, 4, 5:
				System.out.println("봄입니다.");
				break;
			case 6, 7, 8:
				System.out.println("여름입니다.");
				break;
			case 9, 10, 11:
				System.out.println("가을입니다.");
				break;
			default:
				System.out.println("겨울입니다.");
		}
		*/
		
		int a = 25;
		
		switch(a/10){
			case 2:
				System.out.println("a는 20 이상의 숫자입니다.");
		}
	}
}
