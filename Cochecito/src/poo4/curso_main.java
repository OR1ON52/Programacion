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
		do {
			String notaInput = JOptionPane.showInputDialog("Introduce la nota de la asignatura.");
		clase.setNota(Double.parseDouble(notaInput));
		if(clase.getNota()<0) {
			System.out.println("ERROR:La nota no puede ser inferior a 0");
		} else {
			break;
		}
		} while(clase.getNota()<0);
		
		nota [id_asignatura] = clase.getNota();
		id_asignatura++;
			} else if(opcion==2 && asignatura[0]!=null){
				salirNotas = true;
				break;
			} else if(opcion==2 && asignatura[0]==null){
				
				JOptionPane.showInputDialog("ERROR:No se ha registrado ninguna nota aún.\nPara agregar una asignatura pulsa 1. Para ver el boletín de notas pulsa 2.");
			} else {
				JOptionPane.showInputDialog("ERROR:Valor inválido, por favor seleccione una opción.\\nPara agregar una asignatura pulsa 1. Para ver el boletín de notas pulsa 2.");
			}
		} while(!salirNotas);
		
		for (int i=0;i<10;i++) {
			if(asignatura[i]!=null) {
				System.out.println("Asignatura: "+asignatura[i]);
				if(nota[i]<5) {
					System.out.println("Nota: F");

				} else if(nota[i]>=5.0 && nota[i]<6.0) {
					System.out.println("Nota: D");
				} else if(nota[i]>=6.0 && nota[i]<7.0) {
					System.out.println("Nota: C");
				} else if(nota[i]>=7.0 && nota[i]<8.0) {
					System.out.println("Nota: B");
				} else if(nota[i]>=8.0 && nota[i]<9.0) {
					System.out.println("Nota: A");
				} else if(nota[i]>=9.0 && nota[i]<10.0) {
					System.out.println("Nota: A+");
				} else {
					System.out.println("Nota: S");
				}
							}
		}
		
	}

}
