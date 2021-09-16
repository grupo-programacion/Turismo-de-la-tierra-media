package turismodelatierramedia;

public class Sistema {

	public void sugerirComprable(String[] args) {
		
		private static List<comprable> compras;
		
		System.out.println("Leer\n");
		comprables = Lectordearchivos.leerArchivoUsuarios();
		
		for(comprable I : comprables) System.out.println(v);

		System.out.println("\nOrdenar\n");

		
		comprables.sort(new ComparadorDeComprables(comprables.getTipo()));
		
		for(comprable v :comprables) {
				System.out.println(v);
		}
		
		System.out.println("\nEscribir\n");
	}
	
	public void guardarComprable(comprable compras, Usuario user) {
		user.guardarComprable(compras);
		compras.agregarPersona();
	}
		
}