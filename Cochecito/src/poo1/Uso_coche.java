package poo1;

import javax.swing.JOptionPane;

public class Uso_coche {

	public static void main(String[] args) {

		Coche Subaru = new Coche();
/*13. Establece los JOption en los lugares en donde 
 * tienes hardcodeadas las características.*/
		
		//Subaru.establece_color("Amarillo");
		Subaru.establece_color(JOptionPane.
				showInputDialog("Introduce el color"));
		
		System.out.println(Subaru.dime_color());
		//Subaru.configura_asientos("no");
		Subaru.configura_asientos(JOptionPane.
				showInputDialog("Tienes asientos de cuero"));
		System.out.println(Subaru.dime_asientos());
		
/* 9. Antes de empezar, deberías tener exactamente lo de arriba. */
/*10. Añade la info que ves a continuación:*/
		//Subaru.configura_climatizador("si");
		Subaru.configura_climatizador(JOptionPane.
		showInputDialog("¿Tienes climatizador o sos un motochorro?"));
		System.out.println(Subaru.dime_climatizador());
		System.out.println(Subaru.dime_peso_coche());
		System.out.println("El precio final del coche es " + 
		Subaru.precio_coche());
/*11. Ahora vamos a pedir los datos de manera más bonita.*/
	}

}
