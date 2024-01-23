package poo4;

import javax.swing.JOptionPane;

public class estudiante_main {

	public static void main(String[] args) {
		estudiante Perello = new estudiante();
		String [] nombre = new String [3];
		int [] edad = new int [3];
		int [] grado = new int [3];
		String transformer;
		String transformer2;
		
		int id_nombre = 0;
		int id_edad = 0;
		int id_grado = 0;
		
		for(int i=0;i<3;i++) {
		Perello.setNombre(JOptionPane.showInputDialog("Introduce el nombre del alumno "+(id_nombre+1)));
		nombre [id_nombre] = Perello.getNombre();
		id_nombre++;
		
		transformer = (JOptionPane.showInputDialog("Introduce la edad del alumno "+(id_edad+1)));
		Perello.setEdad(Integer.parseInt(transformer));
		edad[id_edad] = Perello.getEdad();
		id_edad++;
		
		transformer2 = (JOptionPane.showInputDialog("Introduce el grado del alumno "+(id_grado+1))); 
		Perello.setGrado(Integer.parseInt(transformer2));
		grado[id_grado] = Perello.getGrado();
		id_grado++;
		}
		
		for(int i=0;i<3;i++) {
		System.out.print("Nombre del alumno: "+nombre[i]+"\n");
		System.out.print("Edad del alumno: "+edad[i]+"\n");
		System.out.print("Grado del alumno: "+grado[i]+"º\n\n");
		}
	}

}
