package Pions;

public abstract class Robots extends Pions {

	public int x;

	public int y;

	public boolean etat;

	public boolean dead;


	public void deplacer() {
	}

	public void suivre() {
	}

	public void chercher() {
	}

	public void getRayon() {
	}

	public void isDead() {
	}

	public void attaquer() {
	}

	public void rechercher() {
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	public void setDead(boolean dead) {
		this.dead = dead;
	}

}