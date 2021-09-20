package turismodelatierramedia;

public class Usuario {
	private int tiempo;
	private double monedas;
	private String preferencia;
	private comprable[]sugerenciadiaria;
	private int horasnecesarias;
	private double monedasnecesarias;
	private int contador;
	private String nombre;
	
	public Usuario(String nombre,String preferencia, double monedas, int tiempo) {
		super();
		this.tiempo = tiempo;
		this.monedas = monedas;
		this.preferencia = preferencia;
		this.nombre = nombre;
	}

	public int getTiempoDisponible() {
		return tiempo;
	}

	public void restarTiempo(int duracion) {
	    this.tiempo= tiempo - duracion;
	}
	
	public double getMonedasDisponibles() {
		return monedas;
	}

    public void restarMonedas(double precio) {
    this.monedas= monedas - precio;
    }

	public String getPreferencia() {
		return preferencia;
	}

	public comprable[] getSugerenciaDiaria() {
		return sugerenciadiaria;
	}
	
	public void imprimirItinerario() {
		System.out.println(this.horasnecesarias);
		System.out.println(this.monedasnecesarias);
		while (contador <= this.sugerenciadiaria.length) {
		 	System.out.println(this.sugerenciadiaria[contador]);
		 	contador++;}
	}
	
	public boolean puedeComprar(comprable compra) {
		return this.getMonedasDisponibles()>= compra.getCosto() && this.getTiempoDisponible()>= compra.getTiempo() && compra.hayCupo();
	}
	
	public double getMonedasGastadas() {
		return this.monedasnecesarias;
	}
	
	public int getTiempoGastado() {
	    return this.horasnecesarias;
	}	
	
	public void guardarComprable(comprable compra) {
		this.sugerenciadiaria[contador] = compra;
		this.restarMonedas(compra.getCosto());
		this.restarTiempo(compra.getTiempo());
		this.horasnecesarias += compra.getTiempo();
		this.monedasnecesarias += compra.getCosto();
		contador++;
	}
	
    public String getNombre() {
    	return this.nombre;
    }
}
