package day18;

import java.io.Serializable;

public class Person_ implements Serializable {
	private static final long serialVersionUID = 1L;
	private String myname;
	private int myage;
	public Person_ (String str, int i) {
		this.setMyNameAge(myname, myage);
	}
	
	public void setMyNameAge(String myname, int myage) {
		this.myname = myname;
		this.myage = myage;
	}
	
	
}
