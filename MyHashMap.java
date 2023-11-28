package day17;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <String, String> map = new HashMap<String, String>();
		
		map.put("Spring", "봄");
		map.put("Summer", "여름");
		map.put("Fall", "가을");
		map.put("Winter", "겨울");
		
		map.put("Spring", "봄봄");
		
		map.remove("Winter");
		
		System.out.println("Is Exist Key : " + map.containsKey("Winter"));
		
		System.out.println("Is Exist Value : " + map.containsValue("가을"));
		
		System.out.println("get Data : " + map.get("Spring"));
		
	}

}
