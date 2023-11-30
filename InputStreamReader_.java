package day18;

import java.io.FileReader;
import java.io.Reader;

public class InputStreamReader_ {

	public static void main(String[] args) {
		
		int read = 0;
		Reader r = null;
		char[] bf = new char[256];
				
		try {
			r = new FileReader("src/day18/filekorean.txt");
			
			while(true) {
				read = r.read(bf);
				
				if(read == -1) {
					break;
				}
				
				System.out.print(String.valueOf(bf, 0, read));
			}
		} catch (Exception e) {
			
		}
		

	}

}
