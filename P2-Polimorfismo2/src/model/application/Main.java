package model.application;

import model.entities.Jax;
import model.entities.Lutador;
import model.entities.Rayden;

public class Main {
	
	public static void main (String args[]) {
		
		Lutador l1 = new Jax("Jax", 100);
		Lutador l2 = new Rayden("Rayden", 100);
		MortalKombat lutinha = new MortalKombat(l1, l2);
		System.out.println("PARTIDA COMEÇANDO");
		lutinha.fight();
	}
}
