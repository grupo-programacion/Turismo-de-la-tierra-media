package turismodelatierramedia;

public class Promocion implements comprable{

	private String tipopromocion;
    private Atraccion[] atracciones;
    private int contador;
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
    	while (contador <= this.atracciones.length) {
    	F += this.atracciones[contador].getCosto();
    	contador++;}
    	return F;
    }

	public String getTipo() {
		return tipopromocion;
	}

	@Override
	public int getTiempo() {
	while (contador <= this.atracciones.length) {	
	tiempodeproomocion += this.atracciones[contador].getTiempo(); 
	contador++;
	}
		return tiempodeproomocion;
	}

	@Override
	public boolean hayCupo() {
	boolean E = true;
	while (contador <= this.atracciones.length) {
	E = this.atracciones[contador].hayCupo();
	contador++;
	}
	return E; 
}

	@Override
	public boolean esOContiene(comprable compra) {
		boolean J = false;
		while (contador <= compra.getNombre().length) {
			J =	this.nombres[contador].equals(compra.getNombre()[contador]);
		 contador++;
		 }
		return J;
	}

	@Override
	public void agregarPersona() {
		while (contador < this.atracciones.length) {
			this.atracciones[contador].agregarPersona();
			contador++;
	}
}

	public String[] getNombre() {
		while (contador <= this.atracciones.length) {
		nombres[contador] = this.atracciones[contador].nombre[0];
		contador++;
	}
		return nombres;
  }
}