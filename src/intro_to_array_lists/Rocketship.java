package intro_to_array_lists;

import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {

	int speed;
	
	public Rocketship(int r_x, int r_y, int r_width, int r_height) {
		super(r_x, r_y, r_width, r_height);
		speed = 5;
	}
	
	public void update() {
		
	}
	
	public void draw(Graphics g) {
		 g.setColor(Color.BLUE);

	        g.fillRect(x, y, width, height);
	}

	

}
