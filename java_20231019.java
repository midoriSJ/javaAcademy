package day3;

public class java_20231019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���׿�����_��ȣ������
		/*
		int x = 100;
		int result_plus = +x;
		int result_minus = -x;
		
		System.out.println(result_plus);
		System.out.println(result_minus);
		*/
		
		// ���׿�����_����������(--/++)
		// ������������ : num++;
		// �������Ŀ��� : ++num;
		/*
		int num = 10;
		System.out.println(num++);
		System.out.println(num);
		*/
		
		/*
		int x = 1;
		System.out.println(x++);
		System.out.println(x);
		System.out.println(++x);
		*/
		
		/*
		char alphabet = 'X';
		System.out.println(alphabet++);
		System.out.println(alphabet);
		*/
		
		/*
		or
		
		System.out.println(alphabet);
		System.out.println(++alphabet);
		*/
		
		// ���׿����� (�ǿ����� ������ �ǿ�����)
		// ��������� : ���� + ���� -> ó���� ��� (+ - * / %)
		
		/*
		int num_x = 100;
		int num_y = 200;
		
		System.out.println(num_x + num_y);
		System.out.println(num_x * num_y);
		System.out.println(num_x / num_y);
		//or System.out.println(num_y % num_x)
		System.out.println(num_x % num_y);
		*/
		
		/*
		if(num_x + num_y == 300) {
			System.out.println(num_x + num_y);
		}
		*/
		
		// ���׿�����_���մ��Կ�����

		/*
		int y = 5;
		// y += 1; = 6
		// y *= 2; = 10
		y -= 2; // 3
		*/
		
		//���׿�����_���迬���� : ũ�� / �۴� / ���� / ���ų� �۴� / ���ų� ũ��
		//������� ������ �Ǵ��̴�.(true/false)
		
		/*
		int a = 10;
		int b = 20;
		System.out.println(a > b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		*/
		
		//���׿�����_��������(��Ʈ������)
		//boolean : 1byte : 8bit
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;
		/*
		System.out.println("###����(AND)###");
		System.out.println(b1 & b2);
		System.out.println(b1 & b3);
		System.out.println(b2 & b4);
		*/
		System.out.println("###����(OR)###");
		System.out.println(b1 | b2);
		System.out.println(b2 | b3);
		System.out.println(b2 | b4);
		
		System.out.println("###��Ÿ�� ����(XOR)###");
		System.out.println(b1 ^ b2);
		System.out.println(b2 ^ b4);
		
		System.out.println("###����(NOT)###");
		System.out.println(b1);
		System.out.println(!b3);
		System.out.println(b2);
		System.out.println(!b4);
	}

}
