package br.ufpb.dce.apspoo.exemploLapis;

import br.ufpb.dce.apspoo.exemploquadro.Cor;
import br.ufpb.dce.apspoo.exemploquadro.Riscador;

public class LapisPentel implements Riscador{
	
	private Cor cor;
	
	private int espessura;
	
	public LapisPentel(){
		this.cor = new Cor(30,30,30);
		this.espessura = 3;
	}

	@Override
	public Cor getCor() {
		return this.cor;
	}

	@Override
	public int getEspessura() {
		return this.espessura;
	}

}
