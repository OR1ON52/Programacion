package poo1;

public class Coche {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;

	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;

	public Coche() {
		ancho = 2500;
		largo = 4000;
		ruedas = 4;
		motor = 200;
		peso_plataforma = 1900;

	}

	public String dime_motor() {// GETTER

		return "El motor del coche tiene " + motor + " caballos de potencia";

	}

	public void establece_color(String color_coche) {

		color = color_coche;

	}

	public String dime_color() { // GETTER
		return "El color de tu coche es " + color;
	}

	public String dime_datos_generales() {
		return "La plataforma del coche tiene " + ruedas + " ruedas" + ". Mide " + largo / 1000
				+ " metros con un ancho de " + ancho + " centímetros y un peso de plataforma de " + peso_plataforma
				+ " kg";
	}

	public void configura_asientos(String asientos_cuero) {// SETTER
		if (asientos_cuero.equalsIgnoreCase("si")) {// 2. Compara las cadenas con un equals.
			this.asientos_cuero = true;
		} else {
			this.asientos_cuero = false;
		}

	}

	public String dime_asientos() {
		if (asientos_cuero) {

			return "El coche tiene asientos de cuero";

		} else {
			return "Tus asientos son de pena.";
		}

	}
	/*
	 * 1. Vamos a crear los métodos GETTER y SETTER 
	 * para ver si tiene climatizador.
	 * Para ello, hazlo como lo haría un programador: 
	 * con dos clicks. Ve a Source y
	 * a Generate Getters and Setters. 
	 * Revisa que los parámetros en () sean String.
	 */

	public void configura_climatizador(String climatizador) {// SETTER
		if (climatizador.equalsIgnoreCase("si")) {
	// 2. Compara las cadenas con un equals.
			this.climatizador = true;
		} else {
			this.climatizador = false;
		}
	}

	/*
	 * 3. Si has generado el getter y setter con source, 
	 * te va a dar error.
	 * Cerciórate de que el GETTER sea de tipo String, 
	 * no boolean
	 */
	public String dime_climatizador() {
		if (climatizador == true) {
			return "tienes climatizador";
		} else {
			return "no tienes climatizador";
		}

	}

	/*
	 * 4. Vamos a generar una cosa que es un GETTER y 
	 * SETTER a la vez. ESTO ES UNA
	 * COSA QUE NO DEBES HACER, ESTÁ DESACONSEJADO. 
	 * Te lo enseño para que no lo
	 * hagas.
	 */

	public String dime_peso_coche() {
		int pesoCarroceria = 500;
		peso_total = peso_plataforma + pesoCarroceria;

		if (asientos_cuero == true) {
			peso_total = peso_total + 50;
		}
		if (climatizador == true) {
			peso_total = peso_total + 20;
		}

		return "El peso del coche es " + peso_total;
		/*
		 * 5. Esto es un SETTER y GETTER a la vez 
		 * porque estamos estableciendo el valor
		 * de la variable peso_total y por otro 
		 * lado le pedimos que nos dé un dato, es
		 * decir, hace ambas funciones de un SETTER y GETTER
		 */
	}

	/*
	 * 6. Ahora vamos a definir el precio del coche. 
	 * No es igual si tu coche tiene
	 * asientos de cuero o si es el coche de los Picapiedra:
	 * https://imagenes.20minutos.es/files/image_990_auto/uploads/imagenes/2017/04/
	 * 03/451520.jpg
	 */

	public int precio_coche() {// GETTER

		int precio_final = 10000;

		if (asientos_cuero == true) {
			precio_final += 2000;
//7. recuerda que lo de arriba es igual a esto:
			// precio_final = precio_final + 2000;
		}
		if (climatizador == true) {
			precio_final += 1500;
		}
		return precio_final;
		/* 8. Una vez acabado este código, 
		 * vamos al Main, Uso_Coche */
	}

}




