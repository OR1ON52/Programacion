package poo3;

public class Habitacion {

	private int numRoom;
	private String tipo;
	private boolean full;
	
	public int getNumRoom() {
		return numRoom;
	}
	public String getTipo() {
		return tipo;
	}
	public boolean getFull() {
		return full;
	}
	
	public void setNumRoom(int newNumRoom) {
		numRoom = newNumRoom;
	}
	public void setTipo(String newTipo) {
		tipo = newTipo;
	}
	public void setFull(boolean newFull) {
		full = newFull;
	}
}
