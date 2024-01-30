package poo5;

public class empleado_main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		empleado empleado3 = new empleado();
		empleado3.setNombre("Mario");
		empleado3.setSueldo(2670.0);
		empleado3.setContractDate(2023,2,9);
		
		empleado empleado4 = new empleado();
		empleado4.setNombre("Carlos");
		empleado4.setSueldo(2100.0);
		empleado4.setContractDate(2022,10,28);
		
		System.out.println("Nombre: "+empleado3.getNombre());
		System.out.println("Fecha de alta: "+empleado3.getContractDate());
		System.out.println("Nombre: "+empleado4.getNombre());
		System.out.println("Fecha de alta: "+empleado4.getContractDate());
		
		
	}

}
