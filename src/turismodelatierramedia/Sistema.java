package turismodelatierramedia;

public class Sistema {

	public void sugerirComprable() {}
	
	public void guardarComprable(comprable compras, Usuario user) {
		user.guardarComprable(compras);
		compras.agregarPersona();
	}
		
}
