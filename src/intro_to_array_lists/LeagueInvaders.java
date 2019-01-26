package intro_to_array_lists;

import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
	
JFrame frame;
final int height = 800;
final int width = 500;
GamePanel gp;



public LeagueInvaders(){
	frame = new JFrame();
	gp = new GamePanel();
	}


 void setup() {
	frame.add(gp);
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

}
