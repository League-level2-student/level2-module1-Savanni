package intro_to_array_lists;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;

public class ObjectManager {
	long enemyTimer = 0;
	int enemySpawnTime = 2000;
	Rocketship rockets;
	int enemiesDead = 0;
	ArrayList<Projectile> projectiles = new ArrayList<Projectile>();
	ArrayList<Alien> aliens = new ArrayList<Alien>();

	public void addAlien(Alien y) {
		aliens.add(y);
	}

	public void addProjectile(Projectile x) {
		projectiles.add(x);
	}

	public ObjectManager(Rocketship rockets) {
		this.rockets = rockets;
	}

	public void checkCollision() {
		for (Alien a : aliens) {

			if (rockets.collisionBox.intersects(a.collisionBox)){
				rockets.isAlive = false;
				
			
			}
			for(int i = 0; i< projectiles.size(); i++) {
				if(projectiles.get(i).collisionBox.intersects(a.collisionBox)) {
					a.isAlive = false;
					enemiesDead++;
					projectiles.get(i).isAlive = false;
					System.out.println("dead");
					
				}
				
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	

	public void manageEnemies() {
		if (System.currentTimeMillis() - enemyTimer >= enemySpawnTime) {
			addAlien(new Alien(new Random().nextInt(LeagueInvaders.width), 0, 50, 50));

			enemyTimer = System.currentTimeMillis();
		}
	}

	public void purgeObjects() {

		for (int i = 0; i < projectiles.size(); i++) {
			if (projectiles.get(i).isAlive == false) {
				projectiles.remove(i);
			}

		}
		for (int i = 0; i < aliens.size(); i++) {
			if (aliens.get(i).isAlive == false) {
				aliens.remove(i);
			}
		}
		

	}

	public void update() {
		rockets.update();

		for (int i = 0; i < projectiles.size(); i++) {
			projectiles.get(i).update();

		}
		for (int i = 0; i < aliens.size(); i++) {
			aliens.get(i).update();

		}
	}

	public void draw(Graphics g) {
		rockets.draw(g);

		for (int i = 0; i < projectiles.size(); i++) {
			projectiles.get(i).draw(g);

		}
		for (int i = 0; i < aliens.size(); i++) {
			aliens.get(i).draw(g);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
