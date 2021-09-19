package turismodelatierramedia;

public class Promocion implements comprable{

	private String tipopromocion;
    private Atraccion[] atracciones;
    private double costopromocion;
	private int I;
    private int tiempodeproomocion;
	private String[] nombres;
    

	public double getCosto() {
		return this.calcularCostopromocion();
	}
	
    public Atraccion[] getAtracciones() {
    	return atracciones;
	}
    
    public double calcularCostopromocion() {
     double F = 0;
    	while (I <= this.atracciones.length) {
    	F += this.atracciones[I].getCosto();
    	I++;}
    	return F;
    }

	public String getTipo() {
		return tipopromocion;
	}

	@Override
	public int getTiempo() {
	while (I <= this.atracciones.length) {	
	tiempodeproomocion += this.atracciones[I].getTiempo(); 
	I++;
	}
		return tiempodeproomocion;
	}

	@Override
	public boolean hayCupo() {
	boolean E = true;
	while (I <= this.atracciones.length) {
	E = this.atracciones[I].hayCupo();
	I++;
	}
	return E; 
}

	@Override
	public boolean esOContiene(comprable compra) {
		return this.equals(compra) || this.equals
	}

	@Override
	public void agregarPersona() {
		while (I < this.atracciones.length) {
			this.atracciones[I].agregarPersona();
			I++;
	}
}

	public String[] getNombre() {
		while (I <= this.atracciones.length) {
		nombres[I] = this.atracciones[I].getNombre();
		I++;
	}
		return nombres;
  }
}