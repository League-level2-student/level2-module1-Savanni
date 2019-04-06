package intro_to_array_lists;

import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject{

	public Alien(int r_x, int r_y, int r_width, int r_height) {
		super(r_x, r_y, r_width, r_height);
	
	}


	public void update() {
		y = y+1;
	}

	public void draw(Graphics g) {
		g.setColor(Color.yellow);

		g.fillRect(x, y, width, height);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
