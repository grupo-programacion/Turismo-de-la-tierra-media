package turismodelatierramedia;

public class Promocionaxb extends Promocion implements comprable {

	private String tipopromocion;
	private Atraccion[] atracciones;
	private Atraccion atracciongratuita;
	private int I;
	private Atraccion[] L;
	
	public Promocionaxb(String tipopromocion, Atraccion[] atracciones, Atraccion atracciongratuita) {
    	this.tipopromocion =  tipopromocion;
        this.atracciones = atracciones;
        this.atracciongratuita = atracciongratuita;
	}

@Override
public Atraccion[] getAtracciones() {
	while (I <= this.atracciones.length) {
		L[I] = this.atracciones[I];
		I++;
	}
	L[I] = atracciongratuita;
	return L;
}

public String getTipo() {
	return tipopromocion;
}
}