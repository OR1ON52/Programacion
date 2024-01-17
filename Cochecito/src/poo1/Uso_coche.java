package poo1;

public class Uso_coche {

	public static void main(String[] args) {
		//Instancio una clase
		
		Coche Subaru = new Coche();
		
		System.out.println(Subaru.getDatosGenerales());
		System.out.println(Subaru.getColor());
		Subaru.setAsientos("si");
		System.out.println(Subaru.getAsientos());

	}

}
