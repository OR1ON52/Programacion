package poo4;

import javax.swing.JOptionPane;

public class contacto_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		contacto agenda = new contacto();
		String [] name = new String [10];
		int [] Telefono = new int [10];
		String [] gmail = new String [10];
		boolean salir = false;
		int r = 0;
		boolean found = true;
		
		do {
			String option=JOptionPane.showInputDialog("Para añadir un contacto pulsa 1. Para buscar un contacto pulsa 2. Para acceder a la agenda pulsa 3");
			
			switch(Integer.parseInt(option)) {
			case 1:
				agenda.setNombre(JOptionPane.showInputDialog("Introduzca el nombre del contacto"));
				name [r] = agenda.getNombre();
				String convertor = JOptionPane.showInputDialog("Introduzca el número de telefono del contacto");
				agenda.setTelefono(Integer.parseInt(convertor));
				Telefono[r] = agenda.getTelefono();
				agenda.setEmail(JOptionPane.showInputDialog("Introduzca el correo electrónico del contacto"));
				gmail [r] = agenda.getEmail();
				System.out.println("Contacto añadido correctamente a la agenda");
				r++;
			    break;
			    
			case 2:
				String papyrus = JOptionPane.showInputDialog("Introduzca el nombre del contacto");
				for(int i=0;i<name.length;i++) {
					if(papyrus.equalsIgnoreCase(name[i])) {
						System.out.println("Nombre del contacto: "+name[i]);
						System.out.println("Telefono: "+Telefono[i]);
						System.out.println("Correo electrónico: "+gmail[i]);
						found = true;
						break;
					} else {
						found = false;
					}
				}
				if(!found) {
					System.out.println("No se encuentra ningún contacto con ese nombre");
				}
			
			case 3:
				if(name[0]==null) {
					System.out.println("La agenda está vacía");
					break;
				} else {
					salir = true;
					break;
				}
			default:
				System.out.println("ERROR: Valor no válido.");
				break;
			}
			
			
		} while (!salir);
 
		for(int i=0;i<name.length;i++) {
			if(name[i]!=null) {
				System.out.println("Nombre: "+name[i]);
			System.out.println("Teléfono: "+Telefono[i]);
			System.out.println("Correo electrónico: "+gmail[i]+"\n");
			}
	}
 
}

}
