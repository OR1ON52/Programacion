package poo1;

public class Coche {
//1. Creo las caracteristicas
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	
	private String color;
	private int peso_total;
	private boolean asientos_cuero,climatizador;

	//2. Creo un metodo constructor, el cual es un metodo especial que se encarga de dar estado inicial al objeto
	//Debemos usar el mismo nombre que la clase
	public int getRuedas() {
		return ruedas;
	}
	public int getLargo() {
		return largo;
	}
	public double getAncho() {
		return ancho;
	}
	public int getMotor() {
		return motor;
	}
	public int getPesoPlat() {
		return pesoPlataforma;
	}
	public String getColor() {
		return color;
	}
	public int peso_total() {
		return peso_total;
	}
	public boolean asientos_cuero() {
		return asientos_cuero;
	}
	public boolean climatizador() {
		return climatizador;
	}
	
	
	public void setColor(String color_coche) {
		color = color_coche;
	}
	public void setRuedas(String color_coche) {
		color = color_coche;
	}
	public void setLargo(String largo_coche) {
		color = largo_coche;
	}
	public void setAncho(String ancho_coche) {
		color = ancho_coche;
	}
	public void setMotor(String motor_coche) {
		color = motor_coche;
	}
	public void setPeso(String peso_coche) {
		color = peso_coche;
	}
	
	public String getDatosGenerales() {
		return "La plataforma del coche tiene "+ruedas+" ruedas. Mide "
	+largo/1000+" metros con un ancho de "+ancho+" centímetros y un peso de plataforma de "
	+pesoPlataforma+" kg.";
	}
	
	public void setAsientos(String asientos_cuero) {
		if(asientos_cuero=="Si") {
			this.asientos_cuero=true;
		}else {
			this.asientos_cuero=false;
		}
	}
	public String getAsientos() {
		if(asientos_cuero==true) {
			return "El coche tiene asientos de cuero";
		}else {
			return "Tus asientos dan pena";
		}
	}
	public Coche() {
		
		ancho=250;
		largo=400;
		ruedas=4;
		motor=200;
		pesoPlataforma=1900;
	}
}
