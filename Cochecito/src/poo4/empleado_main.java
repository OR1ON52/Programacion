package poo4;

import javax.swing.JOptionPane;

public class empleado_main {

	public static void main(String[] args) {
		
		empleado trabajador = new empleado();
		String [] nombre = new String [5];
		int [] horas = new int [5];
		int [] sueldo = new int [5];
		String transformer;
		String transformer2;
		
		int id_nombre = 0;
		int id_horas = 0;
		int id_sueldo = 0;
		int tarifa = 0;
		
		transformer2 = (JOptionPane.showInputDialog("Introduce el sueldo por hora para los empleados ")); 
		trabajador.setTarifa(Integer.parseInt(transformer2));
		tarifa = trabajador.getTarifa();
		
		for(int i=0;i<5;i++) {
		trabajador.setNombre(JOptionPane.showInputDialog("Introduce el nombre del empleado "+(id_nombre+1)));
		nombre [id_nombre] = trabajador.getNombre();
		id_nombre++;
		
		transformer = (JOptionPane.showInputDialog("Introduce las horas trabajadas del empleado "+(id_horas+1)));
		trabajador.setHoras(Integer.parseInt(transformer));
		horas[id_horas] = trabajador.getHoras();
		id_horas++;
		
		
		sueldo[id_sueldo] = horas[id_sueldo]*tarifa;
		trabajador.setSueldo(sueldo[id_sueldo]);
		id_sueldo++;
		}
		
		
		for(int i=0;i<5;i++) {
		System.out.print("Nombre del alumno: "+nombre[i]+"\n");
		System.out.print("Sueldo del empleado: "+sueldo[i]+"€\n\n");
		
		}
	}

}
