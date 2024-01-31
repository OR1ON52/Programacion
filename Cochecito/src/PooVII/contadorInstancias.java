package PooVII;

import javax.swing.JOptionPane;

public class contadorInstancias {

	private static int contadorInstancias = 0;
	
	public static int getInstancias() {
		return contadorInstancias;
	}
	
	public contadorInstancias() {
		contadorInstancias++;
	}
	
	public static void main(String[] args) {
		contadorInstancias ci = new contadorInstancias();
		
		JOptionPane.showMessageDialog(null, "Hay "+ci.getInstancias()+" instancias creadas.");
	}
	
	

}
