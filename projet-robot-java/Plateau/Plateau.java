package Plateau;
import java.awt.GridLayout;
import java.awt.Label;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;

import Pions.Pions;

public class Plateau{
	public int nbLongueur;
	public int nbHauteur;
	public int nbPions = 10;
	
	public ArrayList<Pions> listePion = new  ArrayList<Pions>();

	public Plateau(int nbLongueur, int nbLargeur) {
		this.nbLongueur = nbLongueur;
		this.nbHauteur = nbLargeur;
	}

	public ArrayList<Pions> getListeDePions() {

		//note a single Random object is reused here

		for (int i = 0; i <= nbPions-1; i++){
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
		int i = 1 + randomGenerator.nextInt(nbPions);
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
		JFrame t = new JFrame();
		t.setSize(nbLongueur*50, nbHauteur*50);
		//Panel p = new Panel();
		GridLayout g = new GridLayout(nbLongueur,nbHauteur);
		//g.addLayoutComponent(p, listePion);
		//t.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		g.setColumns(nbHauteur);
		g.setRows(nbLongueur);
		t.setLayout(g);
		for (short i=0;i>3;i++){
			for (short j=0;j>3;j++){
			t.getContentPane().add(new Label("Coucou"));
			}
		}
		t.setVisible(true);
	}

	public ArrayList<Pions> getListePion() {
		return listePion;
	}

	public void setListePion(ArrayList<Pions> listePion) {
		this.listePion = listePion;
	}
}