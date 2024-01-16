package poo1;

public class Coche {
//1. Creo las caracteristicas
	int ruedas;
	int largo;
	int ancho;
	int motor;
	int peso;

	//2. Creo un metodo constructor, el cual es un metodo especial que se encarga de dar estado inicial al objeto
	//Debemos usar el mismo nombre que la clase
	
	public Coche() {
		
		ancho=250;
		largo=400;
		ruedas=4;
		motor=200;
		peso=1900;
	}
}
