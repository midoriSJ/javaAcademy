package day04;

import java.util.Scanner;

public class java_20231020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// if��
		
		/*
		int score = 60;
		
		if(score >= 60) {
			System.out.println("�հ��Դϴ�.");
		}
		*/
		
		//��ĳ���̿� : input
		//���̸� �Է��ϼ����� ����ϰ� �Է��մϴ�.
		//���̰� 19���� Ŭ ��쿡��
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̸� �Է��ϼ���.");
		int x = sc.nextInt();
		
		if (x > 19) {
			System.out.println("�����Դϴ�. �����ϼ���");
		}
		else {
			System.out.println("�̼������Դϴ�. ���� �� �԰� ������");
		}
		*/
		//2)if-else : ���ǽĿ� ���� ������ �����ؾ� �ϴ� ��ɹ��̴�.
		/*
		int num = 5;
		
		if(num > 4) {
			System.out.println(num + "�� 4���� ũ��");
		}
		else {
			System.out.println(num + "�� 4���� �۴�");
		}
		*/
		
		//a�� b�� ���ؼ� ū ���� ��� max �ȿ� ������ �����Ѵ�.
		//�������� max ���� ���ִ� ������ max �ִ밪�� ����Ѵ�.
		//if-else ó���ؼ� ����� ������
		
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
		System.out.println("a : " + a + "�� b : " + b + "�߿��� ū ���� " + max + "�Դϴ�.");
		*/
		
		//else-if : ���ǽ��� ���� �� ���� ��� ����Ѵ�.
		//���� 1 : �����ϴ� ���ڸ� �����Ѵ�. = ������ �ִ´�(scanner)
		// �����ϴ� ���ڰ� 5���� Ŭ ��� "�����ϴ� ���ڰ� 5���� Ů�ϴ�" ���
		// �����ϴ� ���ڰ� 7�� ��쿡�� "�����ϴ� ���ڴ� 7�Դϴ�." ���
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("�����ϴ� ���ڸ� �Է����ּ��� : ");
		// int num = sc.nextInt();
		/*
		if(num > 5) {
			System.out.println("�����ϴ� ���ڰ� 5���� Ů�ϴ�.");
		}
		else if(num == 7) {
			System.out.println("�����ϴ� ���ڴ� 7�Դϴ�.");
		}
		*/
		
		/*
		if(num == 7) {
			System.out.println("�����ϴ� ���ڴ� 7�Դϴ�.");
		}
		else if(num > 5) {
			System.out.println("�����ϴ� ���ڰ� 5���� Ů�ϴ�.");
		}
		else {
			System.out.println("�����ϴ� ���ڴ� " + num + "�Դϴ�.");
		}
		
		*/
		
		//���� 2 : ������ �Է��Ѵ� -> 90���� ũ�ų� ������ "A" ���
		//80���� ũ�ų� ������ "B" ���
		//70���� ũ�ų� ������ "C" ���
		//�������� "D" ���
		
		/*
		
		System.out.println("������ �Է����ּ���");
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
		
		//switch�� : if���� �Ǵ�(t/f)�� ���� ���๮�� �����Ǿ��ٸ�
		//switch���� ������ ���� ���� ���๮�� �����ȴ�.
		
		
		/*
		System.out.println("���ڸ� �Է����ּ��� : ");
		int num = sc.nextInt();
		switch(num) {
			case 1:
				System.out.println("1�Դϴ�.");
				break;
			case 7:
				System.out.println("7�Դϴ�.");
				break;
			default:
				System.out.println("�� �� �ƴմϴ�.");
		}
		
		*/
		
		/*
		System.out.println("������� �Է����ּ��� : ");
		int month = sc.nextInt();
		switch(month) {
			case 3, 4, 5:
				System.out.println("���Դϴ�.");
				break;
			case 6, 7, 8:
				System.out.println("�����Դϴ�.");
				break;
			case 9, 10, 11:
				System.out.println("�����Դϴ�.");
				break;
			default:
				System.out.println("�ܿ��Դϴ�.");
		}
		*/
		
		int a = 25;
		
		switch(a/10){
			case 2:
				System.out.println("a�� 20 �̻��� �����Դϴ�.");
		}
	}
}
