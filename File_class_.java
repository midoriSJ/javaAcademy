package day18;

import java.io.File;

public class File_class_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("src/day18/a.jpg");
		
		if(f.exists()) {
			System.out.println("length >>> " + f.length());
			System.out.println("Can Read? >>> " + f.canRead());
			System.out.println("getName() >>> " + f.getName());
			System.out.println("getParent() >>> " + f.getParent());
			System.out.println("getPath() >>> " + f.getPath());
		}
	}

}
