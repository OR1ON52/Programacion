package poo1;

public class uso_reloj {

	public static void main(String[] args) {
		
		Reloj Casio = new Reloj();
		if(Casio.digital==true) {
			System.out.println("Digital: Si");
		} else {
			System.out.println("Digital: No");
		}
		
		System.out.println("Precio: "+Casio.precio);

	}

}
