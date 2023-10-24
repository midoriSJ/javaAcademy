package day05;

import java.util.random.*;

public class java_20231024 {

	public static void main(String[] args) {
		
		// 프린트 3번 문제 풀이
		/*
		int num = 456;
		System.out.println((num/100 == 1)?(num/100*100):(num/100*100));
		*/
		
		//프린트 4번 문제 풀이
		/*
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = (numOfApples/sizeOfBucket+1);
		
		System.out.println("필요한 바구니의 수 : " + numOfBucket);
		*/
		
		//프린트 5번 문제 풀이
		/*
		int num = 10;
		System.out.println((num>0?"양수":num<0?"음수":0));
		*/
		
		//프린트 6번 문제 풀이
		/*
		int fahrenheit = 100;
		float celcius = (((((fahrenheit-32)*5)*100)+(float)0.5)/(float)9/10);
		
		System.out.println("Fahrenheit : " + fahrenheit);
		System.out.printf("Celcius : %.2f" , celcius);
		*/
		
		
		/*
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		for(int j = 1; j <= 5; j++) {
			System.out.print(j);
		}
		*/
		
		
		/*
		for(int i = 1; i <= 5; i++) {
			int value = (int)(Math.random()*100)+1;
			System.out.println(value);
		}
		*/
		
		/*
		int sum = 0;
		
		for(int i = 0; i <= 100; i+=2) {
			sum += i;
		}
		System.out.println(sum);
		*/
		
		/*
		int sum = 0;
		for(int i = 1; i <= 100; i+=1) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		*/
		
		/*
		for(int i = 1; i <= 9; i++) {
			System.out.printf("2 * %d = %d\n", i, i*2);
		}
		*/
		
		/*
		for(int i = 2; i <= 9; i++){
			System.out.printf("\n### %d단 ###\n\n", i);
			
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
		}
		*/
		
		/*
		for(int i = 2; i <= 19; i++){
			System.out.printf("\n### %d단 ###\n\n", i);
			for(int j = 1; j <= 19; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
		}
		*/
		
		/*
		for(int a = 1; a <= 1; a++) {
			System.out.print("*");
		}
		System.out.println();
		for(int a = 1; a <= 2; a++) {
			System.out.print("*");
		}
		System.out.println();
		for(int a = 1; a <= 3; a++) {
			System.out.print("*");
		}
		System.out.println();
		for(int a = 1; a <= 4; a++) {
			System.out.print("*");
		}
		System.out.println();
		for(int a = 1; a <= 5; a++) {
			System.out.print("*");
		}
		*/
		/*
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
