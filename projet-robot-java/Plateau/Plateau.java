package Plateau;
import java.util.ArrayList;
import java.util.Random;

import Pions.Pions;

public class Plateau {

	public ArrayList<Pions> listePion[];


	public void getListeDePions() {

		//note a single Random object is reused here
		ArrayList<Pions>listePion = new ArrayList<Pions>();
		Random randomGenerator = new Random();
		for (int i = 0; i <= 9; i++){
			Pions pion = new Pions(1 + randomGenerator.nextInt(10), 1 + randomGenerator.nextInt(10));
			System.out.println(pion);
			 listePion.add(pion);
			 listePion.get(i).getX();
		}
		
	}


	public void placerPions() {
	}

}