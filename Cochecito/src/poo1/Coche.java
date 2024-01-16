package poo1;

public class Coche {
//1. Creo las caracteristicas
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	
	private String color;
	int peso_total;
	boolean asientos_cuero,climatizador;

	//2. Creo un metodo constructor, el cual es un metodo especial que se encarga de dar estado inicial al objeto
	//Debemos usar el mismo nombre que la clase
	public String dime_motor() {
		return "El motor del coche tiene "+motor+" caballos de pontencia";
	}
	
	public void establece_color() {
		color = "rojo";
	}
	public Coche() {
		
		ancho=250;
		largo=400;
		ruedas=4;
		motor=200;
		peso=1900;
	}
}
