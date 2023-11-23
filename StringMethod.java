package day16;

public class StringMethod {

	public static void main(String[] args) {
		
		String word = "1I2LOVE6YOU";
		String text = "";
		
		
		for(int i = 0; i < word.length(); i++) {
			if((word.charAt(i) >= 65 && word.charAt(i) <= 90) || (word.charAt(i) >= 97 && word.charAt(i) <= 122)) {
				text += word.charAt(i);
			}
			else {
				text += " ";
			}
		}
		System.out.println(text);
		
		String str = "HelloWorld_MyWorld";
		System.out.println(str.indexOf("World"));
		System.out.println(str.indexOf("World", 10));
		
		String str2 = "자바 프로그래밍은 어렵지만 자바를 배울수록 재미있어요.";
		System.out.println(str2.replaceAll("자바", "java"));
		
		
		String subStr = "1234-5678";
		System.out.println(subStr.substring(0, 4));
		System.out.println(subStr.substring(5));
		
		String[] phone = subStr.split("-");
		System.out.println(phone[0] + phone[1]);
		
		StringBuilder sbu = new StringBuilder("Hello");
		sbu.append(" World");
		System.out.println(sbu);
		
		sbu.delete(0, 6);
		System.out.println(sbu);
		
		sbu.insert(0, "Hello ");
		System.out.println(sbu);
		
	}

}
