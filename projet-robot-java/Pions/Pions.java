package Pions;
import Plateau.Plateau;



public class Pions extends Plateau {

	
	public int x;

	public int y;
	
	
	public Pions(){}
	
	public Pions(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	public void attaquer() {
	}

	public void deplacer() {
	}

	public void getPosition() {
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

	@Override
	public String toString() {
		return "Pions [x=" + x + ", y=" + y + "]";
	}
}