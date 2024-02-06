package Herencia;

public class automovil extends vehiculo{

	int hp;
	String traccion;
	

	public automovil(int hp, String traccion, String marca, String modelo, int year) {
		super(marca,modelo,year);
		this.hp = hp;
		this.traccion = traccion;
	}





	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public String getTraccion() {
		return traccion;
	}


	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	
}
