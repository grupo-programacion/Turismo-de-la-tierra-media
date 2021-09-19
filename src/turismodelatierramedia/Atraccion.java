package turismodelatierramedia;

public class Atraccion implements comprable{
	private double costo;
	private String tipo;
	private int duracion;
	private int cupo;
	private String nombre;
    private int personas;
    
	public Atraccion(String nombre, double costo, int duracion, int cupo, String tipo) {
		super();
		this.nombre = nombre;
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

	public String getNombre() {
	 return	this.nombre;
	}
	
	@Override
	public boolean esOContiene(comprable compra) {
      return this.equals(compra) || this.equals(compra);
	}


	
	
}
