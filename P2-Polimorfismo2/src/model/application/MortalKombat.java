package model.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import model.entities.Lutador;

public class MortalKombat {
	
	private List<Lutador> luta = new ArrayList<>(2);
	
	public MortalKombat(Lutador l1, Lutador l2) {
		luta.add(l1); luta.add(l2);
	}
	
	public void fight() {
		while ((luta.get(1).getVida() > 0) && (luta.get(0).getVida() > 0)) {
			int lutar = sorteiaLutador();
			if(lutar == 1) {
				System.out.println("O jogador " + luta.get(1).getNome() + " irá atacar!");
				atacar(luta.get(0));
			}
			else {
				System.out.println("O jogador " + luta.get(0).getNome() + " irá atacar!");
				atacar(luta.get(1));
			}
			System.out.println("LIFES DOS LUTADORES: ");
			System.out.println(luta.get(0).getNome() + ": " + luta.get(0).getVida());
			System.out.println(luta.get(1).getNome() + ": " + luta.get(1).getVida() + "\n");
		}
		
		if (luta.get(0).getVida() > 0) {
			System.out.println("*****O VENCEDOR FOI " + luta.get(0).getNome() + " *****");
		}
		else {
			System.out.println("*****O VENCEDOR FOI " + luta.get(1).getNome() + " *****");
		}
	}
	
	public int sorteiaLutador() {
		Random r = new Random();
		int atacante = r.nextInt(2);
		return atacante;
	}
	
	public int sorteiaGolpe() {
		Random r = new Random();
		int atacar = r.nextInt(4);
		return atacar;
	}
	
	public void atacar(Lutador i) {
		int golpe = sorteiaGolpe();
		if (golpe == 0) {
			luta.get(sorteiaLutador()).atirar(i);
			System.out.println("Ele atirou!!!");
		}
		if (golpe == 1) {
			luta.get(sorteiaLutador()).chutar(i);
			System.out.println("Ele chutou!!!");
		}
		if (golpe == 2) {
			luta.get(sorteiaLutador()).socar(i);
			System.out.println("Ele socou!!!");
		}
		if (golpe == 3) {
			luta.get(sorteiaLutador()).lancarMagia(i);
			System.out.println("Ele lançou sua magia!!!");
		}
	}
}
