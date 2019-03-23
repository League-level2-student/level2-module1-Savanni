package intro_to_array_lists;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {

	Timer timer;
	Font titleFont;
	Font titleFontS;
	Rocketship rocket = new Rocketship(250, 700, 50, 50);
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	ObjectManager OB = new ObjectManager(rocket);
	GameObject go;

	public GamePanel() {

		timer = new Timer(1000 / 60, this);
		titleFont = new Font("Arial", Font.BOLD, 48);
		titleFontS = new Font("Arial", Font.BOLD, 24);
		go = new GameObject(10, 10, 100, 100);

	}

	void startGame() {
		timer.start();
	}

	void updateMenuState() {

	}

	void updateGameState() {
		OB.update();
	}

	void updateEndState() {

	}

	void drawMenuState(Graphics g) {

		g.setColor(Color.BLUE);

		g.fillRect(0, 0, getWidth(), getHeight());

		g.setColor(Color.yellow);
		g.setFont(titleFont);
		g.drawString("LEAGUE INVADERS", 20, 200);
		g.setFont(titleFontS);
		g.drawString("Press ENTER to start", 130, 350);
		g.drawString("Press SPACE for instructions", 90, 500);

	}

	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);

		g.fillRect(0, 0, getWidth(), getHeight());
		OB.draw(g);

	}

	void drawEndState(Graphics g) {

		g.setColor(Color.red);
		g.fillRect(0, 0, getWidth(), getHeight());

		g.setColor(Color.BLACK);
		g.setFont(titleFont);
		g.drawString("Game Over", 120, 200);
		g.setFont(titleFontS);
		g.drawString("You killed #### enemies", 120, 350);
		g.drawString("Press ENTER to restart", 125, 500);

	}

	@Override

	public void paintComponent(Graphics g) {
		// go.draw(g);
		if (currentState == MENU_STATE) {

			drawMenuState(g);

		} else if (currentState == GAME_STATE) {

			drawGameState(g);

		} else if (currentState == END_STATE) {

			drawEndState(g);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// go.update();
		repaint();
		if (currentState == MENU_STATE) {

			updateMenuState();

		} else if (currentState == GAME_STATE) {

			updateGameState();

		} else if (currentState == END_STATE) {

			updateEndState();

		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			currentState += 1;

			if (currentState > END_STATE) {

				currentState = MENU_STATE;

			}
		}

		if (e.getKeyCode() == KeyEvent.VK_UP) {
			rocket.y = rocket.y - rocket.speed;
			System.out.println("up");
		}

		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			rocket.y = rocket.y + rocket.speed;
		}

		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			rocket.x = rocket.x - rocket.speed;
		}

		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			rocket.x = rocket.x + rocket.speed;
		}

		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			OB.addProjectile(new Projectile(rocket.x, rocket.y, 10, 10));
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
