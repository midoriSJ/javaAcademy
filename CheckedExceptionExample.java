package day15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {

	public static void main(String[] args) {
		BufferedReader reader = null;
		
		try {
			reader = new BufferedReader(new FileReader("example.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(reader != null) {
					reader.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
