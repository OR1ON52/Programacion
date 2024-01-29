package poo5;

public class empleado_main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		empleado empleado2 = new empleado();
		empleado2.setNombre("Carlos");
		empleado2.setSueldo(2400.0);
		empleado2.setContractDate(2021,6,18);
		
		System.out.println("Nombre: "+empleado2.getNombre());
		System.out.println("Fecha de alta: "+empleado2.getContractDate());
		System.out.println("Sueldo: "+empleado2.getSueldo()+"€");
		
		double nuevoSueldo = empleado2.getSueldo()*1.1;
		empleado2.setSueldo(nuevoSueldo);
		
		System.out.println("Nuevo sueldo (+10%): "+empleado2.getSueldo()+"€");
	}

}
