package turismodelatierramedia;

public interface comprable {

	public double getCosto();
	
	public String getTipo(); 
	
	public int getTiempo();
	
	public boolean hayCupo();
	
	public boolean esOContiene(comprable compra);
	
	public void agregarPersona();
	
	public String[] getNombre();
		
}
