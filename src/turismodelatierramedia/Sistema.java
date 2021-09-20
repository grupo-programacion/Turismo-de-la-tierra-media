package turismodelatierramedia;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Sistema {
	private static List<comprable> compras;
	
	public void sugerirComprable(comprable[] compras) {
		System.out.println("Leer\n");
		compras = Lectordearchivos.leerArchivoAtraccion();
		
		for(comprable v : compras) System.out.println(v);

		System.out.println("\nOrdenar\n");
		
		compras.sort(new ComparadorDeComprables());
		
		for(comprable v : compras) {
		if(Usuario.puedeComprar(v))
				System.out.println(v);
		}
}
	
	public void guardarComprable(comprable compras, Usuario user) {
		user.guardarComprable(compras);
		compras.agregarPersona();
	}
		
}