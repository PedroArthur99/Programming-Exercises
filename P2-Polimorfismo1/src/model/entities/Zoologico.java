//Crie uma classe Zoologico composta por 5 jaulas (lista), onde cada uma terá um animal diferente. Depois percorra cada jaula e 
//“cutuque o animal” (emitirSom) e, se o animal souber correr, dê uma carreira nele (correr).

package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
		
		private List<Animal> jaulas;
		
		public Zoologico() {
			jaulas = new ArrayList<Animal>();
			
			jaulas.add(new Cavalo("Dom Diego", 4));
			jaulas.add(new Cachorro ("Sasha", 3));
			jaulas.add(new Preguica("Eu", 21));
			jaulas.add(new Cavalo ("Dom Juan", 6));
			jaulas.add(new Cachorro ("Mel", 6));
		}
	
		public void cutucar() {
			for (Animal a : jaulas) {
				System.out.println(a.getNome());
				a.emitirSom();
				if(a instanceof Cachorro) {
					((Cachorro) a).correr();
					System.out.println("");
				}
				if(a instanceof Cavalo) {
					((Cavalo) a).correr();
					System.out.println("");
				}
				if(a instanceof Preguica) {
					((Preguica) a).escalarArvore();
					System.out.println("");
				}
			}
		}
		
		public static void main (String args[]) {
			Zoologico meuZoo = new Zoologico();
			meuZoo.cutucar();
		}

}
