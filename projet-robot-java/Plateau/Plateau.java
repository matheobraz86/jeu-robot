package Plateau;
import java.util.ArrayList;
import java.util.Random;

import Pions.Pions;

public class Plateau {

	public ArrayList<Pions> listePion = new  ArrayList<Pions>();


	public ArrayList<Pions> getListeDePions() {

		//note a single Random object is reused here

		for (int i = 0; i <= 9; i++){
			int x = randomNumber();
			int y = randomNumber();
			if(!isOccuped(x,y)){
				Pions pion = new Pions(x,y);
				listePion.add(pion);
			}
		}
		return listePion;
	}

	private int randomNumber(){
		Random randomGenerator = new Random();
		int i = 1 + randomGenerator.nextInt(10);
		return i;
	}

	public boolean isOccuped(int x, int y){
		for(Pions pionExist : this.getListePion()){
			if(pionExist.getX() == x && pionExist.getY()==y){
				return true;
			}
		}
		return false;
	}


	public void placerPions() {
	}

	public ArrayList<Pions> getListePion() {
		return listePion;
	}

	public void setListePion(ArrayList<Pions> listePion) {
		this.listePion = listePion;
	}

}