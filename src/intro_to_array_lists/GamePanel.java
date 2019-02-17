package intro_to_array_lists;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.RenderingHints.Key;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {

	Timer timer;
	Font titleFont;
	
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	
	//GameObject go;
	
	public GamePanel() {
				
		timer = new Timer(1000 / 60, this);
		titleFont = new Font("Arial",Font.PLAIN,48);
	//	go = new GameObject(10, 10, 100, 100);
		
	}

	void startGame() {
		timer.start();
	}
	
	void updateMenuState(){
		
	}
	
	void updateGameState() {
		
	}
	
	void updateEndState() {
		
	}
	
	void drawMenuState(Graphics g){
		
		g.setColor(Color.BLUE);

		g.fillRect(0, 0, getWidth(), getHeight());  
	//	g.setFont(titleFont);
	//	g.drawString("text", 100, 100);
	//	g.setColor(Color.black);
		// PART 7 INSTRUCTION NUMBER 2/3 NOT WORKING
	}
	
	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		
		g.fillRect(0, 0, getWidth(), getHeight());
		
	}

	void drawEndState(Graphics g) {
		
	}
	@Override

	public void paintComponent(Graphics g) {
	//go.draw(g);
		if(currentState == MENU_STATE){

            drawMenuState(g);

    }else if(currentState == GAME_STATE){

            drawGameState(g);

    }else if(currentState == END_STATE){

            drawEndState(g);
	}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//go.update();
		repaint();
		if(currentState == MENU_STATE){

            updateMenuState();

    }else if(currentState == GAME_STATE){

            updateGameState();

    }else if(currentState == END_STATE){

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
		currentState+=1;
		
		if(currentState > END_STATE){

            currentState = MENU_STATE;

    }
	}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
