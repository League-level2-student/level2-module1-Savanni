package intro_to_array_lists;

import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {

	Rocketship rockets;
	ArrayList<Projectile> projectiles = new ArrayList<Projectile>();

	public void addProjectile(Projectile x) {
		projectiles.add(x);
	}

	public ObjectManager(Rocketship rockets) {
		this.rockets = rockets;
	}

	public void update() {
		rockets.update();

		for (int i = 0; i < projectiles.size(); i++) {
			projectiles.get(i).update();

		}

	}

	public void draw(Graphics g) {
		rockets.draw(g);

		for (int i = 0; i < projectiles.size(); i++) {
			projectiles.get(i).draw(g);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
