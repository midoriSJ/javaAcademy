package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class MainController extends JFrame implements ActionListener{

	MainView mv;
	
	public MainController() {
		mv = new MainView();
		mv.game.addActionListener(this);
		mv.rank.addActionListener(this);
	}
	
	public static void main(String[] args) {
		MainController mc = new MainController();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == mv.game) {
			new GameController();
			mv.setVisible(false);
			
		}
		else if(e.getSource() == mv.rank) {
			new RankController();
			mv.setVisible(false);
			
		}
	}

}
