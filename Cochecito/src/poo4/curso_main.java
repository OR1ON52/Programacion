package poo4;

import javax.swing.JOptionPane;

public class curso_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		curso clase = new curso();
		String [] asignatura = new String[10];
		double [] nota = new double [10];
		
		int id_asignatura = 0;
		boolean salirNotas = false;
        int opcion = 0;
        
		
		do {
			String opcionInput = JOptionPane.showInputDialog("Para agregar una asignatura pulsa 1. Para ver el boletín de notas pulsa 2.");
			opcion = Integer.parseInt(opcionInput);
			
			if(opcion==1) {
			clase.setAsignatura(JOptionPane.showInputDialog("Introduce el nombre de la asignatura."));
		asignatura[id_asignatura] = clase.getAsignatura();
		String notaInput = JOptionPane.showInputDialog("Introduce la nota de la asignatura.");
		clase.setNota(Integer.parseInt(notaInput));
		nota [id_asignatura] = clase.getNota();
		id_asignatura++;
			} else if(opcion==2 && asignatura[0]!=null){
				salirNotas = true;
				break;
			} else if(opcion==2 && asignatura[0]==null){
				
				JOptionPane.showInputDialog("ERROR:Opción inválida. Por favor introduzca un valor correcto.\nPara agregar una asignatura pulsa 1. Para ver el boletín de notas pulsa 2.");
			}
		} while(!salirNotas);
		
		for (int i=0;i<10;i++) {
			if(asignatura[i]!=null) {
				System.out.println("Asignatura: "+asignatura[i]);
				System.out.println("Nota: "+nota[i]);
			}
		}
		
	}

}
