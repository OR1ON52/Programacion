package poo5;

public class empleado_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		empleado empleado1 = new empleado();
		empleado1.setNombre("Adrián");
		empleado1.setSueldo(3000.0);
		empleado1.setContractDate(2022,1,1);
		
		System.out.println("Nombre: "+empleado1.getNombre());
		System.out.println("Sueldo: "+empleado1.getSueldo()+"€");
		System.out.println("Fecha de alta: "+empleado1.getContractDate());
	}

}
