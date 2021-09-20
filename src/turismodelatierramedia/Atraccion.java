package turismodelatierramedia;

public class Atraccion implements comprable{
	private double costo;
	private String tipo;
	private int duracion;
	private int cupo;
	protected String[] nombre;
    private int personas;
    private int contador;

    
	public Atraccion(String nombre, double costo, int duracion, int cupo, String tipo) {
		super();
		this.nombre[0] = nombre;
		this.costo = costo;
		this.tipo = tipo;
		this.duracion = duracion;
		this.cupo = cupo;
	}
	
	public double getCosto() {
		return costo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public int getTiempo() {
		return duracion;
	}
	
	public boolean hayCupo() {
		return cupo > personas;
	}
	
	public void agregarPersona() {
			personas++;
	}

	public String[] getNombre() {
	 return	this.nombre;
	}
	
	@Override
	public boolean esOContiene(comprable compra) {
	boolean J = false;
	while (contador <= compra.getNombre().length) {
		J =	this.nombre.equals(compra.getNombre()[contador]);
	 contador++;
	 }
	return J;
    }
	

}
