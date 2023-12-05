package game;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainView extends JFrame implements ActionListener{
	
	JButton game = new JButton("게임 시작");
	JButton rank = new JButton("랭킹 확인");
	
	MainView() {
		setSize(700, 400);
		setLayout(new FlowLayout());
		add(game);
		game.addActionListener(this);
		add(rank);
		rank.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainView();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
}
