package day20;

import javax.swing.*;

public class CalcView extends JFrame{

	JTextField tf1 = new JTextField();
	JTextField tf2 = new JTextField();
	
	JButton bt = new JButton("더하기");
	JLabel la = new JLabel("결과 출력");
	
	
	CalcView() {
		setSize(500, 300);
		setLayout(null);
		setTitle("SwingDemo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tf1.setBounds(50, 50, 40, 40);
		add(tf1);
		tf2.setBounds(100, 50, 40, 40);
		add(tf2);
		bt.setBounds(150, 50, 80, 40);
		add(bt);
		la.setBounds(50, 100, 200, 40);
		add(la);
		setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		
		new CalcView();
	}

}
