package turismodelatierramedia;

public class Promocion implements comprable{

	private String tipopromocion;
    private comprable[] atracciones;
    private double costopromocion;
	
    
    public Promocion(String tipopromocion, comprable[] atracciones, double costopromocion) {
		super();
		this.tipopromocion = tipopromocion;
		this.atracciones = atracciones;
		this.costopromocion = costopromocion;
	}

	public double getCosto() {
		return costopromocion;
	}
	
    public comprable[] getAtracciones() {
		return atracciones;
	}
    
    public void calcularCostopromocion() {}

	public String getTipo() {
		return tipopromocion;
	}

	@Override
	public int getTiempo() {
	for (int I = 1; this.atracciones.sort(); I++) {	
	; }
		return 0;
	}

	@Override
	public boolean hayCupo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean esOContiene(comprable compra) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void agregarPersona() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
