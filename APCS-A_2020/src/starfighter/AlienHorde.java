package starfighter;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde {
	private List<Alien> aliens;

	public AlienHorde(int size) {
		aliens = new ArrayList<Alien>();
		int x = 0;
		for (int i = 0; i < size; i++) {
			aliens.add(new Alien(100 + x + 100 * i, 100, 50, 50, 1));
		}
	}

	public void add(Alien al) {
	}

	public void drawEmAll(Graphics window, ArrayList<Ammo> ammoList) {
		try {
			if (Math.random() > 0.9) {
				for (int i = 0; i < aliens.size(); i++) {
					aliens.get(i).setY(aliens.get(i).getY() + aliens.get(i).getSpeed());
				}
				
				for (int i = 0; i < aliens.size(); i++) {
					aliens.get(i).setX(aliens.get(i).getX() + (int) (2*Math.random() - 0.5));
				}
			}

			for (int i = 0; i < aliens.size(); i++) {
				aliens.get(i).draw(window);
				for (int j = 0; j < ammoList.size();) {
					if (ammoList.get(j).getY() < aliens.get(i).getY()) {
						int absV = Math.abs(ammoList.get(j).getX() + (ammoList.get(j).getWidth() / 2)
								- ((aliens.get(i).getX() - 50) + aliens.get(i).getWidth() / 2));
						// System.out.println("bullet at "+ ammoList.get(j).getX() + "; Alien at " +
						// aliens.get(i).getX());
						if (absV <= 35) {
							ammoList.remove(j);
							aliens.remove(i);
						} else {
							j++;
						}
					} else {
						j++;
					}
				}
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("All Aliens Destroyed!");
		}
	}

	public void moveEmAll() {
	}

	public void removeDeadOnes(List<Ammo> shots) {
	}

	public String toString() {
		return "";
	}
}
