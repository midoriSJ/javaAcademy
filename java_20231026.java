package day06;

import java.util.Scanner;

public class java_20231026 {
	public static void main(String[] args) {
		
		// ��� 6�� ����
		/*
		int fahrenheit = 100;
		float celcius = (int)((5/9f*(fahrenheit-32))*100+0.5)/100f;
		
		System.out.println("Fahrenheit : " +fahrenheit);
		System.out.println("Celcius : " +celcius);
		*/
		
		// ����Ʈ 1�� ����
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
		
		
		// ����Ʈ 2�� ����
		/*
		int sum = 0;
		for(int i = 1; i <= 20; i++) {
			if(i % 2 != 0 && i % 3 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		*/
		
		// ����Ʈ 3�� ����
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
		
		// ����Ʈ 4�� ����
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
		
		// ����Ʈ 5�� ����
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
		
		// ����Ʈ 6�� ����
		/*
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if(i + j == 6) {
					System.out.printf("(%d, %d)\n", i, j);
				}
			}
		}
		*/
		
		// ����Ʈ 7�� ����
		/*
		String str = "12345";
		int sum = 0;
		for(int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0';
		}
		
		System.out.println("sum = " + sum);
		*/
		
		
		// while�� 1�� ����
		/*
		int i = 0;
		while(i < 5) {
			System.out.println("I can do it");
			i++;
		}
		*/
		
		// while�� 2�� ����
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
		
		// ���ٿ� ����
		/*
		int num = (int) (Math.random()*1000)+1;
		Scanner sc = new Scanner(System.in);
		int i = 0;
		System.out.println("1���� 1000������ ���� �� �ϳ��� �Է��ϼ���! ");
		do {
			i = sc.nextInt();
			if(i > num) {
				System.out.println("���亸�� Ů�ϴ�!");
			}
			else if(i < num){
				System.out.println("���亸�� �۽��ϴ�!");
			}
			else {
				System.out.println("�����Դϴ�!");
			}
		} while(i != num);
		*/
		
		// continue�� �ǽ� ����
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
		
		// break�� �ǽ�����
		
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