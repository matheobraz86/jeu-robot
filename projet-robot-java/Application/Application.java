package Application;

import Plateau.Plateau;

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plateau pl = new Plateau(10, 10);
		pl.getListeDePions();
		pl.placerPions();
		System.out.println(pl.getListeDePions());
	}

}
