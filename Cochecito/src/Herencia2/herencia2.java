package Herencia2;

import javax.swing.JOptionPane;

public class herencia2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		estudiante alumno = new estudiante(19, "Javimessi", "Magisterio");
		
		JOptionPane.showMessageDialog(null,"Nombre: "+alumno.getNombre()+"\nEdad: "+alumno.getEdad()
		+"\nCarrera: "+alumno.getCarrera());
	}

}
