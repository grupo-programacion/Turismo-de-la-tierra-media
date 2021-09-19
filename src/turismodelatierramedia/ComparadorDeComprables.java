package turismodelatierramedia;

import java.util.Comparator;

public class ComparadorDeComprables implements Comparator<comprable>{
	private String preferencia;
	
	public ComparadorDeComprables(Usuario user) {
		this.preferencia = user.getPreferencia();
	}

	@Override
	public int compare(comprable v1, comprable v2) {

		if(this.preferencia == v1.getTipo() 
				&& this.preferencia != v2.getTipo()) 
			return -1;
		else if(this.preferencia != v1.getTipo() 
				&& this.preferencia == v2.getTipo()) 
			return 1;
		else {
			if(v1.getCosto() > v2.getCosto()) 
				return -1;
			else if(v1.getCosto() < v2.getCosto()) 
				return 1;
			else if (v1.getTiempo() > v2.getTiempo())
				return -1;
			else if (v1.getTiempo() < v2.getTiempo())
				return 1;
			else 
				return 0;
		}
	}
}

