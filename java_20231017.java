import java.util.*;


public class java_20231017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		double marathon = 42.195;
		float halfmarathon = (float) (marathon/2);
		
		System.out.printf("�������� %.3fkm�� �޸��ϴ�.\n", marathon);
		System.out.printf("������������ %.4fkm�� �޸��ϴ�.", halfmarathon);
		*/
		/*
		double marathon = 42.195;
		float halfmarathon = 21.0975f;
		
		System.out.println("�������� " + marathon + "km �޸��ϴ�");
		System.out.println("������������ " + halfmarathon + "km �޸��ϴ�");
		*/
		/*
		double piDouble = 3.141592653589793;
		float piFloat = 3.141592653589793f;
		
		System.out.println(piDouble);
		System.out.println(piFloat);
		*/
		
		// char = 'A';(ĳ���� �ѱ��ڸ� ǥ��)
		
		/*
		int alphabetA = 'A';
		int alphabetB = 'B';
		char alphabetC = 'C';
		char alphabetD = 'D';
		
		System.out.println(alphabetA);
		System.out.println(alphabetB);
		System.out.println(alphabetC);
		System.out.println(alphabetD);
		
		//�⺻���� boolean = 1byte = true/false
		
		boolean student = true;
		
		if(student == true) {
			System.out.println("�л��� �½��ϴ�");
			// student = true�� �� �л��� ���� ���
		}
		else {
			System.out.println("�л��� �ƴմϴ�");
			// student = false�� �� �л��� �ƴ� ���
			 
		*/
		
		// �ڵ� �� ��ȯ
		// char -> short -> int -> long
		/*
		int num1 = 14;
		double num2 = num1;
		System.out.println(num2);
		*/
		/*
		int num3 = 10;
		byte num4 = (byte) num3;
		System.out.println(num4); // �ս��� ���� -> byte ���� ���� �ȿ� �ֱ� ����
		
		int num5 = 1000;
		byte num6 = (byte) num5;  // 8bit = 2^7 = 128-1 = 127
		System.out.println(num6); // �ս��� �ִ� -> byte ���� ���� �ȿ� ���� ����
		
		*/
		
		//�ڹ� ���̺귯�� import
		//import java.util.Scanner;
		//Scanner ��ü ����
		//Scanner input = new Scanner(System.in);
		//���� �Է¹ޱ�
		
		// byte input_num = input.nextByte();
		// ������ : byte nextByte() : �Է� ���� ���� byte������ ��ȯ
		// short int long�� ���� ����
		// �Ǽ��� : float nextFloat() : �Է� ���� ���� float������ ��ȯ
		// double�� ���� ����
		// ������ : String nextLine() : �Է¹��� ��ü�� ���ڿ� Ÿ���� ���ͱ���
		// String next() : �Է� ���� ���ڿ� Ÿ������ (����)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸� �ּ� ���� ü���� ��ĭ���� �����ؼ� �Է¹ް� ����ϱ�\n");
		
	    String name, address;
	    int age;
	    double weight;
	    
	    name = sc.next();
	    address = sc.next();
	    age = sc.nextInt();
	    weight = sc.nextDouble();
	    
	    System.out.println("����� �̸��� " + name + "�Դϴ�.");
	    System.out.println("����� �ּҴ� " + address + "�Դϴ�.");
	    System.out.println("����� ���̴� " + age + "�Դϴ�.");
	    System.out.println("����� ü���� " + weight + "�Դϴ�.");
	    
	    sc.close();
	}
}
