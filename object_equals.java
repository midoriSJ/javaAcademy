package day16;

public class object_equals {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "Hello";

		String str3 = new String("Hello");

		System.out.println("str1 vs str2 : " + (str1 == str2));
		System.out.println("str2 vs str3 : " + (str2 == str3));
		System.out.println("str2 vs str3 : " + (str2.equals(str3)));

		// 각 문자열 변수가 위치값을 출력
		System.out.println("str1 해시코드 : " + System.identityHashCode(str1));
		System.out.println("str2 해시코드 : " + System.identityHashCode(str2));
		System.out.println("str3 해시코드 : " + System.identityHashCode(str3));

		String str4 = new String("abc");
		String str5 = new String("abc");

		System.out.println("str4 vs str5 : " + (str4 == str5));
		System.out.println("str4 vs str5 equals() : " + str4.equals(str5));
		
		System.out.println(str4.hashCode());
		System.out.println(str5.hashCode());
		
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
		
		
		Car_string cs = new Car_string("소나타", "현대");
		System.out.println(cs.toString());
	}

}
