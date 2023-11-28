package day17;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<TextMessage> msgset = new HashSet<>();
		
		TextMessage msg1 = new TextMessage(1001, "안녕하세요");
		TextMessage msg2 = new TextMessage(1001, "안녕하세요");
		TextMessage msg3 = new TextMessage(1001, "안녕하세요");
		TextMessage msg4 = new TextMessage(1002, "안녕하세요");
		TextMessage msg5 = new TextMessage(1003, "안녕");
		
		msgset.add(msg1);
		msgset.add(msg2);
		msgset.add(msg3);
		msgset.add(msg4);
		msgset.add(msg5);
		
		System.out.println("사이즈 : " + msgset.size());
		
		
		for(TextMessage msg : msgset) {
			System.out.println("번호 : " + msg.getmsgNum() +  ", 메세지 : " + msg.getMsg());
		}
		
		msgset.remove(msg5);
		
		System.out.println("사이즈 : " + msgset.size());
		
	}

}
