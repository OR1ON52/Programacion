package Herencia2;

public class estudiante extends persona{

	String carrera;
	public estudiante(int edad, String nombre,String carrera) {
		super(edad, nombre);
		this.carrera = carrera;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
 
}

	
