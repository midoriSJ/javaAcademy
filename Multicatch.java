package day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multicatch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			int[] cards = {4, 5, 1, 2, 7, 8};
			System.out.println("몇 번째 카드를 뽑으시겠습니까? >>> ");
		
			int CardIndex = sc.nextInt();
			System.out.println("뽑은 카드 번호는 " + cards[CardIndex]);
			
		} catch (InputMismatchException e) {
			
			System.out.println("잘못 입력하셨습니다. 스캐너를 입력할 때는 숫자만 가능합니다.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("해당 배열의 공간은 없습니다. 다시 입력해 주세요.");
		}
		System.out.println("프로그램 종료");
		sc.close();
	}

}
