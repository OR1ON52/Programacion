package Herencia;

import javax.swing.JOptionPane;

public class herencia {

	public static void main(String[] args) {
		
		automovil auto = new automovil(600, "trasera", "Porsche", "911 GT", 2022);

		JOptionPane.showMessageDialog(null,"Marca: "+auto.getMarca()+"\nModelo: "+auto.getModelo()
		+"\nAño: "+auto.getYear()+"\nCV: "+auto.hp+"\nTracción: "+auto.getTraccion());
	}

}
