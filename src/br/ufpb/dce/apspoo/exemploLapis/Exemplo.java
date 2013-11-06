package br.ufpb.dce.apspoo.exemploLapis;

import br.ufpb.dce.apspoo.exemploquadro.Cor;
import br.ufpb.dce.apspoo.exemploquadro.Quadro;

public class Exemplo {
	
	public static void main(String[] args) {
		Quadro q = new Quadro(200,100,new Cor(255,255,255));
		LapisPentel p = new LapisPentel();
		q.riscar(p, 30, 30);
	}

}
