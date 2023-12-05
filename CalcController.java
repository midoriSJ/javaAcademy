package day20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcController implements ActionListener {

	CalcView cv;
	
	CalcController() {
		cv = new CalcView();
		cv.bt.addActionListener(this);
	}
	
	public static void main(String[] args) {
		
		new CalcController();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == cv.bt) {
			int n1 = Integer.parseInt(cv.tf1.getText());
			int n2 = Integer.parseInt(cv.tf2.getText());
			
			CalcModel cm = new CalcModel();
			int res = cm.plus(n1, n2);
			
			cv.la.setText("결과는 >>> " + res);
		}
	}

}
