package intro_to_array_lists;

import java.awt.Graphics;

public class GameObject {
	
	 int x;
	 
	 
     int y;

	 
     int width;
     
     
     int height;
     
     public GameObject(int r_x,int r_y, int r_width, int r_height){
    	     x=10;
    	     y=10;
    	     width=r_width;
    	     height=r_height;
    	    		 
     }
     
     public void update() {
    	 x+=1;
    		 
     }
     
    public void draw(Graphics g) {
    	g.fillRect(x, y, width, height);
     }
     
}