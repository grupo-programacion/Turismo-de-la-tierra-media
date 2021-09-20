package turismodelatierramedia;

public class Promocionporcentual extends Promocion implements comprable {

private String tipopromocion;
private Atraccion[] atracciones;
private int contador;
private double descuento;


	public Promocionporcentual(String tipopromocion, Atraccion[] atracciones, double descuento) {
	 this.tipopromocion =  tipopromocion;
     this.atracciones = atracciones;
     this.descuento = descuento;
	}
 
 @Override
 public double calcularCostopromocion() {
	 double F = 0;
 	while (contador <= this.atracciones.length) {
 	F += this.atracciones[contador].getCosto();
 	contador++;}
 	return F - (F * descuento / 100);
 }

 public String getTipo() {
		return tipopromocion;
	}
 
}
