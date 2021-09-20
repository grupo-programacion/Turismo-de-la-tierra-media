package turismodelatierramedia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class urismoDeLaTierraMediatest {

	@Test
	void creacionatraccion() {
		Atraccion c = new Atraccion("Moria", 10, 2, 6, "Aventura");
		assertEquals(c.getCosto(), 10);
		assertEquals(c.getTiempo(), 2);
		assertEquals(c.getTipo(), "Aventura");
		assertEquals(c.getNombre(), "Moria");
	}
	
	@Test
	void creacionusuario() {
		Usuario o = new Usuario("Eowyn", "aventura", 10, 8);
		assertEquals(o.getMonedasDisponibles(), 10);
		assertEquals(o.getTiempoDisponible(), 8);
		assertEquals(o.getPreferencia(), "Aventura");
		assertEquals(o.getNombre(), "Eowyn");
	}
	
	
	@Test
	void haycupo() {
		Atraccion c = new Atraccion("Moria", 10, 2, 6, "Aventura");
		c.agregarPersona();
		c.agregarPersona();
		c.agregarPersona();
		assertEquals(c.hayCupo(), true);
	}
	
	@Test
	void nohaycupo() {
		Atraccion c = new Atraccion("Moria", 10, 2, 6, "Aventura");
		c.agregarPersona();
		c.agregarPersona();
		c.agregarPersona();
		c.agregarPersona();
		c.agregarPersona();
		c.agregarPersona();
		assertEquals(c.hayCupo(), true);
	}

	@Test
	void guardarcomprable() {
		Atraccion c = new Atraccion("Moria", 10, 2, 6, "Aventura");
		Usuario o = new Usuario("Eowyn", "aventura", 10, 8);
		o.guardarComprable(c);
		assertEquals(o.getMonedasGastadas(), 10);
		assertEquals(o.getTiempoGastado(), 2);
		assertEquals(o.getTiempoDisponible(), 6);
		assertEquals(o.getMonedasDisponibles(), 0);
	}
	
}
