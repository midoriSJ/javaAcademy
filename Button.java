package day14;

public class Button {
	
	public static interface ClickListener {
		void onClick();
	}
	
	ClickListener cl;
	
	public void setClickListener(ClickListener cl) {
		this.cl = cl;
	}
	
	public void click() {
		this.cl.onClick();
	}
	
}
