package Herencia3;

public class perro extends animal{

	String ladrar = "Este animal ladra";
	
	public perro(String ladrar, String sonido) {
		super(sonido);
		this.sonido = ladrar;
	}

	public String getLadrar() {
		return ladrar;
	}

	public void setLadrar(String ladrar) {
		this.ladrar = ladrar;
	}
	
}
