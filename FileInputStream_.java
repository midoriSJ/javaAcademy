package day18;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStream_ {

	public static void main(String[] args) {
		
		int read = 0;
		
		byte[] buffer = new byte[5];
		
		InputStream is = null;
		
		try {
			is = new FileInputStream("src/day18/myfile.txt");
			
			while(true) {
				read = is.read(buffer);
				
				if(read == -1) {
					break;
				}

				System.out.println(new String(buffer, 0, read));
			}
			
			
			
		} catch(Exception e) { 
			System.out.println("Input Error! >>> " + e.getMessage());
		} finally {
			try {
				if(is != null) {
					is.close();
				}
			} catch (Exception e) {
				e.getMessage();
			}
		}
		
	}

}
