package turismodelatierramedia;

public class Promocionabsoluta extends Promocion implements comprable {

	private String tipopromocion;
	private Atraccion[] atracciones;
	private double precio;
	
	public Promocionabsoluta(String tipopromocion, Atraccion[] atracciones, double precio) {
    	this.tipopromocion =  tipopromocion;
        this.atracciones = atracciones;
        this.precio = precio;
	}

@Override
public double getCosto() {
	return this.precio;
}
	
public String getTipo() {
	return tipopromocion;
}

public Atraccion[] getAtracciones() {
	return atracciones;
}
}
