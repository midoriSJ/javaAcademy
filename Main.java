package day_20231230;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int answer = r.nextInt(1001);
		
		System.out.print("1 ~ 1000 사이 숫자를 입력해주세요 >>> ");
		int num = sc.nextInt();
		
		while (num != answer) {
			if(num > answer) {
				System.out.println("Down");
				System.out.print("1 ~ 1000 사이 숫자를 입력해주세요 >>> ");
				num = sc.nextInt();
			}
			if(num < answer) {
				System.out.println("Up");
				System.out.print("1 ~ 1000 사이 숫자를 입력해주세요 >>> ");
				num = sc.nextInt();
			}
		}
		if (num == answer) {
			System.out.println("Correct!");
			
		}
		long end = System.currentTimeMillis();
		long time = (end - start)/1000;
		System.out.println("총 소요시간 >>> " + time + " sec");
	}
}
