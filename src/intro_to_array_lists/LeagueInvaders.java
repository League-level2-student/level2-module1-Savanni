package intro_to_array_lists;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class LeagueInvaders implements KeyListener {

	JFrame frame;
	int height = 800;
	int width = 500;
	GamePanel gp;

	public LeagueInvaders() {
		frame = new JFrame();
		gp = new GamePanel();
	}

	void setup() {
		frame.add(gp);
		frame.addKeyListener(gp);
		frame.setSize(width, height);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setPreferredSize(new Dimension(width, height));
		frame.pack();
		gp.startGame();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeagueInvaders invaders = new LeagueInvaders();
		invaders.setup();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
