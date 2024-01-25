package poo5;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class empleado {

	private String nombre;
	private double sueldo;
	private Calendar contractDate;
	public String getNombre() {
		return nombre;
	}
	public String getContractDate() {
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		return date.format(this.contractDate.getTime());
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public void setContractDate(int year,int month,int day) {
		this.contractDate = Calendar.getInstance();
		this.contractDate.set(year, month-1, day);
	}
	
	
}
