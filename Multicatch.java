package day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multicatch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			int[] cards = {4, 5, 1, 2, 7, 8};
			System.out.println("�� ��° ī�带 �����ðڽ��ϱ�? >>> ");
		
			int CardIndex = sc.nextInt();
			System.out.println("���� ī�� ��ȣ�� " + cards[CardIndex]);
			
		} catch (InputMismatchException e) {
			
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ��ĳ�ʸ� �Է��� ���� ���ڸ� �����մϴ�.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�ش� �迭�� ������ �����ϴ�. �ٽ� �Է��� �ּ���.");
		}
		System.out.println("���α׷� ����");
		sc.close();
	}

}
