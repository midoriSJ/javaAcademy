package day06;

import java.util.Scanner;

public class java_20231026 {
	public static void main(String[] args) {
		
		// 제어문 6번 문제
		/*
		int fahrenheit = 100;
		float celcius = (int)((5/9f*(fahrenheit-32))*100+0.5)/100f;
		
		System.out.println("Fahrenheit : " +fahrenheit);
		System.out.println("Celcius : " +celcius);
		*/
		
		// 프린트 1번 문제
		/*
		int x = 15;
		System.out.println(x > 10 && x < 20);
		
		char ch = '\t';
		System.out.println(!(ch == ' ' || ch == '\t'));
		
		char ch1 = 'X';
		System.out.println(ch1 == 'x' || ch1 == 'X');
		
		char ch2 = '3';
		System.out.println(ch2 >= '0' && ch2 <= '9');
		
		char ch3 = 'n';
		System.out.println((ch3 >= 'A' && ch3 <= 'Z') || (ch3 >= 'a' && ch3 <= 'z'));
		
		int year = 2023;
		System.out.println(year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
		
		boolean powerOn = false;
		System.out.println(powerOn == false);
		
		String str = "yes";
		System.out.println(str == "yes");
		*/
		
		
		// 프린트 2번 문제
		/*
		int sum = 0;
		for(int i = 1; i <= 20; i++) {
			if(i % 2 != 0 && i % 3 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		*/
		
		// 프린트 3번 문제
		/*
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j < i; j++) {
				sum += j;
			}
		sum += i;
		}
		
		System.out.println(sum);
		*/
		
		// 프린트 4번 문제
		/*
		int count = 0;
		int sum = 0;
		int i = 1;
		
		while (sum <= 100) {
			if(i % 2 != 0) {
				sum += i;
				count++;
				i++;
			}
			else {
				sum -= i;
				count++;
				i++;
			}
		}
		System.out.println(count);
		System.out.println(sum);
		*/
		
		// 프린트 5번 문제
		/*
		int i = 1;
		while(i <= 5) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			i++;
		}
		*/
		
		// 프린트 6번 문제
		/*
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if(i + j == 6) {
					System.out.printf("(%d, %d)\n", i, j);
				}
			}
		}
		*/
		
		// 프린트 7번 문제
		/*
		String str = "12345";
		int sum = 0;
		for(int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0';
		}
		
		System.out.println("sum = " + sum);
		*/
		
		
		// while문 1번 문제
		/*
		int i = 0;
		while(i < 5) {
			System.out.println("I can do it");
			i++;
		}
		*/
		
		// while문 2번 문제
		/*
		int i = 0;
		int sum = 0;
		
		while(sum <= 100) {
			i++;
			sum += i;
		}
		System.out.println(sum);
		System.out.println(i);
		
		*/
		
		// 업다운 게임
		/*
		int num = (int) (Math.random()*1000)+1;
		Scanner sc = new Scanner(System.in);
		int i = 0;
		System.out.println("1부터 1000까지의 숫자 중 하나를 입력하세요! ");
		do {
			i = sc.nextInt();
			if(i > num) {
				System.out.println("정답보다 큽니다!");
			}
			else if(i < num){
				System.out.println("정답보다 작습니다!");
			}
			else {
				System.out.println("정답입니다!");
			}
		} while(i != num);
		*/
		
		// continue문 실습 문제
		/*
		int i = 0;
		
		while(i < 10) {
			i++;
			if(i % 3 == 0) {
				continue;
			}
			System.out.printf("%d ", i);
		}
		*/
		
		// break문 실습문제
		
		int i = 1;
		int sum = 0;
		
		for(i = 1; true; i++) {
			sum += i;
			
			if(sum >= 100) {
				break;
			}
		}
		System.out.println(i);
		System.out.println(sum);
		

		
	}
}