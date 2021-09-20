package turismodelatierramedia;

public class Promocionaxb extends Promocion implements comprable {

	private String tipopromocion;
	private Atraccion[] atracciones;
	private Atraccion atracciongratuita;
	private int contador;
	private Atraccion[] totalatracciones;
	
	public Promocionaxb(String tipopromocion, Atraccion[] atracciones, Atraccion atracciongratuita) {
    	this.tipopromocion =  tipopromocion;
        this.atracciones = atracciones;
        this.atracciongratuita = atracciongratuita;
	}

@Override
public Atraccion[] getAtracciones() {
	while (contador <= this.atracciones.length) {
		totalatracciones[contador] = this.atracciones[contador];
		contador++;
	}
	totalatracciones[contador] = atracciongratuita;
	return totalatracciones;
}

public String getTipo() {
	return tipopromocion;
}
}