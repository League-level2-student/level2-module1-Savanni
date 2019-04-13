package intro_to_array_lists;

import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {

			
	int x;

	int y;

	int width;

	int height;
	
	Rectangle collisionBox;
	
	
	
	boolean isAlive = true;

	public GameObject(int r_x, int r_y, int r_width, int r_height) {
		x = r_x;
		y = r_y;
		width = r_width;
		height = r_height;
		collisionBox = new Rectangle(x,y,width,height);

	}

	public void update() {
		collisionBox.setBounds(x, y, width, height);
	}

	public void draw(Graphics g) {

	}

}
