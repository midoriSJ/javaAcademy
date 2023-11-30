package day18;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectSerial_ {

	public static void main(String[] args) {
		Person_ p1 = new Person_("SBS", 10);
		Person_ p2 = new Person_("SBS2", 20);
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("src/day18/object_data.dat");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(p1);
			oos.writeObject(p2);
			
			System.out.println("파일 객체 스트림 완성");
			
		} catch (Exception e) {
			e.getMessage();
		} finally {
			
		}
		
	}

}
